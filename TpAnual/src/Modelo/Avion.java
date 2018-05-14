package negocio.objetos;

import java.io.Serializable;

public class Avion implements Serializable {

	private static final long serialVersionUID = 1990422047866197931L;
	
	private int id;
	private int cant_asientos;
	private String nombre;
	private String modelo;
	private String nombre_aeropuerto;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCant_asientos() {
		return cant_asientos;
	}
	
	public void setCant_asientos(int cant_asientos) {
		this.cant_asientos = cant_asientos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNombre_aeropuerto() {
		return nombre_aeropuerto;
	}

	public void setNombre_aeropuerto(String nombre_aeropuerto) {
		this.nombre_aeropuerto = nombre_aeropuerto;
	}
}
