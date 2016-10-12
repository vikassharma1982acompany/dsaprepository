package com.sape.net.json.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-02T15:31:39.068+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "SubtractionImplService", 
                  wsdlLocation = "file:/D:/~Project/~Workspace/WebServiceSubtractConsumer/WebContent/WEB-INF/wsdl/subtraction.wsdl",
                  targetNamespace = "http://webservice.com/") 
public class SubtractionImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.com/", "SubtractionImplService");
    public final static QName SubtractionImplPort = new QName("http://webservice.com/", "SubtractionImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/~Project/~Workspace/WebServiceSubtractConsumer/WebContent/WEB-INF/wsdl/subtraction.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SubtractionImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/~Project/~Workspace/WebServiceSubtractConsumer/WebContent/WEB-INF/wsdl/subtraction.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SubtractionImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SubtractionImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubtractionImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SubtractionImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SubtractionImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SubtractionImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ISubtraction
     */
    @WebEndpoint(name = "SubtractionImplPort")
    public ISubtraction getSubtractionImplPort() {
        return super.getPort(SubtractionImplPort, ISubtraction.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISubtraction
     */
    @WebEndpoint(name = "SubtractionImplPort")
    public ISubtraction getSubtractionImplPort(WebServiceFeature... features) {
        return super.getPort(SubtractionImplPort, ISubtraction.class, features);
    }

}
