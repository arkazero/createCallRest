package co.edu.javeriana.moval.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import co.edu.javeriana.aes.modval.pagos.boundary.PagosServiceServiceLocator;
import co.servicios.www.pagos.schemas.Pago;
import co.servicios.www.pagos.schemas.ReferenciaFactura;
import co.servicios.www.pagos.service.PagosInerface;

public class ClientSoapProvider {

	public Double consultarFactura(String numfactura){
		PagosServiceServiceLocator locator = new PagosServiceServiceLocator();
		Double valorTotal = 0.0;
		
		try {
			PagosInerface pagosWSServices = locator.getPagosServicePort();
			ReferenciaFactura factura = new ReferenciaFactura();
			factura.setReferenciaFactura(numfactura);
			valorTotal = pagosWSServices.cosultar(factura).getTotalPagar();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return valorTotal;
	}
	
	public String pagarFactura(String referenciaFactura, Double valorAPagar){
		System.out.println("Entrando a recibir pago por SOAP");
		Pago pagoFactura = new Pago();
		String mensaje = null;
		
		ReferenciaFactura refFactura = new ReferenciaFactura();
		refFactura.setReferenciaFactura(referenciaFactura);
		
		pagoFactura.setReferenciaFactura(refFactura);
		pagoFactura.setTotalPagar(valorAPagar);
		
		PagosServiceServiceLocator locator = new PagosServiceServiceLocator();
		
		try {
			PagosInerface pagosWSServices = locator.getPagosServicePort();
			mensaje = pagosWSServices.pagar(pagoFactura).getMensaje();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mensaje;
	}
	
	public String compensarFactura(String referenciaFactura, Double valorAPagar){
		System.out.println("Entrando a compensar por SOAP");
		Pago pagoFactura = new Pago();
		String mensaje = null;
		
		ReferenciaFactura refFactura = new ReferenciaFactura();
		refFactura.setReferenciaFactura(referenciaFactura);
		
		pagoFactura.setReferenciaFactura(refFactura);
		pagoFactura.setTotalPagar(valorAPagar);
		
		PagosServiceServiceLocator locator = new PagosServiceServiceLocator();
		
		try {
			PagosInerface pagosWSServices = locator.getPagosServicePort();
			mensaje = pagosWSServices.compensar(pagoFactura).getMensaje();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mensaje;
	}
}
