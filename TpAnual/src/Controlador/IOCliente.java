package Controlador;



import java.text.ParseException;
import java.util.Calendar;

import DAO.ClienteData;
import Vista.EntradaSalida;
import Modelo.Cliente;

public class IOCliente {
	
	EntradaSalida es = new EntradaSalida();
	
	public Cliente buscarCliente (int dni ) throws ParseException{
		try {
			   h = cl.obtenerClientees(dni);
			   if (h.equals(null)){
				   throw new Exception ("no existe el Cliente");
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception
			   es.pritln("se debe ingresar Cliente");
			   c = iohue.ingresarCliente();
			    cl.guardarClientes(h);
			  }	
		return h;
				
	}
	
	
	


	public Cliente ingresarCliente() {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		int dni = es.leerInt("ingrese dni","ingrese dni valido");
		String nombre = es.leerLinea("ingrese nombre");
		String apellido = es.leerLinea("ingrese apellido");
		Calendar fechanac = Calendar.getInstance();
		es.pritln("ingrese fecha de nacimiento ");
		int d= es.getEntero("Ingrese dia");
		int m= es.getEntero("Ingrese mes");
		int a= es.getEntero("Ingrese año");
		
		fechanac.set(Calendar.DATE, d);
		fechanac.set(Calendar.MONTH, m-1);
		fechanac.set(Calendar.YEAR, a);
        
		
		
		//ingresarcupon 
		//int numero = (int) (Math.random() * 100) + 1;
		//if (numero )
		
		
		
		c.setApellido(apellido);
		c.setNombre(nombre);
		c.setDni(dni);
		c.setFechanac(fechanac);
			
		
		return c;
	}





	
}




	
