package Modelo;

import java.io.Serializable;

//public class Aeropuerto implements Serializable {
public class Aeropuerto {
//	private static final long serialVersionUID = -977326194551887029L;
	
	private String nombre;
	private String pais;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
