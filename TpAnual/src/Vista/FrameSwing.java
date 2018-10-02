package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameSwing {

	private JFrame frame;
	private JTextField txtGestionDeAeropuerto;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public FrameSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtGestionDeAeropuerto = new JTextField();
		txtGestionDeAeropuerto.setFont(new Font("Microsoft Tai Le", Font.BOLD, 20));
		txtGestionDeAeropuerto.setForeground(Color.WHITE);
		txtGestionDeAeropuerto.setBackground(Color.BLACK);
		txtGestionDeAeropuerto.setText("Gestion de Aeropuerto");
		frame.getContentPane().add(txtGestionDeAeropuerto, BorderLayout.NORTH);
		txtGestionDeAeropuerto.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton Clientes = new JButton("Clientes");
		Clientes.setIcon(new ImageIcon("C:\\Users\\enriq\\Downloads\\cliente.png"));
		Clientes.setHorizontalAlignment(SwingConstants.RIGHT);
		Clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(Clientes);
		
		JButton Ventas = new JButton("Ventas");
		Ventas.setIcon(new ImageIcon("C:\\Users\\enriq\\Downloads\\venta.png"));
		Ventas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(Ventas);
		
		JButton LineasAereas = new JButton("Lineas Aereas");
		LineasAereas.setIcon(new ImageIcon("C:\\Users\\enriq\\Downloads\\aerolinea-comercial.png"));
		LineasAereas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(LineasAereas);
		
		JButton Vuelos = new JButton("Vuelos");
		Vuelos.setIcon(new ImageIcon("C:\\Users\\enriq\\Downloads\\aeroplano.png"));
		panel.add(Vuelos);
	}

	public void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
