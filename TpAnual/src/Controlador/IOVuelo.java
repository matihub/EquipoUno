package Controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import DAO.Interfaces.VueloDAO;
import DAO.Interfaces.VueloDAO;
import Factory.VueloFactory;
import Modelo.Vuelo;
import Vista.EntradaSalida;

public class IOVuelo {
	
	
	EntradaSalida es = new EntradaSalida();
	List <Vuelo> VueloList = new ArrayList<Vuelo>();
	Vuelo Ven = new Vuelo();
	VueloDAO VueloDAO = new VueloFactory().getImplementation("String");
	
	public void consultarVuelo ( ) throws ParseException{
		try {
			   VueloList = VueloDAO.getAllVuelo();
			   if (VueloList.contains(null)){
				   throw new Exception ("no existen Vuelo");
			   }else {
				   for (int i = 0; i < VueloList.size(); i++) {
					    es.pritln(VueloList.get(i).getNroVuelo()+"\t"+VueloList.get(i).getLugarOrigen()+"\t"+VueloList.get(i).getLugarDestino()+"\t"+VueloList.get(i).getHoraSalida()+"\t"+VueloList.get(i).getHoraLlegada());
					   
				} 
				  
				   
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception<
			   EntradaSalida.pritln("se debe ingresar Vuelo");
			 
            	}
	}
	
	
	public void actualizarVuelo() throws FileNotFoundException, IOException {
		
		
		String num= es.leerFrase("ingrese numero a buscar");
		VueloList = VueloDAO.getAllVuelo();
		
		for (int i = 0; i < VueloList.size(); i++) {
			if (VueloList.get(i).getNroVuelo().equals((num))) {
				
				VueloList.set(i, ingresarVuelo());
			}
		}
		VueloDAO.modifyVuelo(VueloList);
		
	}
    
	public void mostrarVuelos() throws FileNotFoundException, IOException {
		VueloList = VueloDAO.getAllVuelo();
		for (int i = 0; i < VueloList.size(); i++) {
			es.pritln(i+"-"+VueloList.get(i).getNroVuelo());
			es.pritln(i+"-"+VueloList.get(i).getLugarOrigen());
			es.pritln(i+"-"+VueloList.get(i).getLugarDestino());
			es.pritln(i+"-"+VueloList.get(i).getHoraSalida());
			es.pritln(i+"-"+VueloList.get(i).getHoraLlegada());
		
		}
		
	}

	public Vuelo ingresarVuelo() {
		// TODO Auto-generated method stub
		Vuelo a = new Vuelo();
		IOAerolinea ioa = new IOAerolinea();
		a.setNroVuelo(es.leerFrase("ingrese numero de vuelo"));;
		a.setLugarOrigen(es.leerFrase("ingrese lugar de origen"));
        a.setLugarDestino(es.leerFrase("ingrese destino"));
        a.setHoraSalida(es.leerFrase("ingrese hora de salida de Vuelo"));
		a.setHoraLlegada(es.leerFrase("ingrese hora de llegada"));
	
		
			
		
		return a;
	}

    public void borrarVuelo() throws FileNotFoundException, IOException {
    	
    	String nom = es.leerFrase("ingrese Vuelo a eliminar");
    	VueloList= VueloDAO.getAllVuelo();
    	for (int i = 0; i < VueloList.size(); i++) {
		 if (VueloList.equals(nom)) {
			 
			 VueloList.remove(i);
			 
			
		} else {
            es.pritln("no se encuentra el Vuelo a buscar");    
		}
		 VueloDAO.modifyVuelo(VueloList);
		}
    	
    }

}