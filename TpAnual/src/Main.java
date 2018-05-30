

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import Vista.EntradaSalida;
import Vista.IOMenu;
import Controlador.*;
import DAO.Interfaces.ClienteDAO;
import Factory.ClienteFactory;
import Modelo.*;



public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EntradaSalida es = new EntradaSalida();
	
		

		IOMenu menu = new IOMenu();
			
		int dni;
		int opcion;
		boolean fin = false;
		ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
		
	//	AvionDAO avionDAO = new AvionFactory().getImplementation("String");
	//	AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
	//	VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
	//	VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
		IOCliente ioc = new IOCliente();
	    IOAerolinea ioa = new IOAerolinea();

	
		while(!fin){
	//desplega el menu de opciones a elegir de la clase IOmenu
			opcion = menu.mostraropciones();
			
			switch(opcion){
				case 1:
					ioc.consultarCliente(es.leerInt("ingrese dni del cliente", "Dni Invalido"));
					es.pritln("\nLeido.");
					
					break;
				case 2 :
				try {
					clienteDAO.addCliente(ioc.ingresarCliente());
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				    break;
				case 3:
					ioc.actualizarcliente();			
					break;
				case 4:
					ioc.borrarcliente();
					break;
				case 5:
	
		            ioa.consultarAerolinea();
					
				case 6:
					fin = true;
					es.pritln("Fin del programa.");
					break;			
	}
			
}
}
}