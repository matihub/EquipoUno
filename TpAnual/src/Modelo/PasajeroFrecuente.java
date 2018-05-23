package Modelo;

public class PasajeroFrecuente {
  private String alianza;
  private Aerolinea lineaaerea;
  private String numero;
  private String categoria;
  
public PasajeroFrecuente(String alianza, Aerolinea lineaaerea, String numero, String categoria) {
	super();
	this.alianza = alianza;
	this.lineaaerea = lineaaerea;
	this.numero = numero;
	this.categoria = categoria;

public String getAlianza() {
	return alianza;
}
public void setAlianza(String alianza) {
	this.alianza = alianza;
}
public Aerolinea getLineaaerea() {
	return lineaaerea;
}
public void setLineaaerea(Aerolinea lineaaerea) {
	this.lineaaerea = lineaaerea;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
}
