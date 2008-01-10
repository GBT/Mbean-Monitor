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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType;
import org.xml.sax.ContentHandler;

/**
 * Class MethodStat.
 * 
 * @version $Revision$ $Date$
 */
public class MethodStat implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType _name;


      //----------------/
     //- Constructors -/
    //----------------/

    public MethodStat() {
        super();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.MethodStat()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType getName()
    {
        return this._name;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType getName() 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType name)
    {
        this._name = name;
    } //-- void setName(org.sourceforge.mbeanmonitoring.report.castor.types.MethodStatNameType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.MethodStat unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.MethodStat) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.MethodStat.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.MethodStat unmarshal(java.io.Reader) 

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
