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

import java.util.Hashtable;

/**
 * Class MethodStatNameType.
 * 
 * @version $Revision$ $Date$
 */
public class MethodStatNameType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Count type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the Count type
     */
    public static final MethodStatNameType VALUE_0 = new MethodStatNameType(VALUE_0_TYPE, "Count");

    /**
     * The Min.Time type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the Min.Time type
     */
    public static final MethodStatNameType VALUE_1 = new MethodStatNameType(VALUE_1_TYPE, "Min.Time");

    /**
     * The Moy.Time type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the Moy.Time type
     */
    public static final MethodStatNameType VALUE_2 = new MethodStatNameType(VALUE_2_TYPE, "Moy.Time");

    /**
     * The Max.Time type
     */
    public static final int VALUE_3_TYPE = 3;

    /**
     * The instance of the Max.Time type
     */
    public static final MethodStatNameType VALUE_3 = new MethodStatNameType(VALUE_3_TYPE, "Max.Time");

    /**
     * The Total.Time type
     */
    public static final int VALUE_4_TYPE = 4;

    /**
     * The instance of the Total.Time type
     */
    public static final MethodStatNameType VALUE_4 = new MethodStatNameType(VALUE_4_TYPE, "Total.Time");

    /**
     * The low type
     */
    public static final int VALUE_5_TYPE = 5;

    /**
     * The instance of the low type
     */
    public static final MethodStatNameType VALUE_5 = new MethodStatNameType(VALUE_5_TYPE, "low");

    /**
     * The high type
     */
    public static final int VALUE_6_TYPE = 6;

    /**
     * The instance of the high type
     */
    public static final MethodStatNameType VALUE_6 = new MethodStatNameType(VALUE_6_TYPE, "high");

    /**
     * The current type
     */
    public static final int VALUE_7_TYPE = 7;

    /**
     * The instance of the current type
     */
    public static final MethodStatNameType VALUE_7 = new MethodStatNameType(VALUE_7_TYPE, "current");

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

    private MethodStatNameType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of MethodStatNameType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this MethodStatNameType
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
        members.put("Count", VALUE_0);
        members.put("Min.Time", VALUE_1);
        members.put("Moy.Time", VALUE_2);
        members.put("Max.Time", VALUE_3);
        members.put("Total.Time", VALUE_4);
        members.put("low", VALUE_5);
        members.put("high", VALUE_6);
        members.put("current", VALUE_7);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * MethodStatNameType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new MethodStatNameType based on the
     * given String value.
     * 
     * @param string
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid MethodStatNameType";
            throw new IllegalArgumentException(err);
        }
        return (MethodStatNameType) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType valueOf(java.lang.String) 

}
