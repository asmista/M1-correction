package com.supinfo.suprails.webservices;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 */
@WebServiceClient(name = "tripService", targetNamespace = "http://webservices.suprails.supinfo.com/", wsdlLocation = "http://localhost:8080/SupRails_Start/tripService?wsdl")
public class TripService
        extends Service {

    private final static URL TRIPSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRIPSERVICE_EXCEPTION;
    private final static QName TRIPSERVICE_QNAME = new QName("http://webservices.suprails.supinfo.com/", "tripService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SupRails_Start/tripService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRIPSERVICE_WSDL_LOCATION = url;
        TRIPSERVICE_EXCEPTION = e;
    }

    public TripService() {
        super(__getWsdlLocation(), TRIPSERVICE_QNAME);
    }

    public TripService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRIPSERVICE_QNAME, features);
    }

    public TripService(URL wsdlLocation) {
        super(wsdlLocation, TRIPSERVICE_QNAME);
    }

    public TripService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRIPSERVICE_QNAME, features);
    }

    public TripService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TripService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns TripWebService
     */
    @WebEndpoint(name = "TripWebServicePort")
    public TripWebService getTripWebServicePort() {
        return super.getPort(new QName("http://webservices.suprails.supinfo.com/", "TripWebServicePort"), TripWebService.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns TripWebService
     */
    @WebEndpoint(name = "TripWebServicePort")
    public TripWebService getTripWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.suprails.supinfo.com/", "TripWebServicePort"), TripWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRIPSERVICE_EXCEPTION != null) {
            throw TRIPSERVICE_EXCEPTION;
        }
        return TRIPSERVICE_WSDL_LOCATION;
    }

}