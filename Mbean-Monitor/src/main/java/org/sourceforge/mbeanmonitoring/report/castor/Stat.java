/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.sourceforge.mbeanmonitoring.report.castor;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Stat.
 * 
 * @version $Revision$ $Date$
 */
public class Stat implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _methodStatList.
     */
    private java.util.Vector _methodStatList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Stat() {
        super();
        this._methodStatList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMethodStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMethodStat(
            final org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
    throws java.lang.IndexOutOfBoundsException {
        this._methodStatList.addElement(vMethodStat);
    }

    /**
     * 
     * 
     * @param index
     * @param vMethodStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMethodStat(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
    throws java.lang.IndexOutOfBoundsException {
        this._methodStatList.add(index, vMethodStat);
    }

    /**
     * Method enumerateMethodStat.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.MethodStat
     * elements
     */
    public java.util.Enumeration enumerateMethodStat(
    ) {
        return this._methodStatList.elements();
    }

    /**
     * Method getMethodStat.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.MethodStat at
     * the given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat getMethodStat(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._methodStatList.size()) {
            throw new IndexOutOfBoundsException("getMethodStat: Index value '" + index + "' not in range [0.." + (this._methodStatList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) _methodStatList.get(index);
    }

    /**
     * Method getMethodStat.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] getMethodStat(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] array = new org.sourceforge.mbeanmonitoring.report.castor.MethodStat[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat[]) this._methodStatList.toArray(array);
    }

    /**
     * Method getMethodStatCount.
     * 
     * @return the size of this collection
     */
    public int getMethodStatCount(
    ) {
        return this._methodStatList.size();
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllMethodStat(
    ) {
        this._methodStatList.clear();
    }

    /**
     * Method removeMethodStat.
     * 
     * @param vMethodStat
     * @return true if the object was removed from the collection.
     */
    public boolean removeMethodStat(
            final org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat) {
        boolean removed = _methodStatList.remove(vMethodStat);
        return removed;
    }

    /**
     * Method removeMethodStatAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat removeMethodStatAt(
            final int index) {
        java.lang.Object obj = this._methodStatList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMethodStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMethodStat(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._methodStatList.size()) {
            throw new IndexOutOfBoundsException("setMethodStat: Index value '" + index + "' not in range [0.." + (this._methodStatList.size() - 1) + "]");
        }
        
        this._methodStatList.set(index, vMethodStat);
    }

    /**
     * 
     * 
     * @param vMethodStatArray
     */
    public void setMethodStat(
            final org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] vMethodStatArray) {
        //-- copy array
        _methodStatList.clear();
        
        for (int i = 0; i < vMethodStatArray.length; i++) {
                this._methodStatList.add(vMethodStatArray[i]);
        }
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.sourceforge.mbeanmonitoring.report.castor.Stat
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.Stat unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Stat.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
