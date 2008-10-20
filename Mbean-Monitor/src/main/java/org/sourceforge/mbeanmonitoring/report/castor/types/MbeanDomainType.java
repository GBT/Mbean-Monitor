/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.sourceforge.mbeanmonitoring.report.castor.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class MbeanDomainType.
 * 
 * @version $Revision$ $Date$
 */
public class MbeanDomainType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The jboss type
     */
    public static final int JBOSS_TYPE = 0;

    /**
     * The instance of the jboss type
     */
    public static final MbeanDomainType JBOSS = new MbeanDomainType(JBOSS_TYPE, "jboss");

    /**
     * The jboss.cache type
     */
    public static final int JBOSS_CACHE_TYPE = 1;

    /**
     * The instance of the jboss.cache type
     */
    public static final MbeanDomainType JBOSS_CACHE = new MbeanDomainType(JBOSS_CACHE_TYPE, "jboss.cache");

    /**
     * The jboss.admin type
     */
    public static final int JBOSS_ADMIN_TYPE = 2;

    /**
     * The instance of the jboss.admin type
     */
    public static final MbeanDomainType JBOSS_ADMIN = new MbeanDomainType(JBOSS_ADMIN_TYPE, "jboss.admin");

    /**
     * The jboss.deployment type
     */
    public static final int JBOSS_DEPLOYMENT_TYPE = 4;

    /**
     * The instance of the jboss.deployment type
     */
    public static final MbeanDomainType JBOSS_DEPLOYMENT = new MbeanDomainType(JBOSS_DEPLOYMENT_TYPE, "jboss.deployment");

    /**
     * The jboss.ejb type
     */
    public static final int JBOSS_EJB_TYPE = 5;

    /**
     * The instance of the jboss.ejb type
     */
    public static final MbeanDomainType JBOSS_EJB = new MbeanDomainType(JBOSS_EJB_TYPE, "jboss.ejb");

    /**
     * The jboss.j2ee type
     */
    public static final int JBOSS_J2EE_TYPE = 6;

    /**
     * The instance of the jboss.j2ee type
     */
    public static final MbeanDomainType JBOSS_J2EE = new MbeanDomainType(JBOSS_J2EE_TYPE, "jboss.j2ee");

    /**
     * The jboss.jca type
     */
    public static final int JBOSS_JCA_TYPE = 7;

    /**
     * The instance of the jboss.jca type
     */
    public static final MbeanDomainType JBOSS_JCA = new MbeanDomainType(JBOSS_JCA_TYPE, "jboss.jca");

    /**
     * The jboss.jdbc type
     */
    public static final int JBOSS_JDBC_TYPE = 8;

    /**
     * The instance of the jboss.jdbc type
     */
    public static final MbeanDomainType JBOSS_JDBC = new MbeanDomainType(JBOSS_JDBC_TYPE, "jboss.jdbc");

    /**
     * The jboss.jmx type
     */
    public static final int JBOSS_JMX_TYPE = 9;

    /**
     * The instance of the jboss.jmx type
     */
    public static final MbeanDomainType JBOSS_JMX = new MbeanDomainType(JBOSS_JMX_TYPE, "jboss.jmx");

    /**
     * The jboss.management.local type
     */
    public static final int JBOSS_MANAGEMENT_LOCAL_TYPE = 10;

    /**
     * The instance of the jboss.management.local type
     */
    public static final MbeanDomainType JBOSS_MANAGEMENT_LOCAL = new MbeanDomainType(JBOSS_MANAGEMENT_LOCAL_TYPE, "jboss.management.local");

    /**
     * The jboss.mq type
     */
    public static final int JBOSS_MQ_TYPE = 11;

    /**
     * The instance of the jboss.mq type
     */
    public static final MbeanDomainType JBOSS_MQ = new MbeanDomainType(JBOSS_MQ_TYPE, "jboss.mq");

    /**
     * The jboss.mq.destination type
     */
    public static final int JBOSS_MQ_DESTINATION_TYPE = 12;

    /**
     * The instance of the jboss.mq.destination type
     */
    public static final MbeanDomainType JBOSS_MQ_DESTINATION = new MbeanDomainType(JBOSS_MQ_DESTINATION_TYPE, "jboss.mq.destination");

    /**
     * The jboss.rmi type
     */
    public static final int JBOSS_RMI_TYPE = 13;

    /**
     * The instance of the jboss.rmi type
     */
    public static final MbeanDomainType JBOSS_RMI = new MbeanDomainType(JBOSS_RMI_TYPE, "jboss.rmi");

    /**
     * The jboss.scripts type
     */
    public static final int JBOSS_SCRIPTS_TYPE = 14;

    /**
     * The instance of the jboss.scripts type
     */
    public static final MbeanDomainType JBOSS_SCRIPTS = new MbeanDomainType(JBOSS_SCRIPTS_TYPE, "jboss.scripts");

    /**
     * The jboss.security type
     */
    public static final int JBOSS_SECURITY_TYPE = 15;

    /**
     * The instance of the jboss.security type
     */
    public static final MbeanDomainType JBOSS_SECURITY = new MbeanDomainType(JBOSS_SECURITY_TYPE, "jboss.security");

    /**
     * The jboss.system type
     */
    public static final int JBOSS_SYSTEM_TYPE = 16;

    /**
     * The instance of the jboss.system type
     */
    public static final MbeanDomainType JBOSS_SYSTEM = new MbeanDomainType(JBOSS_SYSTEM_TYPE, "jboss.system");

    /**
     * The jboss.web type
     */
    public static final int JBOSS_WEB_TYPE = 17;

    /**
     * The instance of the jboss.web type
     */
    public static final MbeanDomainType JBOSS_WEB = new MbeanDomainType(JBOSS_WEB_TYPE, "jboss.web");

    /**
     * The jboss.messaging type
     */
    public static final int JBOSS_MESSAGING_TYPE = 18;

    /**
     * The instance of the jboss.messaging type
     */
    public static final MbeanDomainType JBOSS_MESSAGING = new MbeanDomainType(JBOSS_MESSAGING_TYPE, "jboss.messaging");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private MbeanDomainType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of MbeanDomainType
     * 
     * @return an Enumeration over all possible instances of
     * MbeanDomainType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this MbeanDomainType
     * 
     * @return the type of this MbeanDomainType
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable init(
    ) {
        Hashtable members = new Hashtable();
        members.put("jboss", JBOSS);
        members.put("jboss.cache", JBOSS_CACHE);
        members.put("jboss.admin", JBOSS_ADMIN);
        members.put("jboss.jca", JBOSS_JCA);
        members.put("jboss.deployment", JBOSS_DEPLOYMENT);
        members.put("jboss.ejb", JBOSS_EJB);
        members.put("jboss.j2ee", JBOSS_J2EE);
        members.put("jboss.jdbc", JBOSS_JDBC);
        members.put("jboss.jmx", JBOSS_JMX);
        members.put("jboss.management.local", JBOSS_MANAGEMENT_LOCAL);
        members.put("jboss.mq", JBOSS_MQ);
        members.put("jboss.mq.destination", JBOSS_MQ_DESTINATION);
        members.put("jboss.rmi", JBOSS_RMI);
        members.put("jboss.scripts", JBOSS_SCRIPTS);
        members.put("jboss.security", JBOSS_SECURITY);
        members.put("jboss.system", JBOSS_SYSTEM);
        members.put("jboss.web", JBOSS_WEB);
        members.put("jboss.messaging", JBOSS_MESSAGING);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private java.lang.Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * MbeanDomainType
     * 
     * @return the String representation of this MbeanDomainType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new MbeanDomainType based on the
     * given String value.
     * 
     * @param string
     * @return the MbeanDomainType value of parameter 'string'
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid MbeanDomainType";
            throw new IllegalArgumentException(err);
        }
        return (MbeanDomainType) obj;
    }

}
