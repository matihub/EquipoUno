package Vista;

public class MenuGeneral {
	
	EntradaSalida es = new EntradaSalida();
	
	private static void  mostraropciones() throws Exception {
		
		boolean ok=false;
		int option=0;
		EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS~~~~~~~~~~~~~~~~~~~~~~~");
		EntradaSalida.pritln("~~~~~~~~~~~~~~~~~~~~TP ANUAL ---VENTA DE VUELOS~~~- MENU GENERAL -~~~");

		EntradaSalida.pritln("1. Clientes");
		EntradaSalida.pritln("2. Vuelos");
		EntradaSalida.pritln("3. Aerolíneas");
		EntradaSalida.pritln("4. Ventas");
	}
	
		  public static void show() {
		        boolean status = false;
		        int option = 0;

		        while (!status) {
		        	try {
						MenuGeneral.mostraropciones();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		            option = EntradaSalida.leerInt(null, null);

		            if (option < 1 || option > 4) {
		            	EntradaSalida.pritln("Ingrese una opcion valida");

		            	EntradaSalida.pritln("---------------");
		            } else { if (option == 1) {
							try {
								MenuClientes.show();
							} catch (Throwable e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	   	                    EntradaSalida.pritln("---------------");
		            } else if (option == 2) {
							try {
								MenuVuelos.show();
							} catch (Throwable e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	   	                    EntradaSalida.pritln("---------------");

	                } else {
	                    status = true;
	                }
		                }
		            }
		    }
}



