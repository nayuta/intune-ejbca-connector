
package org.ejbca.core.protocol.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.3
 * 2018-08-06T10:49:50.932+02:00
 * Generated source version: 3.1.3
 */

@WebFault(name = "DateNotValidException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class DateNotValidException_Exception extends Exception {
    
    private org.ejbca.core.protocol.ws.DateNotValidException dateNotValidException;

    public DateNotValidException_Exception() {
        super();
    }
    
    public DateNotValidException_Exception(String message) {
        super(message);
    }
    
    public DateNotValidException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public DateNotValidException_Exception(String message, org.ejbca.core.protocol.ws.DateNotValidException dateNotValidException) {
        super(message);
        this.dateNotValidException = dateNotValidException;
    }

    public DateNotValidException_Exception(String message, org.ejbca.core.protocol.ws.DateNotValidException dateNotValidException, Throwable cause) {
        super(message, cause);
        this.dateNotValidException = dateNotValidException;
    }

    public org.ejbca.core.protocol.ws.DateNotValidException getFaultInfo() {
        return this.dateNotValidException;
    }
}
