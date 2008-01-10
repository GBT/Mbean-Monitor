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
 * Class ServerParam.
 * 
 * @version $Revision$ $Date$
 */
public class ServerParam implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _host
     */
    private java.lang.String _host = "localhost";

    /**
     * Field _port
     */
    private short _port = 1099;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Field _genereTo
     */
    private java.lang.String _genereTo;

    /**
     * Field _extension
     */
    private java.lang.String _extension = "csv";

    /**
     * Field _maxFileSize
     */
    private java.lang.String _maxFileSize = "1024KB";

    /**
     * Field _maxBackupIndex
     */
    private int _maxBackupIndex = 10;

    /**
     * keeps track of state for field: _maxBackupIndex
     */
    private boolean _has_maxBackupIndex;

    /**
     * Field _delay
     */
    private int _delay = 30;

    /**
     * keeps track of state for field: _delay
     */
    private boolean _has_delay;

    /**
     * Field _nbThreads
     */
    private int _nbThreads = 10;

    /**
     * keeps track of state for field: _nbThreads
     */
    private boolean _has_nbThreads;

    /**
     * Field _separateur
     */
    private java.lang.String _separateur = ";";

    /**
     * Field _mbeanList
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
        _mbeanList = new Vector();
    } //-- org.sourceforge.mbeanmonitoring.report.castor.ServerParam()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMbean
     * 
     * @param vMbean
     */
    public void addMbean(org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
        throws java.lang.IndexOutOfBoundsException
    {
        _mbeanList.addElement(vMbean);
    } //-- void addMbean(org.sourceforge.mbeanmonitoring.report.castor.Mbean) 

    /**
     * Method addMbean
     * 
     * @param index
     * @param vMbean
     */
    public void addMbean(int index, org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
        throws java.lang.IndexOutOfBoundsException
    {
        _mbeanList.insertElementAt(vMbean, index);
    } //-- void addMbean(int, org.sourceforge.mbeanmonitoring.report.castor.Mbean) 

    /**
     * Method deleteDelay
     */
    public void deleteDelay()
    {
        this._has_delay= false;
    } //-- void deleteDelay() 

    /**
     * Method deleteMaxBackupIndex
     */
    public void deleteMaxBackupIndex()
    {
        this._has_maxBackupIndex= false;
    } //-- void deleteMaxBackupIndex() 

    /**
     * Method deleteNbThreads
     */
    public void deleteNbThreads()
    {
        this._has_nbThreads= false;
    } //-- void deleteNbThreads() 

    /**
     * Method deletePort
     */
    public void deletePort()
    {
        this._has_port= false;
    } //-- void deletePort() 

    /**
     * Method enumerateMbean
     */
    public java.util.Enumeration enumerateMbean()
    {
        return _mbeanList.elements();
    } //-- java.util.Enumeration enumerateMbean() 

    /**
     * Returns the value of field 'delay'.
     * 
     * @return the value of field 'delay'.
     */
    public int getDelay()
    {
        return this._delay;
    } //-- int getDelay() 

    /**
     * Returns the value of field 'extension'.
     * 
     * @return the value of field 'extension'.
     */
    public java.lang.String getExtension()
    {
        return this._extension;
    } //-- java.lang.String getExtension() 

    /**
     * Returns the value of field 'genereTo'.
     * 
     * @return the value of field 'genereTo'.
     */
    public java.lang.String getGenereTo()
    {
        return this._genereTo;
    } //-- java.lang.String getGenereTo() 

    /**
     * Returns the value of field 'host'.
     * 
     * @return the value of field 'host'.
     */
    public java.lang.String getHost()
    {
        return this._host;
    } //-- java.lang.String getHost() 

    /**
     * Returns the value of field 'maxBackupIndex'.
     * 
     * @return the value of field 'maxBackupIndex'.
     */
    public int getMaxBackupIndex()
    {
        return this._maxBackupIndex;
    } //-- int getMaxBackupIndex() 

    /**
     * Returns the value of field 'maxFileSize'.
     * 
     * @return the value of field 'maxFileSize'.
     */
    public java.lang.String getMaxFileSize()
    {
        return this._maxFileSize;
    } //-- java.lang.String getMaxFileSize() 

    /**
     * Method getMbean
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean getMbean(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _mbeanList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) _mbeanList.elementAt(index);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Mbean getMbean(int) 

    /**
     * Method getMbean
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean[] getMbean()
    {
        int size = _mbeanList.size();
        org.sourceforge.mbeanmonitoring.report.castor.Mbean[] mArray = new org.sourceforge.mbeanmonitoring.report.castor.Mbean[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.sourceforge.mbeanmonitoring.report.castor.Mbean) _mbeanList.elementAt(index);
        }
        return mArray;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Mbean[] getMbean() 

    /**
     * Method getMbeanCount
     */
    public int getMbeanCount()
    {
        return _mbeanList.size();
    } //-- int getMbeanCount() 

    /**
     * Returns the value of field 'nbThreads'.
     * 
     * @return the value of field 'nbThreads'.
     */
    public int getNbThreads()
    {
        return this._nbThreads;
    } //-- int getNbThreads() 

    /**
     * Returns the value of field 'port'.
     * 
     * @return the value of field 'port'.
     */
    public short getPort()
    {
        return this._port;
    } //-- short getPort() 

    /**
     * Returns the value of field 'separateur'.
     * 
     * @return the value of field 'separateur'.
     */
    public java.lang.String getSeparateur()
    {
        return this._separateur;
    } //-- java.lang.String getSeparateur() 

    /**
     * Method hasDelay
     */
    public boolean hasDelay()
    {
        return this._has_delay;
    } //-- boolean hasDelay() 

    /**
     * Method hasMaxBackupIndex
     */
    public boolean hasMaxBackupIndex()
    {
        return this._has_maxBackupIndex;
    } //-- boolean hasMaxBackupIndex() 

    /**
     * Method hasNbThreads
     */
    public boolean hasNbThreads()
    {
        return this._has_nbThreads;
    } //-- boolean hasNbThreads() 

    /**
     * Method hasPort
     */
    public boolean hasPort()
    {
        return this._has_port;
    } //-- boolean hasPort() 

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
     * Method removeAllMbean
     */
    public void removeAllMbean()
    {
        _mbeanList.removeAllElements();
    } //-- void removeAllMbean() 

    /**
     * Method removeMbean
     * 
     * @param index
     */
    public org.sourceforge.mbeanmonitoring.report.castor.Mbean removeMbean(int index)
    {
        java.lang.Object obj = _mbeanList.elementAt(index);
        _mbeanList.removeElementAt(index);
        return (org.sourceforge.mbeanmonitoring.report.castor.Mbean) obj;
    } //-- org.sourceforge.mbeanmonitoring.report.castor.Mbean removeMbean(int) 

    /**
     * Sets the value of field 'delay'.
     * 
     * @param delay the value of field 'delay'.
     */
    public void setDelay(int delay)
    {
        this._delay = delay;
        this._has_delay = true;
    } //-- void setDelay(int) 

    /**
     * Sets the value of field 'extension'.
     * 
     * @param extension the value of field 'extension'.
     */
    public void setExtension(java.lang.String extension)
    {
        this._extension = extension;
    } //-- void setExtension(java.lang.String) 

    /**
     * Sets the value of field 'genereTo'.
     * 
     * @param genereTo the value of field 'genereTo'.
     */
    public void setGenereTo(java.lang.String genereTo)
    {
        this._genereTo = genereTo;
    } //-- void setGenereTo(java.lang.String) 

    /**
     * Sets the value of field 'host'.
     * 
     * @param host the value of field 'host'.
     */
    public void setHost(java.lang.String host)
    {
        this._host = host;
    } //-- void setHost(java.lang.String) 

    /**
     * Sets the value of field 'maxBackupIndex'.
     * 
     * @param maxBackupIndex the value of field 'maxBackupIndex'.
     */
    public void setMaxBackupIndex(int maxBackupIndex)
    {
        this._maxBackupIndex = maxBackupIndex;
        this._has_maxBackupIndex = true;
    } //-- void setMaxBackupIndex(int) 

    /**
     * Sets the value of field 'maxFileSize'.
     * 
     * @param maxFileSize the value of field 'maxFileSize'.
     */
    public void setMaxFileSize(java.lang.String maxFileSize)
    {
        this._maxFileSize = maxFileSize;
    } //-- void setMaxFileSize(java.lang.String) 

    /**
     * Method setMbean
     * 
     * @param index
     * @param vMbean
     */
    public void setMbean(int index, org.sourceforge.mbeanmonitoring.report.castor.Mbean vMbean)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _mbeanList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _mbeanList.setElementAt(vMbean, index);
    } //-- void setMbean(int, org.sourceforge.mbeanmonitoring.report.castor.Mbean) 

    /**
     * Method setMbean
     * 
     * @param mbeanArray
     */
    public void setMbean(org.sourceforge.mbeanmonitoring.report.castor.Mbean[] mbeanArray)
    {
        //-- copy array
        _mbeanList.removeAllElements();
        for (int i = 0; i < mbeanArray.length; i++) {
            _mbeanList.addElement(mbeanArray[i]);
        }
    } //-- void setMbean(org.sourceforge.mbeanmonitoring.report.castor.Mbean) 

    /**
     * Sets the value of field 'nbThreads'.
     * 
     * @param nbThreads the value of field 'nbThreads'.
     */
    public void setNbThreads(int nbThreads)
    {
        this._nbThreads = nbThreads;
        this._has_nbThreads = true;
    } //-- void setNbThreads(int) 

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(short port)
    {
        this._port = port;
        this._has_port = true;
    } //-- void setPort(short) 

    /**
     * Sets the value of field 'separateur'.
     * 
     * @param separateur the value of field 'separateur'.
     */
    public void setSeparateur(java.lang.String separateur)
    {
        this._separateur = separateur;
    } //-- void setSeparateur(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.sourceforge.mbeanmonitoring.report.castor.ServerParam unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.sourceforge.mbeanmonitoring.report.castor.ServerParam) Unmarshaller.unmarshal(org.sourceforge.mbeanmonitoring.report.castor.ServerParam.class, reader);
    } //-- org.sourceforge.mbeanmonitoring.report.castor.ServerParam unmarshal(java.io.Reader) 

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
