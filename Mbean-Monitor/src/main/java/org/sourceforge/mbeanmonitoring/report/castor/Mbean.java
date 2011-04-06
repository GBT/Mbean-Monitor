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
 * Class Mbean.
 * 
 * @version $Revision$ $Date$
 */
public class Mbean implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _domain.
     */
    private java.lang.String _domain;

    /**
     * Field _filename.
     */
    private java.lang.String _filename;

    /**
     * Field _attributeList.
     */
    private java.util.Vector _attributeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mbean() {
        super();
        this._attributeList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.addElement(vAttribute);
    }

    /**
     * 
     * 
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.add(index, vAttribute);
    }

    /**
     * Method enumerateAttribute.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.Attribute
     * elements
     */
    public java.util.Enumeration enumerateAttribute(
    ) {
        return this._attributeList.elements();
    }

    /**
     * Method getAttribute.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.Attribute at
     * the given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute getAttribute(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("getAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) _attributeList.get(index);
    }

    /**
     * Method getAttribute.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute[] getAttribute(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.Attribute[] array = new org.sourceforge.mbeanmonitoring.report.castor.Attribute[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute[]) this._attributeList.toArray(array);
    }

    /**
     * Method getAttributeCount.
     * 
     * @return the size of this collection
     */
    public int getAttributeCount(
    ) {
        return this._attributeList.size();
    }

    /**
     * Returns the value of field 'domain'.
     * 
     * @return the value of field 'Domain'.
     */
    public java.lang.String getDomain(
    ) {
        return this._domain;
    }

    /**
     * Returns the value of field 'filename'.
     * 
     * @return the value of field 'Filename'.
     */
    public java.lang.String getFilename(
    ) {
        return this._filename;
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
    public void removeAllAttribute(
    ) {
        this._attributeList.clear();
    }

    /**
     * Method removeAttribute.
     * 
     * @param vAttribute
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttribute(
            final org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute) {
        boolean removed = _attributeList.remove(vAttribute);
        return removed;
    }

    /**
     * Method removeAttributeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute removeAttributeAt(
            final int index) {
        java.lang.Object obj = this._attributeList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttribute(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("setAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }
        
        this._attributeList.set(index, vAttribute);
    }

    /**
     * 
     * 
     * @param vAttributeArray
     */
    public void setAttribute(
            final org.sourceforge.mbeanmonitoring.report.castor.Attribute[] vAttributeArray) {
        //-- copy array
        _attributeList.clear();
        
        for (int i = 0; i < vAttributeArray.length; i++) {
                this._attributeList.add(vAttributeArray[i]);
        }
    }

    /**
     * Sets the value of field 'domain'.
     * 
     * @param domain the value of field 'domain'.
     */
    public void setDomain(
            final java.lang.String domain) {
        this._domain = domain;
    }

    /**
     * Sets the value of field 'filename'.
     * 
     * @param filename the value of field 'filename'.
     */
    public void setFilename(
            final java.lang.String filename) {
        this._filename = filename;
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
     * org.sourceforge.mbeanmonitoring.report.castor.Mbean
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.Mbean unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Mbean.class, reader);
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
