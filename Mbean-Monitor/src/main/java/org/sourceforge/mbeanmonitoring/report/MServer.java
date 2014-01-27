package org.sourceforge.mbeanmonitoring.report;

/**
 **      Author:
 **              Laurent Le Grandois <Laurent.Le.Grandois@gmail.com>
 **              Gilles Bardouillet  <Gilles.Bardouillet@gmail.com>
 **              Philippe Prados
 **
 **  This program is free software; you can redistribute it and/or modify
 ** it under the terms of the GNU General Public License as published by
 **  the Free Software Foundation; either version 2 of the License, or
 **  (at your option) any later version.
 **
 ** This program is distributed in the hope that it will be useful,
 **  but WITHOUT ANY WARRANTY; without even the implied warranty of
 **  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 **  GNU General Public License for more details.
 **
 **  You should have received a copy of the GNU General Public License
 ** along with this program; if not, write to the Free Software
 **
 */

import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.management.InstanceNotFoundException;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.j2ee.statistics.CountStatistic;
import javax.management.j2ee.statistics.EntityBeanStats;
import javax.management.j2ee.statistics.RangeStatistic;
import javax.management.j2ee.statistics.Statistic;
import javax.management.j2ee.statistics.Stats;
import javax.management.j2ee.statistics.TimeStatistic;
import javax.management.openmbean.CompositeDataSupport;

import org.apache.log4j.Category;
import org.sourceforge.mbeanmonitoring.report.castor.Stat;
import org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType;

public class MServer implements Runnable {

	private MBeanServerConnection mbeanServer;

	private Properties[] infos;
	private ObjectName[] mbeans;
	private String separator;

	public MServer(MBeanServerConnection mbeanServer, Properties[] infos, String separator) {
		this.mbeanServer = mbeanServer;
		this.infos = infos;
		this.separator = separator;
	}

	private String[] getAttributs(int index) {
		return ((String[]) this.infos[index].get(Capture.KEY_MBEAN_ATTRS));
	}

	private Pattern[] getRegexpr(int index) {
		return ((Pattern[]) this.infos[index].get(Capture.KEY_MBEAN_REGS));
	}

	private void getData() {
		int i = -1;
		if (this.mbeans == null)
			this.getMBeans();
		try {
			for (i = 0; i < this.infos.length; i++) {
				if (this.mbeans[i] != null) {
					
					//System.out.println("Mbean "+this.mbeans[i]);
					String appender = this.infos[i].getProperty(Capture.KEY_APPENDER);//,this.infos[i].getProperty("name"));
					
					StringBuffer datas = new StringBuffer();
					for (int j = 0; j < getAttributs(i).length; j++) 
					{
						//System.out.println("Attribut "+getAttributs(i)[j]);
						if (datas.length() > 0)
							datas.append(this.separator);

						Object result = null;
						try {
							result = this.mbeanServer.getAttribute(this.mbeans[i], getAttributs(i)[j]);
						} catch (NotSerializableException e) {
				            result = this.mbeanServer.invoke(this.mbeans[i], "list" + getAttributs(i)[j], null, null) ;
							System.out.println("Invocation de " + getAttributs(i)[j] + " : " + result.toString()) ;
							result = "0";
						} catch (InstanceNotFoundException e) {
							result = "0";
						}
						
						//Traitement du résultat en fonction du type de l'attribut
						if (result.getClass().isArray())
						{
							result=((Object[])result)[0];
						}

						if (result instanceof Stats) 
						{
							decomposeStats(i, datas, result);
						}
						
						if (getRegexpr(i)[j] == null && result instanceof CompositeDataSupport)
						{
							CompositeDataSupport st = (CompositeDataSupport) result;
							//String[] wantedStatsNames = {"init", "used", "committed", "max"};
							String[] wantedStatsNames = getEntete(i);

							//System.out.println(st.values());
							for (int k = 0; k < wantedStatsNames.length; k++) 
							{
								if (datas.length() > 0)
									datas.append(this.separator);
								//System.out.println(">>"+wantedStatsNames[k]+"<<");
								Object stat = st.get(wantedStatsNames[k]);
								//System.out.println("result="+stat);
								if (stat != null) 
								{
									datas.append(stat);
								}
							}
							System.out.println(mbeans[i]+":"+datas);
								
						}
						else {
							final Pattern pat=getRegexpr(i)[j];
							if (pat!=null) {
								final java.util.regex.Matcher matcher=pat.matcher(result.toString());
								if (matcher.find())	{
									result=matcher.group(1);
								}
							}
							datas.append(result);
						}
					}
					Category.getInstance(appender).debug(datas.toString());
				}
			}
			//        } catch (InstanceNotFoundException e) {
			//            e.printStackTrace();
			//this.mbeans[i] = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void decomposeStats(int mbeanIndex, StringBuffer datas,
			Object result)
	{
		Stats st = (Stats) result;
		Statistic[] stats = st.getStatistics();
		if (result instanceof EntityBeanStats) {
			EntityBeanStats entityStats = (EntityBeanStats) result;
			stats = entityStats.getStatistics();
		}

		String[] wantedStatsNames = getEntete(mbeanIndex);

		for (int k = 0; k < wantedStatsNames.length; k++) {
			int ii = -1;
			do {
				ii++;
			} while (ii < stats.length && stats[ii] != null
					&& !wantedStatsNames[k].startsWith(stats[ii].getName()));

			Statistic stat = null;
			if (ii < stats.length)
				stat = stats[ii];

			if (datas.length() > 0)
				datas.append(this.separator);
			if (stat != null) {
				String value = stat.getDescription();
				if (stat instanceof RangeStatistic) {
					value = new Long(((RangeStatistic) stat).getCurrent()).toString();
				} else if (stat instanceof CountStatistic) {
					value = new Long(((CountStatistic) stat).getCount()).toString();
				} else if (stat instanceof TimeStatistic) {
					TimeStatistic time = (TimeStatistic) stat;
					if (wantedStatsNames[k].endsWith(MethodStatNameType.COUNT.toString()))
						value = new Long(time.getCount()).toString();
					else if (wantedStatsNames[k].endsWith(MethodStatNameType.MAX_TIME.toString()))
						value = new Long(time.getMaxTime()).toString();
					else if (wantedStatsNames[k].endsWith(MethodStatNameType.MIN_TIME.toString()))
						value = new Long(time.getMinTime()).toString();
					else if (wantedStatsNames[k].endsWith(MethodStatNameType.TOTAL_TIME.toString()))
						value = new Long(time.getTotalTime()).toString();
					else if (wantedStatsNames[k].endsWith(MethodStatNameType.MOY_TIME.toString())) {
						long totalTime = time.getTotalTime();
						long count = time.getCount();
						if (count != 0) {
							value = new Long(totalTime / count).toString();
						} else {
							value = "-1";
						}
					}
				}
				datas.append(value);

			} else
				datas.append('0');
		}
	}

	private String[] getEntete(int mbeanindex) {
		String[] attributs = getAttributs(mbeanindex);
		ArrayList<String> result = new ArrayList<String>(attributs.length);
		for (int i = 0; i < attributs.length; i++) {
			Stat[] stats = (Stat[]) this.infos[mbeanindex].get(attributs[i]);

			if (stats.length != 0) {
				for (int j = 0; j < stats.length; j++) {
					Stat st = stats[j];
					if (st.getMethodStatCount() == 0)
					{
						result.add(st.getName());
					}
					else
						for (int k = 0; k < st.getMethodStat().length; k++) {
							result.add(st.getName() + "." + st.getMethodStat(k).getName());
						}
				}
			} else {
				result.add(attributs[i]);
			}
		}
		attributs = new String[result.size()];
		result.toArray(attributs);
		return attributs;
	}
	
	private void getMBeans() {
		this.mbeans = new ObjectName[infos.length];

		for (int i = 0; i < infos.length; i++) {
			try {
				this.mbeans[i] = new ObjectName(this.infos[i].getProperty(Capture.KEY_MBEAN_NAME));
			} catch (Exception e) {
				System.out.println("Failed to get MBean = " + this.infos[i].getProperty(Capture.KEY_MBEAN_NAME));
				//e.printStackTrace();
			}
		}
	}

	/**
	 *
	 */
	public void logColumnNames() {
		for (int i = 0; i < this.infos.length; i++) {
			String appender = this.infos[i].getProperty(Capture.KEY_APPENDER);

			String[] attributs = getEntete(i);
			StringBuffer entete = new StringBuffer();
			entete.append(attributs[0]);

			for (int j = 1; j < attributs.length; j++) {
				entete.append(this.separator);
				entete.append(attributs[j]);
			}

			Category.getInstance(appender).debug(entete.toString());
		}
	}

	public void run() {
		if (this.mbeanServer != null) {
			this.getData();
			/*
			 * //////////////////////////////////////////////////////////////// //
			 * Pause for tests: // "NO TASKS TO RUN... INCREASE THE TASKS POOL
			 * SIZE !" // long duration = 1500 + Math.round(5000 *
			 * Math.random()); try { Thread.sleep(duration); } catch
			 * (InterruptedException e) { e.printStackTrace(); }
			 */
		}
	}

}
