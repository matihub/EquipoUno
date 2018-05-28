package Modelo;

import java.util.List;

public class Aerolinea {
  private static String nombre;
  private String alianza;
  private List<Vuelo> vuelo;
  
  public Aerolinea(String nombre, String alianza, List<Vuelo> vuelo) {
	super();
	this.nombre = nombre;
	this.alianza = alianza;
	this.vuelo = vuelo;
}


public Aerolinea() {
	// TODO Auto-generated constructor stub
}


public static String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public static String getAlianza() {
	return alianza;
}
public void setAlianza(String alianza) {
	this.alianza = alianza;
}
public List<Vuelo> getVuelo() {
	return vuelo;
}
public void setVuelo(List<Vuelo> vuelo) {
	this.vuelo = vuelo;
}
}
