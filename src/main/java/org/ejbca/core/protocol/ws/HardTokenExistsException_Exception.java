
package org.ejbca.core.protocol.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.3
 * 2018-08-06T10:49:50.920+02:00
 * Generated source version: 3.1.3
 */

@WebFault(name = "HardTokenExistsException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class HardTokenExistsException_Exception extends Exception {
    
    private org.ejbca.core.protocol.ws.HardTokenExistsException hardTokenExistsException;

    public HardTokenExistsException_Exception() {
        super();
    }
    
    public HardTokenExistsException_Exception(String message) {
        super(message);
    }
    
    public HardTokenExistsException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public HardTokenExistsException_Exception(String message, org.ejbca.core.protocol.ws.HardTokenExistsException hardTokenExistsException) {
        super(message);
        this.hardTokenExistsException = hardTokenExistsException;
    }

    public HardTokenExistsException_Exception(String message, org.ejbca.core.protocol.ws.HardTokenExistsException hardTokenExistsException, Throwable cause) {
        super(message, cause);
        this.hardTokenExistsException = hardTokenExistsException;
    }

    public org.ejbca.core.protocol.ws.HardTokenExistsException getFaultInfo() {
        return this.hardTokenExistsException;
    }
}
