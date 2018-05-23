/**
 * PagosServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.javeriana.aes.modval.pagos.boundary;

public class PagosServiceServiceLocator extends org.apache.axis.client.Service implements co.edu.javeriana.aes.modval.pagos.boundary.PagosServiceService {

    public PagosServiceServiceLocator() {
    }


    public PagosServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PagosServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PagosServicePort
    private java.lang.String PagosServicePort_address = "http://35.185.30.69:7070/w1-soap-svr/PagosServiceService";

    public java.lang.String getPagosServicePortAddress() {
        return PagosServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PagosServicePortWSDDServiceName = "PagosServicePort";

    public java.lang.String getPagosServicePortWSDDServiceName() {
        return PagosServicePortWSDDServiceName;
    }

    public void setPagosServicePortWSDDServiceName(java.lang.String name) {
        PagosServicePortWSDDServiceName = name;
    }

    public co.servicios.www.pagos.service.PagosInerface getPagosServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PagosServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPagosServicePort(endpoint);
    }

    public co.servicios.www.pagos.service.PagosInerface getPagosServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.edu.javeriana.aes.modval.pagos.boundary.PagosServicePortBindingStub _stub = new co.edu.javeriana.aes.modval.pagos.boundary.PagosServicePortBindingStub(portAddress, this);
            _stub.setPortName(getPagosServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPagosServicePortEndpointAddress(java.lang.String address) {
        PagosServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.servicios.www.pagos.service.PagosInerface.class.isAssignableFrom(serviceEndpointInterface)) {
                co.edu.javeriana.aes.modval.pagos.boundary.PagosServicePortBindingStub _stub = new co.edu.javeriana.aes.modval.pagos.boundary.PagosServicePortBindingStub(new java.net.URL(PagosServicePort_address), this);
                _stub.setPortName(getPagosServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PagosServicePort".equals(inputPortName)) {
            return getPagosServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://boundary.pagos.modval.aes.javeriana.edu.co/", "PagosServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://boundary.pagos.modval.aes.javeriana.edu.co/", "PagosServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PagosServicePort".equals(portName)) {
            setPagosServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
