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
import org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType;
import org.xml.sax.ContentHandler;

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
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _domain
     */
    private org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType _domain;

    /**
     * Field _filename
     */
    private java.lang.String _filename;

    /**
     * Field _attributeList
     */
    private java.util.Vector _attributeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mbean() {
        super();
        _attributeList = new Vector();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Mbean()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAttribute
     * 
     * @param vAttribute
     */
    public void addAttribute(org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.addElement(vAttribute);
    } //-- void addAttribute(org.sourceforge.mbeanmonitoring.report.castor.Attribute) 

    /**
     * Method addAttribute
     * 
     * @param index
     * @param vAttribute
     */
    public void addAttribute(int index, org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.insertElementAt(vAttribute, index);
    } //-- void addAttribute(int, org.sourceforge.mbeanmonitoring.report.castor.Attribute) 

    /**
     * Method enumerateAttribute
     */
    public java.util.Enumeration enumerateAttribute()
    {
        return _attributeList.elements();
    } //-- java.util.Enumeration enumerateAttribute() 

    /**
     * Method getAttribute
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute getAttribute(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) _attributeList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Attribute getAttribute(int) 

    /**
     * Method getAttribute
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute[] getAttribute()
    {
        int size = _attributeList.size();
        org.sourceforge.mbeanmonitoring.report.castor.Attribute[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.Attribute[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.Attribute) _attributeList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Attribute[] getAttribute() 

    /**
     * Method getAttributeCount
     */
    public int getAttributeCount()
    {
        return _attributeList.size();
    } //-- int getAttributeCount() 

    /**
     * Returns the value of field 'domain'.
     * 
     * @return the value of field 'domain'.
     */
    public org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType getDomain()
    {
        return this._domain;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType getDomain() 

    /**
     * Returns the value of field 'filename'.
     * 
     * @return the value of field 'filename'.
     */
    public java.lang.String getFilename()
    {
        return this._filename;
    } //-- java.lang.String getFilename() 

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
     * Method removeAllAttribute
     */
    public void removeAllAttribute()
    {
        _attributeList.removeAllElements();
    } //-- void removeAllAttribute() 

    /**
     * Method removeAttribute
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Attribute removeAttribute(int index)
    {
        java.lang.Object obj = _attributeList.elementAt(index);
        _attributeList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Attribute removeAttribute(int) 

    /**
     * Method setAttribute
     * 
     * @param index
     * @param vAttribute
     */
    public void setAttribute(int index, org.sourceforge.mbeanmonitoring.report.castor.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _attributeList.setElementAt(vAttribute, index);
    } //-- void setAttribute(int, org.sourceforge.mbeanmonitoring.report.castor.Attribute) 

    /**
     * Method setAttribute
     * 
     * @param attributeArray
     */
    public void setAttribute(org.sourceforge.mbeanmonitoring.report.castor.Attribute[] attributeArray)
    {
        //-- copy array
        _attributeList.removeAllElements();
        for (int i = 0; i < attributeArray.length; i++) {
            _attributeList.addElement(attributeArray[i]);
        }
    } //-- void setAttribute(org.sourceforge.mbeanmonitoring.report.castor.Attribute) 

    /**
     * Sets the value of field 'domain'.
     * 
     * @param domain the value of field 'domain'.
     */
    public void setDomain(org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType domain)
    {
        this._domain = domain;
    } //-- void setDomain(org.sourceforge.mbeanmonitoring.report.castor.types.MbeanDomainType) 

    /**
     * Sets the value of field 'filename'.
     * 
     * @param filename the value of field 'filename'.
     */
    public void setFilename(java.lang.String filename)
    {
        this._filename = filename;
    } //-- void setFilename(java.lang.String) 

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
    public static org.sourceforge.mbeanmonitoring.report.castor.Mbean unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Mbean.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Mbean unmarshal(java.io.Reader) 

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
