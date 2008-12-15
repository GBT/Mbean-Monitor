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
    public static final int COUNT_TYPE = 0;

    /**
     * The instance of the Count type
     */
    public static final MethodStatNameType COUNT = new MethodStatNameType(COUNT_TYPE, "Count");

    /**
     * The Min.Time type
     */
    public static final int MIN_TIME_TYPE = 1;

    /**
     * The instance of the Min.Time type
     */
    public static final MethodStatNameType MIN_TIME = new MethodStatNameType(MIN_TIME_TYPE, "Min.Time");

    /**
     * The Moy.Time type
     */
    public static final int MOY_TIME_TYPE = 2;

    /**
     * The instance of the Moy.Time type
     */
    public static final MethodStatNameType MOY_TIME = new MethodStatNameType(MOY_TIME_TYPE, "Moy.Time");

    /**
     * The Max.Time type
     */
    public static final int MAX_TIME_TYPE = 3;

    /**
     * The instance of the Max.Time type
     */
    public static final MethodStatNameType MAX_TIME = new MethodStatNameType(MAX_TIME_TYPE, "Max.Time");

    /**
     * The Total.Time type
     */
    public static final int TOTAL_TIME_TYPE = 4;

    /**
     * The instance of the Total.Time type
     */
    public static final MethodStatNameType TOTAL_TIME = new MethodStatNameType(TOTAL_TIME_TYPE, "Total.Time");

    /**
     * The low type
     */
    public static final int LOW_TYPE = 5;

    /**
     * The instance of the low type
     */
    public static final MethodStatNameType LOW = new MethodStatNameType(LOW_TYPE, "low");

    /**
     * The high type
     */
    public static final int HIGH_TYPE = 6;

    /**
     * The instance of the high type
     */
    public static final MethodStatNameType HIGH = new MethodStatNameType(HIGH_TYPE, "high");

    /**
     * The current type
     */
    public static final int CURRENT_TYPE = 7;

    /**
     * The instance of the current type
     */
    public static final MethodStatNameType CURRENT = new MethodStatNameType(CURRENT_TYPE, "current");

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

    private MethodStatNameType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of MethodStatNameType
     * 
     * @return an Enumeration over all possible instances of
     * MethodStatNameType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this MethodStatNameType
     * 
     * @return the type of this MethodStatNameType
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
        members.put("Count", COUNT);
        members.put("Min.Time", MIN_TIME);
        members.put("Moy.Time", MOY_TIME);
        members.put("Max.Time", MAX_TIME);
        members.put("Total.Time", TOTAL_TIME);
        members.put("low", LOW);
        members.put("high", HIGH);
        members.put("current", CURRENT);
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
     * MethodStatNameType
     * 
     * @return the String representation of this MethodStatNameType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new MethodStatNameType based on the
     * given String value.
     * 
     * @param string
     * @return the MethodStatNameType value of parameter 'string'
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid MethodStatNameType";
            throw new IllegalArgumentException(err);
        }
        return (MethodStatNameType) obj;
    }

}
