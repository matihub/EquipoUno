package Modelo;

import java.io.Serializable;

//public class Venta implements Serializable {

//	private static final long serialVersionUID = 3104458159980264510L;
	public class Venta{
	private int id;
	private Cliente cliente;
	private Vuelo vuelo;
	private String fecha_hora;
	private String nro_reserva;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}




	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getNro_reserva() {
		return nro_reserva;
	}
	public void setNro_reserva(String nro_reserva) {
		this.nro_reserva = nro_reserva;
	}
}
