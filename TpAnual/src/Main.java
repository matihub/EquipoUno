

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



import Vista.EntradaSalida;
import Vista.IOMenu;
import Vista.MenuGeneral;
import Controlador.*;
import Modelo.*;




public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  MenuGeneral.show(); 		

//		IOMenu menu = new IOMenu();
//			
//		int dni;
//		int opcion;
//		boolean fin = false;
//		ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
//		
//	//	AvionDAO avionDAO = new AvionFactory().getImplementation("String");
//	//	AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
//	//	VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
//	//	VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
//		IOCliente ioc = new IOCliente();
//	    IOAerolinea ioa = new IOAerolinea();
////ultima version desde tasass
//	    //agregar un aexcepcion en los close de los dao
//	    // generar la excepcion propia 
//	    //llamar al controller desde el menu 
//	    // fin de modificaciones 
//	    
//	    
//	
//		while(!fin){
//	//desplega el menu de opciones a elegir de la clase IOmenu
//			opcion = menu.mostraropciones();
//			
//			switch(opcion){
//				case 1:
//					ioc.consultarCliente(es.leerInt("ingrese dni del cliente", "Dni Invalido"));
//					es.pritln("\nLeido.");
//					
//					break;
//				case 2 :
//			
//				try {
//					boolean verify = clienteDAO.addCliente(ioc.ingresarCliente());
//					 if (verify) {
//						   es.pritln("grabo correcto");
//						
//					}
//					   else{
//						   es.pritln("error al grabar");
//					   }
//				} catch (Throwable e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					
//				}
//				  
//				    break;
//				case 3:
//				try {
//					ioc.actualizarcliente();
//				} catch (Throwable e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}			
//					break;
//				case 4:
//					ioc.borrarcliente();
//					break;
//				case 5:
//	
//		            ioa.consultarAerolinea();
//					
//				case 15:
//					fin = true;
//					es.pritln("Fin del programa.");
//					break;			
	}
}
