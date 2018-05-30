package Modelo;

import java.io.Serializable;

public class Pasaporte implements Serializable {
//agregar los atrubutos gfeter setter y consytructores 
//Kagregar la clase vuelos y ventas con los atrubtos fijate le tema de las relaciones que ahya algunas que lleva otros objetos

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nroPasaporte;
	private String nacionalidad;
	private String sexoPers;
	private String nombre;
	private String apellido;
	
	public Pasaporte (int nroPasaporte, String nacionalidad, String sexoPers, String nombre, String apellido) {
	super();
	
	this.nroPasaporte = nroPasaporte;
	this.nacionalidad = nacionalidad;
	this.sexoPers = sexoPers;
	this.nombre = nombre;
	this.apellido = apellido;
	}
	
	public Pasaporte() {
		
	}

	public int getNroPasaporte() {
		return nroPasaporte;
	}

	public void setNroPasaporte(int i) {
		this.nroPasaporte = i;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexoPers() {
		return sexoPers;
	}

	public void setSexoPers(String sexoPers) {
		this.sexoPers = sexoPers;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

}
