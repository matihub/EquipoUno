package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.IOCliente;
//import negocio.objetos.Cliente;
//import persistencia.dao.interfaces.ClienteDAO;
//import presentacion.popup.PopUpError;
//import presentacion.popup.PopUpGeneral;
import java.awt.Font;

public class ClienteAlta extends JPanel {

	private static final long serialVersionUID = 100206553674159671L;
	
	//private ClienteDAO clienteDAO;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField email;
	private JTextField dni;
	private JTextField nro_pasaporte;
	private JTextField telefono;
	private JTextField direccion;
	private JButton aceptar;
	private JButton cancelar;
	

	public ClienteAlta(IOCliente clienteDAO) {

		//this.clienteDAO = clienteDAO;
		
	
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre *");
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNombre.setBounds(27, 42, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido *");
		lblApellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblApellido.setBounds(177, 42, 46, 14);
		add(lblApellido);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nombre.setBounds(27, 58, 138, 20);
		add(nombre);
		nombre.setColumns(10);
		
		apellido = new JTextField();
		apellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		apellido.setBounds(175, 58, 138, 20);
		add(apellido);
		apellido.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email *");
		lblEmail.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblEmail.setBounds(27, 89, 46, 14);
		add(lblEmail);
		
		email = new JTextField();
		email.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		email.setBounds(27, 103, 286, 20);
		add(email);
		email.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI *");
		lblDni.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblDni.setBounds(27, 134, 46, 14);
		add(lblDni);
		
		dni = new JTextField();
		dni.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		dni.setBounds(27, 150, 138, 20);
		add(dni);
		dni.setColumns(10);
		
		JLabel lblNPasaporte = new JLabel("N Pasaporte");
		lblNPasaporte.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNPasaporte.setBounds(177, 134, 136, 14);
		add(lblNPasaporte);
		
		nro_pasaporte = new JTextField();
		nro_pasaporte.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_pasaporte.setBounds(177, 150, 136, 20);
		add(nro_pasaporte);
		nro_pasaporte.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblTelefono.setBounds(27, 181, 46, 14);
		add(lblTelefono);
		
		telefono = new JTextField();
		telefono.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		telefono.setBounds(27, 198, 138, 20);
		add(telefono);
		telefono.setColumns(10);
		
		direccion = new JTextField();
		direccion.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		direccion.setBounds(177, 198, 136, 20);
		add(direccion);
		direccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Direccion");
		lblNewLabel.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNewLabel.setBounds(177, 181, 46, 14);
		add(lblNewLabel);
		
		aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		aceptar.setBounds(27, 240, 138, 23);
		aceptar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			new PopUpError("paso2");	
			if (verificarCampos()) {
				new PopUpError("paso3");
			//		if (guardarDatos()) {
				try {
					if(clienteDAO.ingresarClientebbd(nombre.getText(),apellido.getText(),email.getText(),
							telefono.getText(),email.getText(),direccion.getText(),dni.getText(),nro_pasaporte.getText())) {
						
						
							new PopUpError("paso5");
							new PopUpGeneral("Cliente guardado exitosamente");
							vaciarCampos();
						} else {
							new PopUpError("paso4");
							new PopUpError("Ha ocurrido un error");
						}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					new PopUpError("paso7");
				} else {
					new PopUpError("Debe completar todos los campos obligatorios (*)");
				}
			}
	
		});
		add(aceptar);
		new PopUpError("paso1");
		cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cancelar.setBounds(177, 240, 136, 23);
		add(cancelar);
	}
	
	private void vaciarCampos() {

		nombre.setText("");
		apellido.setText("");
		email.setText("");
		direccion.setText("");
		telefono.setText("");
		dni.setText("");
		nro_pasaporte.setText("");
	}

	private boolean guardarDatos() {
		 
		
		IOCliente clienteControlador = new IOCliente();
		System.out.println(nombre.getText());
		try {
			return clienteControlador.ingresarClientebbd(nombre.getText(),apellido.getText(),email.getText(),
					telefono.getText(),email.getText(),direccion.getText(),dni.getText(),nro_pasaporte.getText());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		Cliente cliente = new Cliente();
		
		cliente.setNombre(nombre.getText());
		cliente.setApellido(apellido.getText());
		cliente.setEmail(email.getText());
		cliente.setTelefono(telefono.getText());
		cliente.setDireccion(direccion.getText());
		cliente.setDni(dni.getText());
		cliente.setNro_pasaporte(nro_pasaporte.getText());

		return this.clienteDAO.addCliente(cliente);
		
		
		*/
	//	return this.clienteDAO.addCliente(cliente);
		return false;
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || email.getText().isEmpty() || dni.getText().isEmpty()) {
			return false;
		}
		
	if (validarmail(email.getText())) {}
		return true;
	}
	
	  public boolean validarmail(String mail) {
	    	

		boolean mailcheck = true;
		
		if (mail.matches("[a-zA-z]+([ '@]+[a-zA-z]+[.com])*")) {
			new PopUpError("formato de mail incorrecto");
			mailcheck =false;
			
		}
		return mailcheck;
  }
}
