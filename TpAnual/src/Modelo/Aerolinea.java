package Modelo;

import java.util.List;

public class Aerolinea {
  private String nombre;
  private String alianza;
  private List<Vuelo> vuelo;
  
  public Aerolinea(String nombre, String alianza, List<Vuelo> vuelo) {
	super();
	this.nombre = nombre;
	this.alianza = alianza;
	this.vuelo = vuelo;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getAlianza() {
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
