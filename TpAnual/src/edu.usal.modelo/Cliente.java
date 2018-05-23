package negocio.objetos;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 2910710803462989429L;
	
	private int id;
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String email;
	private String telefono;
	private String nro_pasaporte;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNro_pasaporte() {
		return nro_pasaporte;
	}
	public void setNro_pasaporte(String nro_pasaporte) {
		this.nro_pasaporte = nro_pasaporte;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
