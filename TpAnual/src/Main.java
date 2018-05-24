

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import Vista.EntradaSalida;
import Vista.IOMenu;
import Controlador.*;
import Modelo.*;



public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EntradaSalida es = new EntradaSalida();
	
		

		IOMenu menu = new IOMenu();
	//	Habitacion h[] =new Habitacion[10];

	
	//	IOHuesped  ioc = new IOHuesped();

		
		int dni;
		int opcion;
		boolean fin = false;
		ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
		AvionDAO avionDAO = new AvionFactory().getImplementation("String");
		AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
		VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
		VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
		IOCliente ioc = new IOCliente();
		EntradaSalida es = new EntradaSalida();
		frame = new FramePrincipal(clienteDAO,avionDAO,aeropuertoDAO,vueloDAO,ventaDAO);
		
	
		while(!fin){
	//desplega el menu de opciones a elegir de la clase IOmenu
			opcion = menu.mostraropciones();
			
			switch(opcion){
				case 1:
	//
				
				//	h=hdata.getHabitacion();
					ioc.buscarCliente(es.leerInt("ingrese dni del cliente", "Dni Invalido"));
					es.pritln("\nleido hotel.");
					
	
					break;
					
					
			
				case 2 :
					dni = es.getEntero("ingrese dni del huesped");
			//		 hues= ioc.buscarhuesped(dni);
				
					 ior.ingresarReserva(dni);
					
					
					
				
				
				case 3:
					int habitacion = es.getEntero("ingrese habitacion a consultar");
					iocons.consultaconsumos(habitacion,r);
					 habitacion = es.getEntero("ingrese habitacion a ingresar consumo");
					iocons.ingresarconsumo(habitacion,r);
					
					
				case 4:
					 habitacion = es.getEntero("ingrese habitacion a liberar");
					ior.liberarreserva(habitacion,r);
				    
					
				case 5:
					 habitacion = es.getEntero("generar cupones");
					ior.generarcupon(r);
					
				case 6:
					fin = true;
					es.print("Fin del programa.");
					break;			
	}
			
}
}
}