package negocio.objetos;

import java.io.Serializable;

public class Vuelo implements Serializable {

	private static final long serialVersionUID = 8896868831124347675L;
	
	private int id;
	private int id_avion;
	private String nro_vuelo;
	private String fecha_hora;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_avion() {
		return id_avion;
	}
	public void setId_avion(int id_avion) {
		this.id_avion = id_avion;
	}
	public String getNro_vuelo() {
		return nro_vuelo;
	}
	public void setNro_vuelo(String nro_vuelo) {
		this.nro_vuelo = nro_vuelo;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
