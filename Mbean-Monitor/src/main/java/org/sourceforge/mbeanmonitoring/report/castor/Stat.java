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
 * Class Stat.
 * 
 * @version $Revision$ $Date$
 */
public class Stat implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _methodStatList
     */
    private java.util.Vector _methodStatList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Stat() {
        super();
        _methodStatList = new Vector();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Stat()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMethodStat
     * 
     * @param vMethodStat
     */
    public void addMethodStat(org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
        throws java.lang.IndexOutOfBoundsException
    {
        _methodStatList.addElement(vMethodStat);
    } //-- void addMethodStat(org.sourceforge.mbeanmonitoring.report.castor.MethodStat) 

    /**
     * Method addMethodStat
     * 
     * @param index
     * @param vMethodStat
     */
    public void addMethodStat(int index, org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
        throws java.lang.IndexOutOfBoundsException
    {
        _methodStatList.insertElementAt(vMethodStat, index);
    } //-- void addMethodStat(int, org.sourceforge.mbeanmonitoring.report.castor.MethodStat) 

    /**
     * Method enumerateMethodStat
     */
    public java.util.Enumeration enumerateMethodStat()
    {
        return _methodStatList.elements();
    } //-- java.util.Enumeration enumerateMethodStat() 

    /**
     * Method getMethodStat
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat getMethodStat(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _methodStatList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) _methodStatList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.MethodStat getMethodStat(int) 

    /**
     * Method getMethodStat
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] getMethodStat()
    {
        int size = _methodStatList.size();
        org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.MethodStat[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) _methodStatList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] getMethodStat() 

    /**
     * Method getMethodStatCount
     */
    public int getMethodStatCount()
    {
        return _methodStatList.size();
    } //-- int getMethodStatCount() 

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
     * Method removeAllMethodStat
     */
    public void removeAllMethodStat()
    {
        _methodStatList.removeAllElements();
    } //-- void removeAllMethodStat() 

    /**
     * Method removeMethodStat
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.MethodStat removeMethodStat(int index)
    {
        java.lang.Object obj = _methodStatList.elementAt(index);
        _methodStatList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.MethodStat removeMethodStat(int) 

    /**
     * Method setMethodStat
     * 
     * @param index
     * @param vMethodStat
     */
    public void setMethodStat(int index, org.sourceforge.mbeanmonitoring.report.castor.MethodStat vMethodStat)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _methodStatList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _methodStatList.setElementAt(vMethodStat, index);
    } //-- void setMethodStat(int, org.sourceforge.mbeanmonitoring.report.castor.MethodStat) 

    /**
     * Method setMethodStat
     * 
     * @param methodStatArray
     */
    public void setMethodStat(org.sourceforge.mbeanmonitoring.report.castor.MethodStat[] methodStatArray)
    {
        //-- copy array
        _methodStatList.removeAllElements();
        for (int i = 0; i < methodStatArray.length; i++) {
            _methodStatList.addElement(methodStatArray[i]);
        }
    } //-- void setMethodStat(org.sourceforge.mbeanmonitoring.report.castor.MethodStat) 

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
    public static org.sourceforge.mbeanmonitoring.report.castor.Stat unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Stat.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Stat unmarshal(java.io.Reader) 

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
