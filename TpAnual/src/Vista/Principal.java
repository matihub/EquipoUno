package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Controlador.IOCliente;

;
public class Principal {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Principal ventanaPrincipal = new Principal();
					ventanaPrincipal.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		initialize();
	}

	private void initialize() {

	IOCliente clienteController = new IOCliente();
//		AvionDAO avionDAO = new AvionFactory().getImplementation("String");
		//AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
	//	VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
	//	VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
		
		frame = new FramePrincipal(clienteController);
	//	frame = new FramePrincipal1();
		frame.setBounds(100, 100, 591, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
