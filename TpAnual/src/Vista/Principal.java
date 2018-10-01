package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.IOCliente;

;
public class Principal {

	private JFrame frame;
	IOCliente clienteController = new IOCliente();
	
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


//		AvionDAO avionDAO = new AvionFactory().getImplementation("String");
		//AeropuertoDAO aeropuertoDAO = new AeropuertoFactory().getImplementation("String");
	//	VueloDAO vueloDAO = new VueloFactory().getImplementation("String");
	//	VentaDAO ventaDAO = new VentaFactory().getImplementation("String");
		//-inicio
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.GRAY);
	frame.setForeground(Color.GREEN);
	frame.setBackground(Color.DARK_GRAY);
	frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
	
	JLabel lblSistemasGestionAeropuerto = new JLabel("\t\t\t\t\t\t\t\tSistemas Gestion Aeropuerto");
	lblSistemasGestionAeropuerto.setFont(new Font("Toyota Display Heavy", Font.BOLD | Font.ITALIC, 22));
	frame.getContentPane().add(lblSistemasGestionAeropuerto, BorderLayout.NORTH);
	
	JDesktopPane desktopPane = new JDesktopPane();
	frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
	
	JButton btncliente = new JButton("Cliente");
	btncliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
	btncliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btncliente.setBounds(104, 40, 316, 23);
	desktopPane.add(btncliente);
	
	JButton btnVuelos = new JButton("Vuelos");
	btnVuelos.setFont(new Font("Tahoma", Font.PLAIN, 16));
	btnVuelos.setBounds(104, 87, 316, 23);
	desktopPane.add(btnVuelos);
	
	JButton btnLinea = new JButton("Lineas Aereas");
	btnLinea.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnLinea.setFont(new Font("Tahoma", Font.PLAIN, 16));
	btnLinea.setBounds(104, 136, 316, 23);
	desktopPane.add(btnLinea);
	
	JButton btnVentas = new JButton("Ventas");
	btnVentas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnVentas.setFont(new Font("Tahoma", Font.PLAIN, 16));
	btnVentas.setBounds(104, 181, 316, 23);
	desktopPane.add(btnVentas);
	frame.setBounds(100, 100, 591, 403);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel contentPane = new JPanel();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	//-fin
		frame = new FramePrincipal(clienteController);
	//	frame = new FramePrincipal1();
		frame.setBounds(100, 100, 591, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}

	private void setContentPane(
			JPanel contentPane) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(
			int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(btncliente)) {
			frame = new FramePrincipal(clienteController);
			//	frame = new FramePrincipal1();
				frame.setBounds(100, 100, 591, 403);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		} else if (e.getSource().equals(btnVuelos)) {
			frame = new FramePrincipal(clienteController);
			//	frame = new FramePrincipal1();
				frame.setBounds(100, 100, 591, 403);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getSource().equals(btnLinea)) {
			frame = new FramePrincipal(clienteController);
			//	frame = new FramePrincipal1();
				frame.setBounds(100, 100, 591, 403);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		 else if (e.getSource().equals(btnVentas)) {
			 frame = new FramePrincipal(clienteController);
				//	frame = new FramePrincipal1();
					frame.setBounds(100, 100, 591, 403);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
		
		}
}
