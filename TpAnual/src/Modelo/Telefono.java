package Modelo;

public class Telefono {
      private String nropersonal;
      private String nrocelular;
      private String nrolaboral;
      
	public Telefono(String nropersonal, String nrocelular, String nrolaboral) {
		super();
		this.nropersonal = nropersonal;
		this.nrocelular = nrocelular;
		this.nrolaboral = nrolaboral;
	}

	public Telefono() {
		// TODO Auto-generated constructor stub
	}

	public String getNropersonal() {
		return nropersonal;
	}
	public void setNropersonal(String nropersonal) {
		this.nropersonal = nropersonal;
	}
	public String getNrocelular() {
		return nrocelular;
	}
	public void setNrocelular(String nrocelular) {
		this.nrocelular = nrocelular;
	}
	public String getNrolaboral() {
		return nrolaboral;
	}
	public void setNrolaboral(String nrolaboral) {
		this.nrolaboral = nrolaboral;
	}
}
