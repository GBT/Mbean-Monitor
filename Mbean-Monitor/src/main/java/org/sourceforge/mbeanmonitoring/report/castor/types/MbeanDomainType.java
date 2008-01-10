/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.sourceforge.mbeanmonitoring.report.castor.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

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
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the jboss type
     */
    public static final MbeanDomainType VALUE_0 = new MbeanDomainType(VALUE_0_TYPE, "jboss");

    /**
     * The jboss.cache type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the jboss.cache type
     */
    public static final MbeanDomainType VALUE_1 = new MbeanDomainType(VALUE_1_TYPE, "jboss.cache");

    /**
     * The jboss.admin type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the jboss.admin type
     */
    public static final MbeanDomainType VALUE_2 = new MbeanDomainType(VALUE_2_TYPE, "jboss.admin");

    /**
     * The jboss.jca type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the jboss.jca type
     */
    public static final MbeanDomainType VALUE_3 = new MbeanDomainType(VALUE_3_TYPE, "jboss.jca");

    /**
     * The jboss.deployment type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the jboss.deployment type
     */
    public static final MbeanDomainType VALUE_4 = new MbeanDomainType(VALUE_4_TYPE, "jboss.deployment");

    /**
     * The jboss.ejb type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the jboss.ejb type
     */
    public static final MbeanDomainType VALUE_5 = new MbeanDomainType(VALUE_5_TYPE, "jboss.ejb");

    /**
     * The jboss.j2ee type
     */
    public static final int VALUE_6_TYPE = 6;

    /**
     * The instance of the jboss.j2ee type
     */
    public static final MbeanDomainType VALUE_6 = new MbeanDomainType(VALUE_6_TYPE, "jboss.j2ee");

    /**
     * The jboss.jca type
     */
    public static final int VALUE_7_TYPE = 7;

    /**
     * The instance of the jboss.jca type
     */
    public static final MbeanDomainType VALUE_7 = new MbeanDomainType(VALUE_7_TYPE, "jboss.jca");

    /**
     * The jboss.jdbc type
     */
    public static final int VALUE_8_TYPE = 8;

    /**
     * The instance of the jboss.jdbc type
     */
    public static final MbeanDomainType VALUE_8 = new MbeanDomainType(VALUE_8_TYPE, "jboss.jdbc");

    /**
     * The jboss.jmx type
     */
    public static final int VALUE_9_TYPE = 9;

    /**
     * The instance of the jboss.jmx type
     */
    public static final MbeanDomainType VALUE_9 = new MbeanDomainType(VALUE_9_TYPE, "jboss.jmx");

    /**
     * The jboss.management.local type
     */
    public static final int VALUE_10_TYPE = 10;

    /**
     * The instance of the jboss.management.local type
     */
    public static final MbeanDomainType VALUE_10 = new MbeanDomainType(VALUE_10_TYPE, "jboss.management.local");

    /**
     * The jboss.mq type
     */
    public static final int VALUE_11_TYPE = 11;

    /**
     * The instance of the jboss.mq type
     */
    public static final MbeanDomainType VALUE_11 = new MbeanDomainType(VALUE_11_TYPE, "jboss.mq");

    /**
     * The jboss.mq.destination type
     */
    public static final int VALUE_12_TYPE = 12;

    /**
     * The instance of the jboss.mq.destination type
     */
    public static final MbeanDomainType VALUE_12 = new MbeanDomainType(VALUE_12_TYPE, "jboss.mq.destination");

    /**
     * The jboss.rmi type
     */
    public static final int VALUE_13_TYPE = 13;

    /**
     * The instance of the jboss.rmi type
     */
    public static final MbeanDomainType VALUE_13 = new MbeanDomainType(VALUE_13_TYPE, "jboss.rmi");

    /**
     * The jboss.scripts type
     */
    public static final int VALUE_14_TYPE = 14;

    /**
     * The instance of the jboss.scripts type
     */
    public static final MbeanDomainType VALUE_14 = new MbeanDomainType(VALUE_14_TYPE, "jboss.scripts");

    /**
     * The jboss.security type
     */
    public static final int VALUE_15_TYPE = 15;

    /**
     * The instance of the jboss.security type
     */
    public static final MbeanDomainType VALUE_15 = new MbeanDomainType(VALUE_15_TYPE, "jboss.security");

    /**
     * The jboss.system type
     */
    public static final int VALUE_16_TYPE = 16;

    /**
     * The instance of the jboss.system type
     */
    public static final MbeanDomainType VALUE_16 = new MbeanDomainType(VALUE_16_TYPE, "jboss.system");

    /**
     * The jboss.web type
     */
    public static final int VALUE_17_TYPE = 17;

    /**
     * The instance of the jboss.web type
     */
    public static final MbeanDomainType VALUE_17 = new MbeanDomainType(VALUE_17_TYPE, "jboss.web");

    /**
     * The jboss.messaging type
     */
    public static final int VALUE_18_TYPE = 18;

    /**
     * The instance of the jboss.messaging type
     */
    public static final MbeanDomainType VALUE_18 = new MbeanDomainType(VALUE_18_TYPE, "jboss.messaging");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private MbeanDomainType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MbeanDomainType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this MbeanDomainType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("jboss", VALUE_0);
        members.put("jboss.cache", VALUE_1);
        members.put("jboss.admin", VALUE_2);
        members.put("jboss.jca", VALUE_3);
        members.put("jboss.deployment", VALUE_4);
        members.put("jboss.ejb", VALUE_5);
        members.put("jboss.j2ee", VALUE_6);
        members.put("jboss.jca", VALUE_7);
        members.put("jboss.jdbc", VALUE_8);
        members.put("jboss.jmx", VALUE_9);
        members.put("jboss.management.local", VALUE_10);
        members.put("jboss.mq", VALUE_11);
        members.put("jboss.mq.destination", VALUE_12);
        members.put("jboss.rmi", VALUE_13);
        members.put("jboss.scripts", VALUE_14);
        members.put("jboss.security", VALUE_15);
        members.put("jboss.system", VALUE_16);
        members.put("jboss.web", VALUE_17);
        members.put("jboss.messaging", VALUE_18);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * MbeanDomainType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MbeanDomainType based on the
     * given String value.
     * 
     * @param string
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MbeanDomainType";
            throw new IllegalArgumentException(err);
        }
        return (MbeanDomainType) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType valueOf(java.lang.String) 

}
