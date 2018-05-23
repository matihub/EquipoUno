package Modelo;

public class Direccion {
	
	private String calle ;
	private String altura;
	private String ciudad;
	private String provincia;
    private String pais;
    private int codigopostal;
    
	public Direccion(String calle, String altura, String ciudad, String provincia, String pais, int codigopostal) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigopostal = codigopostal;
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}
    
}
