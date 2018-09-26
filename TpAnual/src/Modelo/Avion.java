package Modelo;

public class Avion {
	
	private String nombre;
	private String modelo;
	
	public Avion(String nombre, String modelo) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
	}

	public Avion() {
		// TODO Auto-generated constructor stub
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
	

}
