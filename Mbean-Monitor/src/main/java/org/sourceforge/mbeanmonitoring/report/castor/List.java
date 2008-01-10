/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.sourceforge.mbeanmonitoring.report.castor;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

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
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _elementList
     */
    private java.util.Vector _elementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public List() {
        super();
        _elementList = new Vector();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addElement
     * 
     * @param vElement
     */
    public void addElement(org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _elementList.addElement(vElement);
    } //-- void addElement(org.sourceforge.mbeanmonitoring.report.castor.Element) 

    /**
     * Method addElement
     * 
     * @param index
     * @param vElement
     */
    public void addElement(int index, org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _elementList.insertElementAt(vElement, index);
    } //-- void addElement(int, org.sourceforge.mbeanmonitoring.report.castor.Element) 

    /**
     * Method enumerateElement
     */
    public java.util.Enumeration enumerateElement()
    {
        return _elementList.elements();
    } //-- java.util.Enumeration enumerateElement() 

    /**
     * Method getElement
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element getElement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _elementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Element) _elementList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Element getElement(int) 

    /**
     * Method getElement
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element[] getElement()
    {
        int size = _elementList.size();
        org.sourceforge.mbeanmonitoring.report.castor.Element[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.Element[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.Element) _elementList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Element[] getElement() 

    /**
     * Method getElementCount
     */
    public int getElementCount()
    {
        return _elementList.size();
    } //-- int getElementCount() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllElement
     */
    public void removeAllElement()
    {
        _elementList.removeAllElements();
    } //-- void removeAllElement() 

    /**
     * Method removeElement
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Element removeElement(int index)
    {
        java.lang.Object obj = _elementList.elementAt(index);
        _elementList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Element) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Element removeElement(int) 

    /**
     * Method setElement
     * 
     * @param index
     * @param vElement
     */
    public void setElement(int index, org.sourceforge.mbeanmonitoring.report.castor.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _elementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _elementList.setElementAt(vElement, index);
    } //-- void setElement(int, org.sourceforge.mbeanmonitoring.report.castor.Element) 

    /**
     * Method setElement
     * 
     * @param elementArray
     */
    public void setElement(org.sourceforge.mbeanmonitoring.report.castor.Element[] elementArray)
    {
        //-- copy array
        _elementList.removeAllElements();
        for (int i = 0; i < elementArray.length; i++) {
            _elementList.addElement(elementArray[i]);
        }
    } //-- void setElement(org.sourceforge.mbeanmonitoring.report.castor.Element) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.List) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.List.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.List unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
