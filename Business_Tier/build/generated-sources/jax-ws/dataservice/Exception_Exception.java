
package dataservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://DataService/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private dataservice.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, dataservice.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, dataservice.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: dataservice.Exception
     */
    public dataservice.Exception getFaultInfo() {
        return faultInfo;
    }

}