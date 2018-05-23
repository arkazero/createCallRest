package co.edu.javeriana.modval.rs;

public class Invoice {
	private String idFactura;
	private Double valorFactura;
	private Boolean tipo;
	
	public Boolean getTipo() {
		return tipo;
	}
	public void setTipo(Boolean tipo) {
		this.tipo = tipo;
	}
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public Double getValorFactura() {
		return valorFactura;
	}
	public void setValorFactura(Double valorFactura) {
		this.valorFactura = valorFactura;
	}

}
