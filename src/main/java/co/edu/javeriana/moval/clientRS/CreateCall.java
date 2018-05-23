package co.edu.javeriana.moval.clientRS;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.javeriana.modval.rs.Invoice;
import co.edu.javeriana.modval.rs.RestClientProvider;
import co.edu.javeriana.moval.ws.ClientSoapProvider;

@Path("/callProvider")
@Produces(MediaType.APPLICATION_JSON)
public class CreateCall {
	
	@GET()
	@Path("/search/{numfactura}/{tipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Double consultar(@PathParam("numfactura") String referencia, @PathParam("tipo") Integer tipo) {
		Double valorTotal = 0.0;
		System.out.println("********************************Servicio GET*****************");
		if( tipo == 1 ){
			ClientSoapProvider cliSoap = new ClientSoapProvider();
			valorTotal = cliSoap.consultarFactura(referencia);
			
		}else{
			RestClientProvider cliRest = new RestClientProvider();
			valorTotal = cliRest.consultarFactura(referencia);
		}
		
		return valorTotal;
	}
	
	@POST()
	@Path("/pagar/{numfactura}/{tipo}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public String pagar(@PathParam("numfactura") String referencia, @PathParam("tipo") Integer tipo, Invoice invoice){
		
		String mensaje = null;
		if( tipo == 1 ){
			System.out.println("Entrando a pagar por soap");
			ClientSoapProvider cliSoap = new ClientSoapProvider();
			System.out.println("Entrando a pagar por soap 2");
			mensaje = cliSoap.pagarFactura(invoice.getIdFactura(), invoice.getValorFactura());
			
		}else{
			System.out.println("Entrando a pagar por rest");
			RestClientProvider cliRest = new RestClientProvider();
			
			mensaje = cliRest.pagarFactura(invoice.getIdFactura(), invoice.getValorFactura());
		}
		
		return mensaje;
	}
	
	@DELETE()
	@Path("/compensar/{numfactura}/{tipo}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public String compensar(@PathParam("numfactura") String referencia, @PathParam("tipo") Integer tipo, Invoice invoice){
		
		String mensaje = null;
		
		if( tipo == 1 ){
			ClientSoapProvider cliSoap = new ClientSoapProvider();
			
			mensaje = cliSoap.compensarFactura(invoice.getIdFactura(), invoice.getValorFactura());
			
		}else{
			RestClientProvider cliRest = new RestClientProvider();
			mensaje = cliRest.compensarFactura(invoice.getIdFactura(), invoice.getValorFactura());
		}
		
		return mensaje;
	}
}
