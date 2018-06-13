package Vista;

import Controlador.IOVuelo;
import Modelo.Vuelo;

public class MenuVuelos {
	
    private static void mostrarOpciones() {

    	EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS~~~~~~~~~~~~~~~~~~~~~~~");
    	EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS -  MENU VUELOS - ~~~");    	
		EntradaSalida.pritln("1.Consulta de vuelos");
		EntradaSalida.pritln("2.Alta de nuevo vuelo");//
		EntradaSalida.pritln("3.Modificar de nuevo vuelo");//
		EntradaSalida.pritln("4.Eliminar vuelo");
    }
    
    public static void show() throws Throwable{
        boolean fin = false;
        int option = 0;
        
        EntradaSalida es = new EntradaSalida();
        
        while(!fin) {
        	
        MenuVuelos.mostrarOpciones();
        option = EntradaSalida.leerInt();
        
        if (option <1 || option >4) {
        	es.pritln("Ingrese una opcion valida");
        	continue;
        	
        }else {
        	
        	IOVuelo iov = new IOVuelo();
        	
         	while(!fin){
   				
    			switch(option){
				case 1:
					iov.consultarVuelo();
					es.pritln("\nLeido.");
					
					break;
					
				case 2:
					
					iov.ingresarVuelo();
					break;
					
				case 3:
					
					iov.actualizarVuelo();
					
					break;
					
				case 4:
					
					iov.borrarVuelo();
					break;
					
					}
        		
        	}
        }
        	
        }
        
   
}
}

