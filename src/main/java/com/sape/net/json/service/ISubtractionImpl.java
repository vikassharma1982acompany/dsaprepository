
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.sape.net.json.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-02T15:31:39.044+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "SubtractionImplService",
                      portName = "SubtractionImplPort",
                      targetNamespace = "http://webservice.com/",
                      wsdlLocation = "/WEB-INF/wsdl/subtraction.wsdl",
                      endpointInterface = "com.webservice.ISubtraction")
                      
public class ISubtractionImpl implements ISubtraction {

    private static final Logger LOG = Logger.getLogger(ISubtractionImpl.class.getName());

    /* (non-Javadoc)
     * @see com.webservice.ISubtraction#subtract(int  arg0 ,)int  arg1 )*
     */
    public int subtract(int arg0,int arg1) { 
        LOG.info("Executing operation subtract");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = -1365351854;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
