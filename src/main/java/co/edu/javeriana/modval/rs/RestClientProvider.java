package co.edu.javeriana.modval.rs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.spi.container.ContainerResponse;

public class RestClientProvider {

	/*public static void main(String[] args) {

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		WebResource webResource = client.resource("http://localhost:8888/servicios/pagos/v1/payments/999");

		Invoice inv = new Invoice();
		inv.setIdFactura("999");
		inv.setValorFactura(9999.99);

		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, inv);

		System.out.println("Esta es la respuesta: " + response.getEntity(ResponseInvoice.class).getMensaje());
		System.out.println("Esta es la respuesta: " + response.getStatusInfo());

	}*/

	public Double consultarFactura(String numfactura) {
		System.out.println("Consultar Factura REST");
		Double valorTotal = 0.0;
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		WebResource webResource = client.resource("http://35.185.30.69:6060/servicios/pagos/v1/payments/"+numfactura);
		
		Invoice replyRest = new Invoice();
		
		ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
		
		replyRest = response.getEntity(Invoice.class);
		
		return replyRest.getValorFactura();
	}
	

	public String pagarFactura(String referenciaFactura, Double valorAPagar) {
		String mensajeResponse = null;
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		WebResource webResource = client.resource("http://35.185.30.69:6060/servicios/pagos/v1/payments/"+referenciaFactura);

		Invoice inv = new Invoice();
		inv.setIdFactura(referenciaFactura);
		inv.setValorFactura(valorAPagar);
		
		ResponseInvoice replyRest = new ResponseInvoice();

		ClientResponse response = webResource.type("application/json").post(ClientResponse.class);
		
	    replyRest = response.getEntity(ResponseInvoice.class);
		return replyRest.getIdFactura() + " -" + replyRest.getMensaje();
	}

	public String compensarFactura(String referenciaFactura, Double valorAPagar) {
		System.out.println("Entrando a Compensar REST");
		String mensaje = null;

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		WebResource webResource = client.resource("http://35.185.30.69:6060/servicios/pagos/v1/payments/"+referenciaFactura);

		Invoice inv = new Invoice();
		inv.setIdFactura(referenciaFactura);
		inv.setValorFactura(valorAPagar);

		ResponseInvoice replyRest = new ResponseInvoice();
		
		ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);

		
		replyRest = response.getEntity(ResponseInvoice.class);
		
		return replyRest.getIdFactura() + " -" + replyRest.getMensaje();
	}

}
