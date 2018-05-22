package Vista;

import Controlador.*;




public class IOMenu {
	EntradaSalida es = new EntradaSalida();
	
	public int mostraropciones() throws Exception {
		
		boolean ok=false;
		int opcion=0;
		EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS~~~~~~~~~~~~~~~~~~~~~~~");
		EntradaSalida.pritln("\nSeleccione una opcion.");
		es.pritln("1c.consulta de Clientes");
		es.pritln("2d. alta de Clientes");
		es.pritln("3d.modificar cliente");
		
		EntradaSalida.pritln("------------------------");
		es.pritln("4e.Consulta de vuelos");
		es.pritln("5f.alta de nuevo vuelo");//
		es.pritln("6g.eliminar vuelo");
		
		es.pritln("------------------------");
		
		es.pritln("4e.Consulta de aerolinea");
		es.pritln("5f.alta de nueva aerolinea");//
		es.pritln("6g.eliminar aerolinea");
		
		es.pritln("------------------------");
		es.pritln("4e.Consulta de ventas");
		es.pritln("5f.alta de nueva ventas");//
		es.pritln("6g.eliminar ventas");
		
		es.pritln("4.Salir");
		opcion= es.leerInt("ingrese opcion", "ingrese un valos de la lista valido");
		
		if (opcion>=1 && opcion <=6){
			ok=true;
		}
		else{
			es.pritln("\nIngresar una opcion valida. (1-4)");
		}
			return opcion;
	}	
}


