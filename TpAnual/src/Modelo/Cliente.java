package Modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Cliente implements Serializable {

//	private static final long serialVersionUID = 2910710803462989429L;
	
	
	private String nombre;
	private String apellido;
	private String dni;
	private String cuil;
	private PasajeroFrecuente psjfrec;
	private Direccion direccion;
	private String email;
	private Calendar fechanac;
	private Telefono telefono;
	private Pasaporte nro_pasaporte;
	

	public Cliente(String nombre, String apellido, String dni, String cuil, PasajeroFrecuente psjfrec,
			Direccion direccion, String email, Calendar fechanac, Telefono telefono, Pasaporte nro_pasaporte) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.psjfrec = psjfrec;
		this.direccion = direccion;
		this.email = email;
		this.fechanac = fechanac;
		this.telefono = telefono;
		this.nro_pasaporte = nro_pasaporte;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public PasajeroFrecuente getPsjfrec() {
		return psjfrec;
	}
	public void setPsjfrec(PasajeroFrecuente psjfrec) {
		this.psjfrec = psjfrec;
	}
	public Calendar getFechanac() {
		return fechanac;
	}
	public void setFechanac(Calendar fechanac2) {
		this.fechanac = fechanac2;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public void setNro_pasaporte(Pasaporte nro_pasaporte) {
		this.nro_pasaporte = nro_pasaporte;
	}
	public String getNombre() {
		return nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public Pasaporte getNro_pasaporte() {
		return nro_pasaporte;
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
	public void setDni(int dni2) {
		this.dni = dni2;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
