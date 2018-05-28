package Controlador;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import DAO.Interfaces.AerolineaDAO;
import Factory.AerolineaFactory;
import Vista.EntradaSalida;
import Modelo.Aerolinea;

public class IOAerolinea {
	
	EntradaSalida es = new EntradaSalida();
	List <Aerolinea> cliList = new ArrayList<Aerolinea>();
	Aerolinea Aer = new Aerolinea();
	AerolineaDAO AerolineaDAO = new AerolineaFactory().getImplementation("String");
	
	public void consultarAerolinea (int dni ) throws ParseException{
		try {
			   cliList = AerolineaDAO.getAllAerolinea();
			   if (cliList.contains(null)){
				   throw new Exception ("no existen Aerolinea");
			   }else {
				   for (int i = 0; i < cliList.size(); i++) {
					    es.pritln(cliList.get(i).getNombre()+"\t"+cliList.get(i).getNombre()+"\t"+cliList.get(i).getCuil()+"\t"+cliList.get(i).getDni()+"\t"+cliList.get(i).getEmail()+"\t"+cliList.get(i));
					   
				} 
				  
				   
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception<
			   EntradaSalida.pritln("se debe ingresar Aerolinea");
			 
            	}
	}
	
	
	public void actualizarAerolinea() throws FileNotFoundException, IOException {
		
		
		int dni = es.leerInt("ingrese dni a buscar", "dni invalido");
		cliList = AerolineaDAO.getAllAerolinea();
		
		for (int i = 0; i < cliList.size(); i++) {
			if (cliList.get(i).getDni().equals((dni))) {
				
				cliList.set(i, ingresarAerolinea());
			}
		}
		AerolineaDAO.modifyAerolinea(cliList);
		
	}


	public Aerolinea ingresarAerolinea() {
		// TODO Auto-generated method stub
		Aerolinea c = new Aerolinea();
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

    public void borrarAerolinea() throws FileNotFoundException, IOException {
    	
    	int dni= es.leerInt("Ingresar dni a borrar", "dni invalido");
    	cliList= AerolineaDAO.getAllAerolinea();
    	for (int i = 0; i < cliList.size(); i++) {
		 if (cliList.get(i).getDni().equals(dni)) {
			 
			 cliList.remove(i);
			 
			
		} else {
            es.pritln("no se encuentra el Aerolinea a buscar");    
		}
		 AerolineaDAO.modifyAerolinea(cliList);
		}
    	
    }



	
}




	
