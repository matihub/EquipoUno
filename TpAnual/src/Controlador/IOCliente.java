package Controlador;



import java.text.ParseException;
import java.util.Calendar;

import DAO.ClienteData;
import DAO.CuponesData;
import Vista.EntradaSalida;
import modelo.Habitacion;
import modelo.Huesped;

public class IOHuesped {
	EntradaSalida es = new EntradaSalida();
	ClienteData cl = new ClienteData();
	IOHuesped iohue = new IOHuesped();
	Huesped h = new Huesped();
//	CuponesData cd=new CuponesData();
	public Huesped buscarhuesped (int dni ) throws ParseException{
		try {
			   h = cl.obtenerhuespedes(dni);
			   if (h.equals(null)){
				   throw new Exception ("no existe el huesped");
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception
			   es.print("se debe ingresar huesped");
			   h = iohue.ingresarHuesped();
			    cl.guardarClientes(h);
			  }	
		return h;
				
	}
	
	
	


	public Huesped ingresarHuesped() {
		// TODO Auto-generated method stub
		Huesped h = new Huesped();
		int dni = es.getEntero("ingrese dni");
		String nombre = es.getCadena("ingrese nombre");
		String apellido = es.getCadena("ingrese apellido");
		Calendar fechanac = Calendar.getInstance();
		es.print("ingrese fecha de nacimiento ");
		int d= es.getEntero("Ingrese dia");
		int m= es.getEntero("Ingrese mes");
		int a= es.getEntero("Ingrese año");
		
		fechanac.set(Calendar.DATE, d);
		fechanac.set(Calendar.MONTH, m-1);
		fechanac.set(Calendar.YEAR, a);
        
		
		
		//ingresarcupon 
		//int numero = (int) (Math.random() * 100) + 1;
		//if (numero )
		
		
		
		h.setApellido(apellido);
		h.setNombre(nombre);
		h.setDni(dni);
		h.setFechanac(fechanac);
			
		
		return h;
	}





	
}




	
