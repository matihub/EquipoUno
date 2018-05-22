package Modelo;

public class Aerolinea {
  private String nombre;
  private String alianza;
  
  public Aerolinea(String nombre, String alianza, Vuelo vuelo) {
	super();
	this.nombre = nombre;
	this.alianza = alianza;
	this.vuelo = vuelo;
}
private Vuelo vuelo;
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
public Vuelo getVuelo() {
	return vuelo;
}
public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
}
}
