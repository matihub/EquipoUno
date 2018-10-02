package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(
			String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
					

				
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(104, 40, 316, 23);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vuelos");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(104, 87, 316, 23);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lineas Aereas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(104, 136, 316, 23);
		desktopPane.add(btnNewButton_2);
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVentas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVentas.setBounds(104, 190, 316, 23);
		desktopPane.add(btnVentas);
		frame.setBounds(100, 100, 591, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
	}

	

	private void setDefaultCloseOperation(
			int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setContentPane(
			JPanel contentPane) {
		// TODO Auto-generated method stub
		
	}
}
