package Controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import DAO.Interfaces.VentaDAO;
import DAO.Interfaces.VueloDAO;
import Factory.VentaFactory;
import Modelo.Ventas;
import Vista.EntradaSalida;

public class IOVenta {
	
	
	EntradaSalida es = new EntradaSalida();
	List <Ventas> VentasList = new ArrayList<Ventas>();
	Ventas Ven = new Ventas();
	VentaDAO VentasDAO = new VentaFactory().getImplementation("String");
	
	public void consultarVentas ( ) throws ParseException{
		try {
			   VentasList = VentasDAO.getVentas();
			   if (VentasList.contains(null)){
				   throw new Exception ("no existen Ventas");
			   }else {
				   for (int i = 0; i < VentasList.size(); i++) {
					    es.pritln(VentasList.get(i).getClienteNumero()+"\t"+VentasList.get(i).getCantPasajeros()+"\t"+VentasList.get(i).getPrecioTotal()+"\t"+VentasList.get(i).getPrecioUnit()+"\t"+VentasList.get(i).getVentaNumero());
					   
				} 
				  
				   
			   }
			   
			   
			  } catch (Exception e) {
			   // TODO: handle exception<
			   EntradaSalida.pritln("se debe ingresar Ventas");
			 
            	}
	}
	
	
	public void actualizarVentas() throws FileNotFoundException, IOException {
		
		
		int nom= es.leerInt("ingrese numero a buscar", "numero mal ingresado");
		VentasList = VentasDAO.getVentas();
		
		for (int i = 0; i < VentasList.size(); i++) {
			if (VentasList.get(i).getVentaNumero().equals((nom))) {
				
				VentasList.set(i, ingresarVentas());
			}
		}
		VentasDAO.modifyVenta(VentasList);
		
	}
    
	public void mostrarVentass() throws FileNotFoundException, IOException {
		VentasList = VentasDAO.getVentas();
		for (int i = 0; i < VentasList.size(); i++) {
			es.pritln(i+"-"+VentasList.get(i).getCantPasajeros());
			es.pritln(i+"-"+VentasList.get(i).getClienteNumero());
			es.pritln(i+"-"+VentasList.get(i).getPrecioTotal());
			es.pritln(i+"-"+VentasList.get(i).getPrecioUnit());
			es.pritln(i+"-"+VentasList.get(i).getVentaNumero());
			
		}
		
	}

	public Ventas ingresarVentas() {
		// TODO Auto-generated method stub
		Ventas a = new Ventas();
		a.setCantPasajeros(es.leerInt("ingrese cantidad de pasajeros", "cantidad invalida"));;
		a.setClienteNumero(es.leerFrase("ingrese numero de cliente"));
        a.setPrecioTotal(es.leerInt("ingrese precios", "precio invalido"));
        a.setVentaNumero(es.leerFrase("ingrese numero de venta"));
		
		
			
		
		return a;
	}

    public void borrarVentas() throws FileNotFoundException, IOException {
    	
    	String nom = es.leerFrase("ingrese Ventas a eliminar");
    	VentasList= VentasDAO.getVentas();
    	for (int i = 0; i < VentasList.size(); i++) {
		 if (VentasList.equals(nom)) {
			 
			 VentasList.remove(i);
			 
			
		} else {
            es.pritln("no se encuentra el Ventas a buscar");    
		}
		 VentasDAO.modifyVenta(VentasList);
		}
    	
    }

}
