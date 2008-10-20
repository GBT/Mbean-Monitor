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
 * Class List.
 * 
 * @version $Revision$ $Date$
 */
public class List implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _elementList.
     */
    private java.util.Vector _elementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public List() {
        super();
        this._elementList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addElement(
            final org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
    throws java.lang.IndexOutOfBoundsException {
        this._elementList.addElement(vElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addElement(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
    throws java.lang.IndexOutOfBoundsException {
        this._elementList.add(index, vElement);
    }

    /**
     * Method enumerateElement.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.Element element
     */
    public java.util.Enumeration enumerateElement(
    ) {
        return this._elementList.elements();
    }

    /**
     * Method getElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.Element at the
     * given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element getElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._elementList.size()) {
            throw new IndexOutOfBoundsException("getElement: Index value '" + index + "' not in range [0.." + (this._elementList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Element) _elementList.get(index);
    }

    /**
     * Method getElement.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element[] getElement(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.Element[] array = new org.sourceforge.mbeanmonitoring.report.castor.Element[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.Element[]) this._elementList.toArray(array);
    }

    /**
     * Method getElementCount.
     * 
     * @return the size of this collection
     */
    public int getElementCount(
    ) {
        return this._elementList.size();
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
    public void removeAllElement(
    ) {
        this._elementList.clear();
    }

    /**
     * Method removeElement.
     * 
     * @param vElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeElement(
            final org.sourceforge.mbeanmonitoring.report.castor.Element vElement) {
        boolean removed = _elementList.remove(vElement);
        return removed;
    }

    /**
     * Method removeElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element removeElementAt(
            final int index) {
        java.lang.Object obj = this._elementList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Element) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setElement(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._elementList.size()) {
            throw new IndexOutOfBoundsException("setElement: Index value '" + index + "' not in range [0.." + (this._elementList.size() - 1) + "]");
        }
        
        this._elementList.set(index, vElement);
    }

    /**
     * 
     * 
     * @param vElementArray
     */
    public void setElement(
            final org.sourceforge.mbeanmonitoring.report.castor.Element[] vElementArray) {
        //-- copy array
        _elementList.clear();
        
        for (int i = 0; i < vElementArray.length; i++) {
                this._elementList.add(vElementArray[i]);
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
     * org.sourceforge.mbeanmonitoring.report.castor.List
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.List unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.sourceforge.mbeanmonitoring.report.castor.List) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.List.class, reader);
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
