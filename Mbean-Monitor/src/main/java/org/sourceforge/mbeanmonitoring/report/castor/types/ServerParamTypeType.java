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
 * Class ServerParamTypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ServerParamTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The jnp type
     */
    public static final int JNP_TYPE = 0;

    /**
     * The instance of the jnp type
     */
    public static final ServerParamTypeType JNP = new ServerParamTypeType(JNP_TYPE, "jnp");

    /**
     * The jmx type
     */
    public static final int JMX_TYPE = 1;

    /**
     * The instance of the jmx type
     */
    public static final ServerParamTypeType JMX = new ServerParamTypeType(JMX_TYPE, "jmx");

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

    private ServerParamTypeType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of ServerParamTypeType
     * 
     * @return an Enumeration over all possible instances of
     * ServerParamTypeType
     */
    public static java.util.Enumeration enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this ServerParamTypeType
     * 
     * @return the type of this ServerParamTypeType
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
        members.put("jnp", JNP);
        members.put("jmx", JMX);
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
     * ServerParamTypeType
     * 
     * @return the String representation of this ServerParamTypeType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new ServerParamTypeType based on
     * the given String value.
     * 
     * @param string
     * @return the ServerParamTypeType value of parameter 'string'
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.types.ServerParamTypeType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid ServerParamTypeType";
            throw new IllegalArgumentException(err);
        }
        return (ServerParamTypeType) obj;
    }

}
