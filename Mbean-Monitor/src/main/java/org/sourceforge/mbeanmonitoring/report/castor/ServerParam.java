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
 * Class ServerParam.
 * 
 * @version $Revision$ $Date$
 */
public class ServerParam implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _host.
     */
    private java.lang.String _host = "localhost";

    /**
     * Field _port.
     */
    private short _port = 1099;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Field _genereTo.
     */
    private java.lang.String _genereTo;

    /**
     * Field _extension.
     */
    private java.lang.String _extension = "csv";

    /**
     * Field _maxFileSize.
     */
    private java.lang.String _maxFileSize = "1024KB";

    /**
     * Field _maxBackupIndex.
     */
    private int _maxBackupIndex = 10;

    /**
     * keeps track of state for field: _maxBackupIndex
     */
    private boolean _has_maxBackupIndex;

    /**
     * Field _delay.
     */
    private int _delay = 30;

    /**
     * keeps track of state for field: _delay
     */
    private boolean _has_delay;

    /**
     * Field _nbThreads.
     */
    private int _nbThreads = 10;

    /**
     * keeps track of state for field: _nbThreads
     */
    private boolean _has_nbThreads;

    /**
     * Field _separateur.
     */
    private java.lang.String _separateur = ";";

    /**
     * Field _mbeanList.
     */
    private java.util.Vector _mbeanList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ServerParam() {
        super();
        setHost("localhost");
        setExtension("csv");
        setMaxFileSize("1024KB");
        setSeparateur(";");
        this._mbeanList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMbean
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMbean(
            final org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
    throws java.lang.IndexOutOfBoundsException {
        this._mbeanList.addElement(vMbean);
    }

    /**
     * 
     * 
     * @param index
     * @param vMbean
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMbean(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
    throws java.lang.IndexOutOfBoundsException {
        this._mbeanList.add(index, vMbean);
    }

    /**
     */
    public void deleteDelay(
    ) {
        this._has_delay= false;
    }

    /**
     */
    public void deleteMaxBackupIndex(
    ) {
        this._has_maxBackupIndex= false;
    }

    /**
     */
    public void deleteNbThreads(
    ) {
        this._has_nbThreads= false;
    }

    /**
     */
    public void deletePort(
    ) {
        this._has_port= false;
    }

    /**
     * Method enumerateMbean.
     * 
     * @return an Enumeration over all
     * org.sourceforge.mbeanmonitoring.report.castor.Mbean elements
     */
    public java.util.Enumeration enumerateMbean(
    ) {
        return this._mbeanList.elements();
    }

    /**
     * Returns the value of field 'delay'.
     * 
     * @return the value of field 'Delay'.
     */
    public int getDelay(
    ) {
        return this._delay;
    }

    /**
     * Returns the value of field 'extension'.
     * 
     * @return the value of field 'Extension'.
     */
    public java.lang.String getExtension(
    ) {
        return this._extension;
    }

    /**
     * Returns the value of field 'genereTo'.
     * 
     * @return the value of field 'GenereTo'.
     */
    public java.lang.String getGenereTo(
    ) {
        return this._genereTo;
    }

    /**
     * Returns the value of field 'host'.
     * 
     * @return the value of field 'Host'.
     */
    public java.lang.String getHost(
    ) {
        return this._host;
    }

    /**
     * Returns the value of field 'maxBackupIndex'.
     * 
     * @return the value of field 'MaxBackupIndex'.
     */
    public int getMaxBackupIndex(
    ) {
        return this._maxBackupIndex;
    }

    /**
     * Returns the value of field 'maxFileSize'.
     * 
     * @return the value of field 'MaxFileSize'.
     */
    public java.lang.String getMaxFileSize(
    ) {
        return this._maxFileSize;
    }

    /**
     * Method getMbean.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.sourceforge.mbeanmonitoring.report.castor.Mbean at the
     * given index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean getMbean(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mbeanList.size()) {
            throw new IndexOutOfBoundsException("getMbean: Index value '" + index + "' not in range [0.." + (this._mbeanList.size() - 1) + "]");
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) _mbeanList.get(index);
    }

    /**
     * Method getMbean.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean[] getMbean(
    ) {
        org.sourceforge.mbeanmonitoring.report.castor.Mbean[] array = new org.sourceforge.mbeanmonitoring.report.castor.Mbean[0];
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean[]) this._mbeanList.toArray(array);
    }

    /**
     * Method getMbeanCount.
     * 
     * @return the size of this collection
     */
    public int getMbeanCount(
    ) {
        return this._mbeanList.size();
    }

    /**
     * Returns the value of field 'nbThreads'.
     * 
     * @return the value of field 'NbThreads'.
     */
    public int getNbThreads(
    ) {
        return this._nbThreads;
    }

    /**
     * Returns the value of field 'port'.
     * 
     * @return the value of field 'Port'.
     */
    public short getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'separateur'.
     * 
     * @return the value of field 'Separateur'.
     */
    public java.lang.String getSeparateur(
    ) {
        return this._separateur;
    }

    /**
     * Method hasDelay.
     * 
     * @return true if at least one Delay has been added
     */
    public boolean hasDelay(
    ) {
        return this._has_delay;
    }

    /**
     * Method hasMaxBackupIndex.
     * 
     * @return true if at least one MaxBackupIndex has been added
     */
    public boolean hasMaxBackupIndex(
    ) {
        return this._has_maxBackupIndex;
    }

    /**
     * Method hasNbThreads.
     * 
     * @return true if at least one NbThreads has been added
     */
    public boolean hasNbThreads(
    ) {
        return this._has_nbThreads;
    }

    /**
     * Method hasPort.
     * 
     * @return true if at least one Port has been added
     */
    public boolean hasPort(
    ) {
        return this._has_port;
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
    public void removeAllMbean(
    ) {
        this._mbeanList.clear();
    }

    /**
     * Method removeMbean.
     * 
     * @param vMbean
     * @return true if the object was removed from the collection.
     */
    public boolean removeMbean(
            final org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean) {
        boolean removed = _mbeanList.remove(vMbean);
        return removed;
    }

    /**
     * Method removeMbeanAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean removeMbeanAt(
            final int index) {
        java.lang.Object obj = this._mbeanList.remove(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) obj;
    }

    /**
     * Sets the value of field 'delay'.
     * 
     * @param delay the value of field 'delay'.
     */
    public void setDelay(
            final int delay) {
        this._delay = delay;
        this._has_delay = true;
    }

    /**
     * Sets the value of field 'extension'.
     * 
     * @param extension the value of field 'extension'.
     */
    public void setExtension(
            final java.lang.String extension) {
        this._extension = extension;
    }

    /**
     * Sets the value of field 'genereTo'.
     * 
     * @param genereTo the value of field 'genereTo'.
     */
    public void setGenereTo(
            final java.lang.String genereTo) {
        this._genereTo = genereTo;
    }

    /**
     * Sets the value of field 'host'.
     * 
     * @param host the value of field 'host'.
     */
    public void setHost(
            final java.lang.String host) {
        this._host = host;
    }

    /**
     * Sets the value of field 'maxBackupIndex'.
     * 
     * @param maxBackupIndex the value of field 'maxBackupIndex'.
     */
    public void setMaxBackupIndex(
            final int maxBackupIndex) {
        this._maxBackupIndex = maxBackupIndex;
        this._has_maxBackupIndex = true;
    }

    /**
     * Sets the value of field 'maxFileSize'.
     * 
     * @param maxFileSize the value of field 'maxFileSize'.
     */
    public void setMaxFileSize(
            final java.lang.String maxFileSize) {
        this._maxFileSize = maxFileSize;
    }

    /**
     * 
     * 
     * @param index
     * @param vMbean
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMbean(
            final int index,
            final org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mbeanList.size()) {
            throw new IndexOutOfBoundsException("setMbean: Index value '" + index + "' not in range [0.." + (this._mbeanList.size() - 1) + "]");
        }
        
        this._mbeanList.set(index, vMbean);
    }

    /**
     * 
     * 
     * @param vMbeanArray
     */
    public void setMbean(
            final org.sourceforge.mbeanmonitoring.report.castor.Mbean[] vMbeanArray) {
        //-- copy array
        _mbeanList.clear();
        
        for (int i = 0; i < vMbeanArray.length; i++) {
                this._mbeanList.add(vMbeanArray[i]);
        }
    }

    /**
     * Sets the value of field 'nbThreads'.
     * 
     * @param nbThreads the value of field 'nbThreads'.
     */
    public void setNbThreads(
            final int nbThreads) {
        this._nbThreads = nbThreads;
        this._has_nbThreads = true;
    }

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(
            final short port) {
        this._port = port;
        this._has_port = true;
    }

    /**
     * Sets the value of field 'separateur'.
     * 
     * @param separateur the value of field 'separateur'.
     */
    public void setSeparateur(
            final java.lang.String separateur) {
        this._separateur = separateur;
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
     * org.sourceforge.mbeanmonitoring.report.castor.ServerParam
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.ServerParam unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.sourceforge.mbeanmonitoring.report.castor.ServerParam) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.ServerParam.class, reader);
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
