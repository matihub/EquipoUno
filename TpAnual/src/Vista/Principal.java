
package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Controlador.*;
import DAO.Interfaces.*;
import Factory.*;
public class Principal {

	private FrameSwing frame;

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

//	/	ClienteDAO clienteDAO = new ClienteFactory().getImplementation("String");
//		AvionDAO avionDAO = new AvionFactory().getImplementation("String");
		AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
		VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
		VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
		JLabel lblSistemasGestionAeropuerto = new JLabel("\t\t\t\t\t\t\t\tSistemas Gestion Aeropuerto");
		lblSistemasGestionAeropuerto.setFont(new Font("Toyota Display Heavy", Font.BOLD | Font.ITALIC, 22));
	//	frame = new FramePrincipal(clienteDAO,/*avionDAO,*/aeropuertoDAO,vueloDAO,ventaDAO);
		frame = new FrameSwing();
		frame.setBounds(100, 100, 355, 400);
		frame.setDefaultCloseOperation(FrameSwing.EXIT_ON_CLOSE);

	
	}

}

