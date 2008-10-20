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
 * Class Attribute.
 * 
 * @version $Revision$ $Date$
 */
public class Attribute implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _description.
     */
    private java.lang.String _description = "description";

    /**
     * Field _regexpr.
     */
    private java.lang.String _regexpr;

    /**
     * Field _statList.
     */
    private java.util.Vector _statList;

    /**
     * Field _listList.
     */
    private java.util.Vector _listList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Attribute() {
        super();
        setDescription("description");
        this._statList = new java.util.Vector();
        this._listList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vList
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addList(
            final org.sourceforge.mbeanmonitoring.report.castor.List vList)
    throws java.lang.IndexOutOfBoundsException {
        this._listList.addElement(vList);
    }

    /**
     * 
     * 
     * @param index
     * @param vList
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addList(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.List vList)
    throws java.lang.IndexOutOfBoundsException {
        this._listList.add(index, vList);
    }

    /**
     * 
     * 
     * @param vStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStat(
            final org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
    throws java.lang.IndexOutOfBoundsException {
        this._statList.addElement(vStat);
    }

    /**
     * 
     * 
     * @param index
     * @param vStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStat(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
    throws java.lang.IndexOutOfBoundsException {
        this._statList.add(index, vStat);
    }

    /**
     * Method enumerateList.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.List elements
     */
    public java.util.Enumeration enumerateList(
    ) {
        return this._listList.elements();
    }

    /**
     * Method enumerateStat.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.Stat elements
     */
    public java.util.Enumeration enumerateStat(
    ) {
        return this._statList.elements();
    }

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Method getList.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.List at the
     * given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List getList(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listList.size()) {
            throw new IndexOutOfBoundsException("getList: Index value '" + index + "' not in range [0.." + (this._listList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.List) _listList.get(index);
    }

    /**
     * Method getList.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List[] getList(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.List[] array = new org.sourceforge.mbeanmonitoring.report.castor.List[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.List[]) this._listList.toArray(array);
    }

    /**
     * Method getListCount.
     * 
     * @return the size of this collection
     */
    public int getListCount(
    ) {
        return this._listList.size();
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
     * Returns the value of field 'regexpr'.
     * 
     * @return the value of field 'Regexpr'.
     */
    public java.lang.String getRegexpr(
    ) {
        return this._regexpr;
    }

    /**
     * Method getStat.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.Stat at the
     * given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat getStat(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statList.size()) {
            throw new IndexOutOfBoundsException("getStat: Index value '" + index + "' not in range [0.." + (this._statList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) _statList.get(index);
    }

    /**
     * Method getStat.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat[] getStat(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.Stat[] array = new org.sourceforge.mbeanmonitoring.report.castor.Stat[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat[]) this._statList.toArray(array);
    }

    /**
     * Method getStatCount.
     * 
     * @return the size of this collection
     */
    public int getStatCount(
    ) {
        return this._statList.size();
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
    public void removeAllList(
    ) {
        this._listList.clear();
    }

    /**
     */
    public void removeAllStat(
    ) {
        this._statList.clear();
    }

    /**
     * Method removeList.
     * 
     * @param vList
     * @return true if the object was removed from the collection.
     */
    public boolean removeList(
            final org.sourceforge.mbeanmonitoring.report.castor.List vList) {
        boolean removed = _listList.remove(vList);
        return removed;
    }

    /**
     * Method removeListAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.List removeListAt(
            final int index) {
        java.lang.Object obj = this._listList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.List) obj;
    }

    /**
     * Method removeStat.
     * 
     * @param vStat
     * @return true if the object was removed from the collection.
     */
    public boolean removeStat(
            final org.sourceforge.mbeanmonitoring.report.castor.Stat vStat) {
        boolean removed = _statList.remove(vStat);
        return removed;
    }

    /**
     * Method removeStatAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Stat removeStatAt(
            final int index) {
        java.lang.Object obj = this._statList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Stat) obj;
    }

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * 
     * 
     * @param index
     * @param vList
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setList(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.List vList)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._listList.size()) {
            throw new IndexOutOfBoundsException("setList: Index value '" + index + "' not in range [0.." + (this._listList.size() - 1) + "]");
        }
        
        this._listList.set(index, vList);
    }

    /**
     * 
     * 
     * @param vListArray
     */
    public void setList(
            final org.sourceforge.mbeanmonitoring.report.castor.List[] vListArray) {
        //-- copy array
        _listList.clear();
        
        for (int i = 0; i < vListArray.length; i++) {
                this._listList.add(vListArray[i]);
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
     * Sets the value of field 'regexpr'.
     * 
     * @param regexpr the value of field 'regexpr'.
     */
    public void setRegexpr(
            final java.lang.String regexpr) {
        this._regexpr = regexpr;
    }

    /**
     * 
     * 
     * @param index
     * @param vStat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStat(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Stat vStat)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statList.size()) {
            throw new IndexOutOfBoundsException("setStat: Index value '" + index + "' not in range [0.." + (this._statList.size() - 1) + "]");
        }
        
        this._statList.set(index, vStat);
    }

    /**
     * 
     * 
     * @param vStatArray
     */
    public void setStat(
            final org.sourceforge.mbeanmonitoring.report.castor.Stat[] vStatArray) {
        //-- copy array
        _statList.clear();
        
        for (int i = 0; i < vStatArray.length; i++) {
                this._statList.add(vStatArray[i]);
        }
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
     * org.sourceforge.mbeanmonitoring.report.castor.Attribute
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.Attribute unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.sourceforge.mbeanmonitoring.report.castor.Attribute) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.Attribute.class, reader);
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
