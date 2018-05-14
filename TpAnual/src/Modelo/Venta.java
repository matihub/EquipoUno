package negocio.objetos;

import java.io.Serializable;

public class Venta implements Serializable {

	private static final long serialVersionUID = 3104458159980264510L;
	
	private int id;
	private int id_cliente;
	private int id_vuelo;
	private String fecha_hora;
	private String nro_reserva;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
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
