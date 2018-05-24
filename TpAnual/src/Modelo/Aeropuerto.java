package Modelo;

public class Aeropuerto {
	
	private String nombreAeropuerto;
	private long codigoAeropuerto;
	private String direccionAeropuerto;
	private String telefonoAeropuerto;
	public Aeropuerto(String nombreAeropuerto, long codigoAeropuerto, String direccionAeropuerto,
			String telefonoAeropuerto) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
		this.codigoAeropuerto = codigoAeropuerto;
		this.direccionAeropuerto = direccionAeropuerto;
		this.telefonoAeropuerto = telefonoAeropuerto;
	}
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}
	public long getCodigoAeropuerto() {
		return codigoAeropuerto;
	}
	public void setCodigoAeropuerto(long codigoAeropuerto) {
		this.codigoAeropuerto = codigoAeropuerto;
	}
	public String getDireccionAeropuerto() {
		return direccionAeropuerto;
	}
	public void setDireccionAeropuerto(String direccionAeropuerto) {
		this.direccionAeropuerto = direccionAeropuerto;
	}
	public String getTelefonoAeropuerto() {
		return telefonoAeropuerto;
	}
	public void setTelefonoAeropuerto(String telefonoAeropuerto) {
		this.telefonoAeropuerto = telefonoAeropuerto;
	}
	

}
