package org.sourceforge.mbeanmonitoring.report;

/**
 **      Author:
 **              Laurent Le Grandois <Laurent.Le.Grandois@gmail.com>
 **              Gilles Bardouillet  <Gilles.Bardouillet@gmail.com>
 **
 **  This program is free software; you can redistribute it and/or modify
 ** it under the terms of the GNU General Public License as published by
 **  the Free Software Foundation; either version 2 of the License, or
 **  (at your option) any later version.
 **
 ** This program is distributed in the hope that it will be useful,
 **  but WITHOUT ANY WARRANTY; without even the implied warranty of
 **  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 **  GNU General Public License for more details.
 **
 **  You should have received a copy of the GNU General Public License
 ** along with this program; if not, write to the Free Software
 **
 */
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.PropertyConfigurator;
import org.jboss.security.SecurityAssociation;
import org.jboss.security.SimplePrincipal;
import org.sourceforge.mbeanmonitoring.report.castor.Mbean;
import org.sourceforge.mbeanmonitoring.report.castor.ServerParam;
import org.sourceforge.mbeanmonitoring.report.castor.Stat;
import org.sourceforge.mbeanmonitoring.report.castor.types.ServerParamTypeType;

public class Capture {

	ServerParam params;

	static String KEY_MBEAN_FILE = "MBean.filename";
	static String KEY_MBEAN_NAME = "name";
	static String KEY_MBEAN_ATTRS = "attrs";
	static String KEY_MBEAN_REGS = "regs";
	static String KEY_APPENDER = "appender";

	static String CURRENT_DIRECTORY = "current";

	static boolean isGraphRuntime = false;
	static String mbeanMonitorLoggerName = "mbeanmonitor";

	private MBeanServerConnection mBeanServer;
	private Properties[] infos;

	private static Properties log4j;

	private String getFileName(String mbeanName) {
		return mbeanName.replace('.', '_').replace(':', '_').replace('=', '_').replace('/', '_').replace(',', '_');
	}

	private Properties setLogs() {
		// --- LOG4J parametres --------------------------------------------
		boolean succes = false;
		String folder = this.params.getGenereTo() + System.getProperty("file.separator") + CURRENT_DIRECTORY;

		if (!Capture.isGraphRuntime) {
			// test if log folder exist
			File folderFile = new File(folder);
			// test if current folder exist
			if (folderFile != null || folderFile.exists()) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy.hh_mm_ss");
				Date date = new Date();
				String folderArchive = sdf.format(date);// + "." + fichierXML;
				succes = folderFile.renameTo(new File(this.params.getGenereTo() + System.getProperty("file.separator")
						+ folderArchive));
				if (!succes)
					System.out.println("CAN NOT RENAME FOLDER " + folderFile.getName());
			}
			File currentRep = new File(folder);
			if (currentRep != null || !currentRep.exists()) {
				succes = currentRep.mkdirs();
				if (!succes)
					System.out.println("CAN NOT CREATE FOLDER " + folderFile.getName());
			}
		}

		Properties properties = new Properties();
		
		for (int i = 0; i < infos.length; i++) 
		{
			String mbeanName = this.infos[i].getProperty(KEY_MBEAN_NAME);
			String fileName = this.infos[i].getProperty(KEY_MBEAN_FILE, mbeanName);
			System.out.println("Fichier = " + fileName);

			String appender = "log4j.appender." + this.infos[i].getProperty(KEY_APPENDER);
			properties.put("log4j.category." + this.infos[i].getProperty(KEY_APPENDER), "DEBUG, "
					+ this.infos[i].getProperty(KEY_APPENDER));
			properties.put(appender, "org.apache.log4j.RollingFileAppender");
			properties.put(appender + ".File", folder + "/" + fileName + "." + this.params.getExtension());
			properties.put(appender + ".layout", "org.apache.log4j.PatternLayout");
			properties.put(appender + ".layout.ConversionPattern", "%d{dd/MM/yyyy" + this.params.getSeparateur()
					+ "HH:mm:ss}" + this.params.getSeparateur() + "%m%n");
			properties.put(appender + ".MaxFileSize", this.params.getMaxFileSize());
			properties.put(appender + ".MaxBackupIndex", Integer.valueOf(this.params.getMaxBackupIndex()).toString());
		}
		
		//Add my own logger
		String appender = "log4j.appender." + mbeanMonitorLoggerName;
		properties.put("log4j.category." + mbeanMonitorLoggerName, "INFO, " + mbeanMonitorLoggerName);
		properties.put(appender, "org.apache.log4j.RollingFileAppender");
		
		
		String file = System.getProperty("LoggerFileName") != null ?System.getProperty("LoggerFileName") : mbeanMonitorLoggerName;
		File f = new File(this.params.getGenereTo()+File.separatorChar+file + ".log");
		properties.put(appender + ".File", f.getAbsolutePath());
		System.out.println("Writing mbeanmonitor log to "+f.getAbsolutePath());
		properties.put(appender + ".layout", "org.apache.log4j.PatternLayout");
		properties.put(appender + ".layout.ConversionPattern", "%d{dd/MM/yyyy" + this.params.getSeparateur()
				+ "HH:mm:ss}" + this.params.getSeparateur() + "%m%n");
		properties.put(appender + ".MaxFileSize", this.params.getMaxFileSize());
		properties.put(appender + ".MaxBackupIndex", Integer.valueOf(this.params.getMaxBackupIndex()).toString());
		
		return properties;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	// Get the parameters from the XML file ${xmlfile}
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	private Reader getUserParameters(String fileName) {
		if (fileName != null) {
			return this.getParametersFromXMLFile(fileName);
		}
		return null ;
	}

	private Reader getParametersFromXMLFile(String fileName) {
		System.out.println("Filename : " + fileName);
		FileReader file = null;
		try {
			file = new FileReader(fileName);
			String name = new File(fileName).getName();
			int point = name.indexOf(".");
			if (point != -1)
				name = name.substring(0,point);
			mbeanMonitorLoggerName += "-"+name;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

	public Capture() {
		this(null);
	}

	public Capture(String fileName) {
		// Get the parameters from XML file(s)

		try {
			// read the user parameters
			System.out.println("Try to read the customized parameters from: " + fileName);
			ServerParam custoParams = new ServerParam();
			custoParams = ServerParam.unmarshal(getUserParameters(fileName));

			custoParams.validate();

			this.params = custoParams;
		} catch (Exception e) {
			e.printStackTrace();
			this.params = null;
		}

		try 
		{
			if (this.params.getType() == ServerParamTypeType.JNP)
			{
				//JBoss Stuff
				// Get the JNDI propreties, get the JNDI Context, then get the RMI Adaptor

				Properties jndiProps = new Properties();
				jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
				jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
				
				String jndiserverurl = "jnp://" + this.params.getHost() + ":" + this.params.getPort();
				jndiProps.put(Context.PROVIDER_URL, jndiserverurl);
			
				if (this.params.getUser() != null)
					SecurityAssociation.setPrincipal(new SimplePrincipal(this.params.getUser()));
				if (this.params.getPassword() != null)
					SecurityAssociation.setCredential(this.params.getPassword());
				
				// Get the JNDI Context
				InitialContext ic = new InitialContext(jndiProps);

				System.out.println("Trying to connect to "+jndiserverurl);
				// Get the RMI Adaptor
				this.mBeanServer = (MBeanServerConnection) ic.lookup("jmx/rmi/RMIAdaptor");
				System.out.println("Connection is OK");		
			}
			else if (this.params.getType() == ServerParamTypeType.JMX)
			{
				String jndiserverurl = "service:jmx:rmi:///jndi/rmi://" + this.params.getHost() + ":" + this.params.getPort() + "/jmxrmi";
				JMXServiceURL jmxurl = new JMXServiceURL(jndiserverurl);
				Map<String, String[]> env = new HashMap<String,String[]>();
			
				// create a environment hash with username and password
				if (this.params.getUser() != null && this.params.getPassword() != null)
				{
					String[] creds = {this.params.getUser(), this.params.getPassword()};
					env.put(JMXConnector.CREDENTIALS, creds);				
				}
			
				System.out.println("Trying to connect to "+jndiserverurl);
				JMXConnector  conn   = JMXConnectorFactory.connect(jmxurl, env);
				System.out.println("Connection is OK");			
				this.mBeanServer = conn.getMBeanServerConnection();
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			return;
		}

		//
		Mbean[] mbeans = this.params.getMbean();
		int nbMBeans = mbeans.length;
		Properties[] newInfos = new Properties[nbMBeans];

		for (int i = 0; i < nbMBeans; i++) {
			newInfos[i] = new Properties();
			String mbeanName = mbeans[i].getDomain().toString() + ":" + mbeans[i].getName();
			newInfos[i].put(KEY_MBEAN_NAME, mbeanName);
			if (mbeans[i].getFilename() == null)
				mbeans[i].setFilename(this.getFileName(mbeanName));
			newInfos[i].put(KEY_APPENDER, new File(fileName).getName() + "*" + mbeans[i].getFilename());
			newInfos[i].put(KEY_MBEAN_FILE, mbeans[i].getFilename());

			int nbMBeansAttrs = mbeans[i].getAttribute().length;
			String[] attrs = new String[nbMBeansAttrs];
			Pattern[] regs = new Pattern[nbMBeansAttrs];
			for (int j = 0; j < nbMBeansAttrs; j++) {
				attrs[j] = mbeans[i].getAttribute()[j].getName();
				final String pat=mbeans[i].getAttribute()[j].getRegexpr();
				if (pat!=null) regs[j] = Pattern.compile(pat);
				Stat[] stats = mbeans[i].getAttribute()[j].getStat();

				if (stats == null)
					stats = new Stat[0];
				newInfos[i].put(attrs[j], stats);
			}
			newInfos[i].put(KEY_MBEAN_ATTRS, attrs);
			newInfos[i].put(KEY_MBEAN_REGS, regs);
		}

		this.infos = newInfos;

		Capture.configureLog4J(this.setLogs());
	}

	private static void configureLog4J(Properties logs) {
		if (Capture.log4j == null)
			log4j = new Properties();
		Enumeration newKeys = logs.propertyNames();
		while (newKeys.hasMoreElements()) {
			String key = (String) newKeys.nextElement();
			log4j.put(key, logs.get(key));
		}
		PropertyConfigurator.configure(Capture.log4j);
	}

	public void startCapture() {
		if (this.mBeanServer != null && this.params != null && this.params.isValid()) {
			TasksScheduler scheduler = new TasksScheduler();

			MServer server = new MServer(this.mBeanServer, this.infos, this.params.getSeparateur());
			for (int i = 0; i < this.params.getNbThreads(); i++) { // nbThreads
				// threads in
				// the pool
				if (i == 0)
					server.logColumnNames();
				//server.setId(i);
				scheduler.addRunnableTasks(server);
			}
			//System.out.println( "START CAPTURE" );
			scheduler.startScheduledTasks(this.params.getDelay()); // One task
			// launch
			// every
			// "waitfor"
			// second...
		}
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) 
			{
				if (args[i].length() > 1)	// Ne pas prendre en compte les caractères &, > ....
					new Capture(args[i]).startCapture();
				else
					return; // Arret de la prise en compte des noms de fichiers 
			}
		} else
			new Capture().startCapture();
	}
}