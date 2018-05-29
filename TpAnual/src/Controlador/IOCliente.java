package Controlador;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import DAO.Interfaces.ClienteDAO;
import Factory.ClienteFactory;
import Vista.EntradaSalida;
import Modelo.Cliente;

public class IOCliente {
	
	EntradaSalida es = new EntradaSalida();
	List <Cliente> cliList = new ArrayList<Cliente>();
	Cliente cl = new Cliente();
	ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
	
	public void consultarCliente (int dni ) throws ParseException{
		try {
			   cliList = clienteDAO.getAllCliente();
			   if (cliList.contains(null)){
				   throw new Exception ("no existen cliente");
			   }else {
				   for (int i = 0; i < cliList.size(); i++) {
					    es.pritln(cliList.get(i).getNombre()+"\t"+cliList.get(i).getNombre()+"\t"+cliList.get(i).getCuil()+"\t"+cliList.get(i).getDni()+"\t"+cliList.get(i).getEmail()+"\t"+cliList.get(i));
					   
				} 
				  
				   
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception<
			   EntradaSalida.pritln("no existe archivo clientes");
			 
            	}
	}
	
	
	public void actualizarcliente() throws FileNotFoundException, IOException {
		
		
		int dni = es.leerInt("ingrese dni a buscar", "dni invalido");
		cliList = clienteDAO.getAllCliente();
		
		for (int i = 0; i < cliList.size(); i++) {
			if (cliList.get(i).getDni().equals((dni))) {
				
				cliList.set(i, ingresarCliente());
			}
		}
		clienteDAO.modifyCliente(cliList);
		
	}


	public Cliente ingresarCliente() {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		int dni = es.leerInt("ingrese dni","ingrese dni valido");
		String nombre = es.leerLinea("ingrese nombre");
		String apellido = es.leerLinea("ingrese apellido");
		Calendar fechanac = Calendar.getInstance();
		es.pritln("ingrese fecha de nacimiento ");
		int d= es.leerInt("Ingrese dia","ingrese dia valido");
		int m= es.leerInt("Ingrese mes","ingrese dia valido");
		int a= es.leerInt("Ingrese año","ingrese dia valido");
		
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

    public void borrarcliente() throws FileNotFoundException, IOException {
    	
    	int dni= es.leerInt("Ingresar dni a borrar", "dni invalido");
    	cliList= clienteDAO.getAllCliente();
    	for (int i = 0; i < cliList.size(); i++) {
		 if (cliList.get(i).getDni().equals(dni)) {
			 
			 cliList.remove(i);
			 
			
		} else {
            es.pritln("no se encuentra el cliente a buscar");    
		}
		 clienteDAO.modifyCliente(cliList);
		}
    	
    }



	
}




	
