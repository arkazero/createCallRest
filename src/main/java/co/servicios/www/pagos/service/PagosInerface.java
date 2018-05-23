/**
 * PagosInerface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.servicios.www.pagos.service;

public interface PagosInerface extends java.rmi.Remote {
    public co.servicios.www.pagos.schemas.ResultadoConsulta cosultar(co.servicios.www.pagos.schemas.ReferenciaFactura input) throws java.rmi.RemoteException;
    public co.servicios.www.pagos.schemas.Resultado pagar(co.servicios.www.pagos.schemas.Pago input) throws java.rmi.RemoteException;
    public co.servicios.www.pagos.schemas.Resultado compensar(co.servicios.www.pagos.schemas.Pago input) throws java.rmi.RemoteException;
}
