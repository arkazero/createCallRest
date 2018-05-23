package co.edu.javeriana.moval.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import co.edu.javeriana.aes.modval.pagos.boundary.PagosServiceService;
import co.edu.javeriana.aes.modval.pagos.boundary.PagosServiceServiceLocator;
import co.servicios.www.pagos.schemas.Pago;
import co.servicios.www.pagos.schemas.ReferenciaFactura;
import co.servicios.www.pagos.service.PagosInerface;

public class ClientSoapClient {
	
	public static void main (String[] args) throws RemoteException{
		PagosServiceServiceLocator locator = new PagosServiceServiceLocator();
		try {
			PagosInerface pagosWSServices = locator.getPagosServicePort();
			Pago input = new Pago();
			ReferenciaFactura refFactura = new ReferenciaFactura();
			refFactura.setReferenciaFactura("123");
			input.setReferenciaFactura(refFactura);
			input.setTotalPagar(1233.0);		
			System.out.println("El valor de la factra es: "+pagosWSServices.pagar(input).getMensaje());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
