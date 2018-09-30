package Vista;

import Controlador.IOCliente;
import DAO.Interfaces.*;
import Factory.ClienteFactory;

public class MenuClientes {
		
    private static void mostrarOpciones() {

	EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS~~~~~~~~~~~~~~~~~~~~~~~");
	EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS -  MENU CLIENTES - ~~~");
	EntradaSalida.pritln("\nSeleccione una opcion.");
	EntradaSalida.pritln("1.Consulta de Clientes");
	EntradaSalida.pritln("2.Alta de Clientes");
	EntradaSalida.pritln("3.Modificar cliente");
	EntradaSalida.pritln("4.Borrar cliente");
	EntradaSalida.pritln("5.Salir");

	
    }
    
	public static void show() throws Throwable{
        boolean fin = false;
        int option = 0;
        IOCliente ioc = new IOCliente();
		ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");


        while (!fin) {
            MenuClientes.mostrarOpciones();

            option = EntradaSalida.leerInt(null, null);

            if (option < 1 || option > 4) {
            	EntradaSalida.pritln("Ingrese una opcion valida");
            	
            	continue;
            } else {
            	IOCliente clienteControlador = new IOCliente();
            	
            	while(!fin){
           				
        			switch(option){
    				case 1:
    					ioc.consultarCliente(EntradaSalida.leerInt(null, null));
    					EntradaSalida.pritln("\nLeido.");
    					
    					break;
    				case 2 :
    			
    				try {
    		//			boolean verify = clienteDAO.addCliente(ioc.ingresarCliente());
    			//		 if (verify) {
    						 if (true) {
    							    
    						 EntradaSalida.pritln("grabo correcto");
    						
    					}
    					   else{
    						   EntradaSalida.pritln("error al grabar");
    					   }
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
            		}
            	}
            }
        }
	}
}
