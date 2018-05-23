/**
 * PagosServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.javeriana.aes.modval.pagos.boundary;

public interface PagosServiceService extends javax.xml.rpc.Service {
    public java.lang.String getPagosServicePortAddress();

    public co.servicios.www.pagos.service.PagosInerface getPagosServicePort() throws javax.xml.rpc.ServiceException;

    public co.servicios.www.pagos.service.PagosInerface getPagosServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
