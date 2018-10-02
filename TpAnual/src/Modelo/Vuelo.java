package Modelo;

public class Vuelo {
	
	private String nroVuelo;
	private String horaSalida;
	private String horaLlegada;
	private String lugarDestino;
	private String lugarOrigen;
	
	public Vuelo(String nroVuelo, String horaSalida, String horaLlegada, String lugarDestino, String lugarOrigen) {
		super();
		this.nroVuelo = nroVuelo;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.lugarDestino = lugarDestino;
		this.lugarOrigen = lugarOrigen;
	}
	
	public Vuelo() {
	}
	
	private Aeropuerto aeropuerto;

	public String getNroVuelo() {
		return nroVuelo;
	}

	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}

	public String getLugarOrigen() {
		return lugarOrigen;
	}

	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}

	public Aerolinea getAerolinea() {
		return getAerolinea();
	}

	public void setAerolinea(Aerolinea aerolinea) {
	}

}
