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
 * Class Attribute.
 * 
 * @version $Revision$ $Date$
 */
public class Attribute implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _description
     */
    private java.lang.String _description = "description";

    /**
     * Field _statList
     */
    private java.util.Vector _statList;

    /**
     * Field _listList
     */
    private java.util.Vector _listList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Attribute() {
        super();
        setDescription("description");
        _statList = new Vector();
        _listList = new Vector();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Attribute()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addList
     * 
     * @param vList
     */
    public void addList(org.sourceforge.mbeanmonitoring.report.castor.List vList)
        throws java.lang.IndexOutOfBoundsException
    {
        _listList.addElement(vList);
    } //-- void addList(org.sourceforge.mbeanmonitoring.report.castor.List) 

    /**
     * Method addList
     * 
     * @param index
     * @param vList
     */
    public void addList(int index, org.sourceforge.mbeanmonitoring.report.castor.List vList)
        throws java.lang.IndexOutOfBoundsException
    {
        _listList.insertElementAt(vList, index);
    } //-- void addList(int, org.sourceforge.mbeanmonitoring.report.castor.List) 

    /**
     * Method addStat
     * 
     * @param vStat
     */
    public void addStat(org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
        throws java.lang.IndexOutOfBoundsException
    {
        _statList.addElement(vStat);
    } //-- void addStat(org.sourceforge.mbeanmonitoring.report.castor.Stat) 

    /**
     * Method addStat
     * 
     * @param index
     * @param vStat
     */
    public void addStat(int index, org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
        throws java.lang.IndexOutOfBoundsException
    {
        _statList.insertElementAt(vStat, index);
    } //-- void addStat(int, org.sourceforge.mbeanmonitoring.report.castor.Stat) 

    /**
     * Method enumerateList
     */
    public java.util.Enumeration enumerateList()
    {
        return _listList.elements();
    } //-- java.util.Enumeration enumerateList() 

    /**
     * Method enumerateStat
     */
    public java.util.Enumeration enumerateStat()
    {
        return _statList.elements();
    } //-- java.util.Enumeration enumerateStat() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Method getList
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List getList(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _listList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.List) _listList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.List getList(int) 

    /**
     * Method getList
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List[] getList()
    {
        int size = _listList.size();
        org.sourceforge.mbeanmonitoring.report.castor.List[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.List[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.List) _listList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.List[] getList() 

    /**
     * Method getListCount
     */
    public int getListCount()
    {
        return _listList.size();
    } //-- int getListCount() 

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
     * Method getStat
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat getStat(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _statList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) _statList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Stat getStat(int) 

    /**
     * Method getStat
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat[] getStat()
    {
        int size = _statList.size();
        org.sourceforge.mbeanmonitoring.report.castor.Stat[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.Stat[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.Stat) _statList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Stat[] getStat() 

    /**
     * Method getStatCount
     */
    public int getStatCount()
    {
        return _statList.size();
    } //-- int getStatCount() 

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
     * Method removeAllList
     */
    public void removeAllList()
    {
        _listList.removeAllElements();
    } //-- void removeAllList() 

    /**
     * Method removeAllStat
     */
    public void removeAllStat()
    {
        _statList.removeAllElements();
    } //-- void removeAllStat() 

    /**
     * Method removeList
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List removeList(int index)
    {
        java.lang.Object obj = _listList.elementAt(index);
        _listList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.List) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.List removeList(int) 

    /**
     * Method removeStat
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat removeStat(int index)
    {
        java.lang.Object obj = _statList.elementAt(index);
        _statList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Stat removeStat(int) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Method setList
     * 
     * @param index
     * @param vList
     */
    public void setList(int index, org.sourceforge.mbeanmonitoring.report.castor.List vList)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _listList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _listList.setElementAt(vList, index);
    } //-- void setList(int, org.sourceforge.mbeanmonitoring.report.castor.List) 

    /**
     * Method setList
     * 
     * @param listArray
     */
    public void setList(org.sourceforge.mbeanmonitoring.report.castor.List[] listArray)
    {
        //-- copy array
        _listList.removeAllElements();
        for (int i = 0; i < listArray.length; i++) {
            _listList.addElement(listArray[i]);
        }
    } //-- void setList(org.sourceforge.mbeanmonitoring.report.castor.List) 

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
     * Method setStat
     * 
     * @param index
     * @param vStat
     */
    public void setStat(int index, org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _statList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _statList.setElementAt(vStat, index);
    } //-- void setStat(int, org.sourceforge.mbeanmonitoring.report.castor.Stat) 

    /**
     * Method setStat
     * 
     * @param statArray
     */
    public void setStat(org.sourceforge.mbeanmonitoring.report.castor.Stat[] statArray)
    {
        //-- copy array
        _statList.removeAllElements();
        for (int i = 0; i < statArray.length; i++) {
            _statList.addElement(statArray[i]);
        }
    } //-- void setStat(org.sourceforge.mbeanmonitoring.report.castor.Stat) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.Attribute unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Attribute.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Attribute unmarshal(java.io.Reader) 

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
