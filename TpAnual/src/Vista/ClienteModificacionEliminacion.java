package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
/*
import negocio.objetos.Cliente;
import persistencia.dao.interfaces.ClienteDAO;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;
*/
import java.awt.Font;

public class ClienteModificacionEliminacion extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
/*
	private static final long serialVersionUID = -960696045403411556L;
	
	private JTextField textFieldClieID;
	private JButton btnBuscar;
	
	private ClienteDAO clienteDAO;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField email;
	private JTextField dni;
	private JTextField nro_pasaporte;
	private JTextField telefono;
	private JTextField direccion;
	
	private JButton eliminar;
	private JButton modificar;
	
	private int currentID = 0;

	public ClienteModificacionEliminacion(ClienteDAO clienteDAO) {
		
		this.clienteDAO = clienteDAO;
		
		setLayout(null);

		JLabel lblId = new JLabel("DNI, Nombre, Apellido");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(27, 11, 138, 14);
		add(lblId);

		textFieldClieID = new JTextField();
		textFieldClieID.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textFieldClieID.setBounds(27, 25, 183, 20);
		add(textFieldClieID);
		textFieldClieID.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(-12, 56, 386, 8);
		add(separator);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		btnBuscar.setBounds(220, 24, 93, 23);
		add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nombre.setColumns(10);
		nombre.setBounds(27, 84, 138, 20);
		add(nombre);
		
		JLabel label = new JLabel("Nombre *");
		label.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label.setBounds(27, 68, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Apellido *");
		label_1.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_1.setBounds(177, 68, 46, 14);
		add(label_1);
		
		apellido = new JTextField();
		apellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		apellido.setColumns(10);
		apellido.setBounds(175, 84, 138, 20);
		add(apellido);
		
		JLabel label_2 = new JLabel("Email *");
		label_2.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_2.setBounds(27, 115, 46, 14);
		add(label_2);
		
		email = new JTextField();
		email.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		email.setColumns(10);
		email.setBounds(27, 129, 286, 20);
		add(email);
		
		JLabel label_3 = new JLabel("DNI *");
		label_3.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_3.setBounds(27, 160, 46, 14);
		add(label_3);
		
		dni = new JTextField();
		dni.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		dni.setColumns(10);
		dni.setBounds(27, 176, 138, 20);
		add(dni);
		
		JLabel label_4 = new JLabel("N Pasaporte");
		label_4.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_4.setBounds(177, 160, 136, 14);
		add(label_4);
		
		nro_pasaporte = new JTextField();
		nro_pasaporte.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_pasaporte.setColumns(10);
		nro_pasaporte.setBounds(177, 176, 136, 20);
		add(nro_pasaporte);
		
		JLabel label_5 = new JLabel("Telefono");
		label_5.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_5.setBounds(27, 207, 46, 14);
		add(label_5);
		
		telefono = new JTextField();
		telefono.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		telefono.setColumns(10);
		telefono.setBounds(27, 224, 138, 20);
		add(telefono);
		
		JLabel label_6 = new JLabel("Direccion");
		label_6.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		label_6.setBounds(177, 207, 46, 14);
		add(label_6);
		
		direccion = new JTextField();
		direccion.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		direccion.setColumns(10);
		direccion.setBounds(177, 224, 136, 20);
		add(direccion);
		
		modificar = new JButton("Modificar");
		modificar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		modificar.setBounds(27, 266, 138, 23);
		modificar.addActionListener(this);
		add(modificar);
		
		eliminar = new JButton("Eliminar");
		eliminar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		eliminar.setBounds(177, 266, 136, 23);
		eliminar.addActionListener(this);
		add(eliminar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnBuscar)) {
			if (!textFieldClieID.getText().isEmpty()) {
				traerDatos();
				eliminar.setEnabled(true);
				modificar.setEnabled(true);
			} else {
				new PopUpError("El campo de ID no puede estar vacio");
			}
		} else if (e.getSource().equals(modificar)) {
			if (verificarCampos()) {
				if (guardarDatos()) {
					new PopUpGeneral("Exito al guardar");
				} else {
					new PopUpError("Error al guardar");
				}
			} else {
				new PopUpError("Hay campos vacios o incorrectos");
			}
		} else if (e.getSource().equals(eliminar)) {
			//Se pregunta si queres borrar el cliente
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar este Cliente?", "Aviso", dialogButton);
			//Si seleccionar que si lo de abajo
			if (result == JOptionPane.YES_OPTION) {
				if (borrarCliente()) {
					new PopUpGeneral("Cliente eliminado con exito");
				} else {
					new PopUpError("Error al eliminar el cliente");
				}
			}
		}

	}

	// Metodo de borrar
	private boolean borrarCliente() {

		return this.clienteDAO.removeCliente(currentID);
	}

	// Metodo de modificar
	private boolean guardarDatos() {
			
		Cliente cliente = new Cliente();
		
		cliente.setId(currentID);
		cliente.setNombre(nombre.getText());
		cliente.setApellido(apellido.getText());
		cliente.setEmail(email.getText());
		cliente.setTelefono(telefono.getText());
		cliente.setDireccion(direccion.getText());
		cliente.setDni(dni.getText());
		cliente.setNro_pasaporte(nro_pasaporte.getText());

		return this.clienteDAO.modifyCliente(cliente);
	}

	// Metodo de buscar/mostrar
	private void traerDatos() {

		Cliente cliente = this.clienteDAO.buscarCliente(textFieldClieID.getText());
		if (cliente != null) {
			
			this.currentID = cliente.getId();
			
			nombre.setText(cliente.getNombre());
			apellido.setText(cliente.getApellido());
			email.setText(cliente.getEmail());
			dni.setText(cliente.getDni());
			direccion.setText(cliente.getDireccion());
			telefono.setText(cliente.getTelefono());
			nro_pasaporte.setText(cliente.getNro_pasaporte());
		} else {
			new PopUpError("No se encontraron datos con ese ID");
		}
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || email.getText().isEmpty() || dni.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	*/
}
