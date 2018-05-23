package Modelo;

public class Ventas {
	
	private String ventaNumero;
	private String clienteNumero;
	private long precioUnit;
	private long precioTotal;
	private int cantPasajeros;
	
	public Ventas(String ventaNumero, String clienteNumero, long precioUnit, long precioTotal, int cantPasajeros) {
		super();
		this.ventaNumero = ventaNumero;
		this.clienteNumero = clienteNumero;
		this.precioUnit = precioUnit;
		this.precioTotal = precioTotal;
		this.cantPasajeros = cantPasajeros;
	}
	public String getVentaNumero() {
		return ventaNumero;
	}
	public void setVentaNumero(String ventaNumero) {
		this.ventaNumero = ventaNumero;
	}
	public String getClienteNumero() {
		return clienteNumero;
	}
	public void setClienteNumero(String clienteNumero) {
		this.clienteNumero = clienteNumero;
	}
	public long getPrecioUnit() {
		return precioUnit;
	}
	public void setPrecioUnit(long precioUnit) {
		this.precioUnit = precioUnit;
	}
	public long getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(long precioTotal) {
		this.precioTotal = precioTotal;
	}
	public int getCantPasajeros() {
		return cantPasajeros;
	}
	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}
	
	
	
}
