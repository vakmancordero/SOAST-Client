
package soast.client.service.curso;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsdlCursoService", targetNamespace = "http://j2ee.netbeans.org/wsdl/WebApplication1/Esquema/WsdlCurso", wsdlLocation = "http://aimos-studio.com.mx:8080/Servicios/WsdlCursoService?wsdl")
public class WsdlCursoService
    extends Service
{

    private final static URL WSDLCURSOSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSDLCURSOSERVICE_EXCEPTION;
    private final static QName WSDLCURSOSERVICE_QNAME = new QName("http://j2ee.netbeans.org/wsdl/WebApplication1/Esquema/WsdlCurso", "WsdlCursoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://aimos-studio.com.mx:8080/Servicios/WsdlCursoService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSDLCURSOSERVICE_WSDL_LOCATION = url;
        WSDLCURSOSERVICE_EXCEPTION = e;
    }

    public WsdlCursoService() {
        super(__getWsdlLocation(), WSDLCURSOSERVICE_QNAME);
    }

    public WsdlCursoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSDLCURSOSERVICE_QNAME, features);
    }

    public WsdlCursoService(URL wsdlLocation) {
        super(wsdlLocation, WSDLCURSOSERVICE_QNAME);
    }

    public WsdlCursoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSDLCURSOSERVICE_QNAME, features);
    }

    public WsdlCursoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsdlCursoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsdlCursoPortType
     */
    @WebEndpoint(name = "WsdlCursoPort")
    public WsdlCursoPortType getWsdlCursoPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/WebApplication1/Esquema/WsdlCurso", "WsdlCursoPort"), WsdlCursoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsdlCursoPortType
     */
    @WebEndpoint(name = "WsdlCursoPort")
    public WsdlCursoPortType getWsdlCursoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/WebApplication1/Esquema/WsdlCurso", "WsdlCursoPort"), WsdlCursoPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSDLCURSOSERVICE_EXCEPTION!= null) {
            throw WSDLCURSOSERVICE_EXCEPTION;
        }
        return WSDLCURSOSERVICE_WSDL_LOCATION;
    }

}
