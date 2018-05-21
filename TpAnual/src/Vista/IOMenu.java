package Vista;

import Controlador.*;




public class IOMenu {
	EntradaSalida es = new EntradaSalida();
	
	public int mostraropciones() throws Exception {
		
		boolean ok=false;
		int opcion=0;
		es.pritln("\nSeleccione una opcion.");
		es.pritln("1c.consulta de habitaciones");
		es.pritln("2d.registro de huespedes");
		es.pritln("3d.registro de consumos");
		es.pritln("4e.consulta de consumos");
		es.pritln("5f.registrar salida");//
		es.pritln("6g.generar cupones");
		
		es.pritln("4.Salir");
		opcion= es.getDouble("ingrese opcion");
		
		if (opcion>=1 && opcion <=6){
			ok=true;
		}
		else{
			es.pritln("\nIngresar una opcion valida. (1-4)");
		}
			return opcion;
	}	
}


