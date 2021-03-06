
package it.unisa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VentilatoreEJBService", targetNamespace = "http://unisa.it/", wsdlLocation = "http://localhost:8080/VentilatoreEJBService/VentilatoreEJB?wsdl")
public class VentilatoreEJBService
    extends Service
{

    private final static URL VENTILATOREEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENTILATOREEJBSERVICE_EXCEPTION;
    private final static QName VENTILATOREEJBSERVICE_QNAME = new QName("http://unisa.it/", "VentilatoreEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/VentilatoreEJBService/VentilatoreEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENTILATOREEJBSERVICE_WSDL_LOCATION = url;
        VENTILATOREEJBSERVICE_EXCEPTION = e;
    }

    public VentilatoreEJBService() {
        super(__getWsdlLocation(), VENTILATOREEJBSERVICE_QNAME);
    }

    public VentilatoreEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENTILATOREEJBSERVICE_QNAME, features);
    }

    public VentilatoreEJBService(URL wsdlLocation) {
        super(wsdlLocation, VENTILATOREEJBSERVICE_QNAME);
    }

    public VentilatoreEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENTILATOREEJBSERVICE_QNAME, features);
    }

    public VentilatoreEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VentilatoreEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VentilatoreEJB
     */
    @WebEndpoint(name = "VentilatoreEJBPort")
    public VentilatoreEJB getVentilatoreEJBPort() {
        return super.getPort(new QName("http://unisa.it/", "VentilatoreEJBPort"), VentilatoreEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VentilatoreEJB
     */
    @WebEndpoint(name = "VentilatoreEJBPort")
    public VentilatoreEJB getVentilatoreEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://unisa.it/", "VentilatoreEJBPort"), VentilatoreEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENTILATOREEJBSERVICE_EXCEPTION!= null) {
            throw VENTILATOREEJBSERVICE_EXCEPTION;
        }
        return VENTILATOREEJBSERVICE_WSDL_LOCATION;
    }

}
