package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Modelo.Aeropuerto;

public class AeropuertoModificacionEliminacion extends JPanel implements ActionListener {

	private static final long serialVersionUID = -960696045403411556L;
	
	private JTextField textFieldAeropuertoID;
	private JButton btnBuscar;

	private DAO.Interfaces.AeropuertoDAO aeropuertoDAO;
	
	private JTextField nombre;
	private JTextField pais;
	
	private JButton eliminar;
	
	private String currentID;

	public AeropuertoModificacionEliminacion(DAO.Interfaces.AeropuertoDAO aerodao) {
		
		this.aeropuertoDAO = aerodao;
		
		setLayout(null);

		JLabel lblId = new JLabel("Nombre, Pais");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(27, 11, 138, 14);
		add(lblId);

		textFieldAeropuertoID = new JTextField();
		textFieldAeropuertoID.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textFieldAeropuertoID.setBounds(27, 25, 183, 20);
		add(textFieldAeropuertoID);
		textFieldAeropuertoID.setColumns(10);

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
		
		JLabel lblModelo = new JLabel("Modelo *");
		lblModelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblModelo.setBounds(177, 68, 46, 14);
		add(lblModelo);
		
		pais = new JTextField();
		pais.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		pais.setColumns(10);
		pais.setBounds(175, 84, 138, 20);
		add(pais);
		
		eliminar = new JButton("Eliminar");
		eliminar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		eliminar.setBounds(27, 266, 286, 23);
		eliminar.addActionListener(this);
		add(eliminar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnBuscar)) {
			if (!textFieldAeropuertoID.getText().isEmpty()) {
				traerDatos();
				eliminar.setEnabled(true);
			} else {
				new PopUpError("El campo de busqueda no puede estar vacio");
			}
		} else if (e.getSource().equals(eliminar)) {
			//Se pregunta si queres borrar el cliente
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar este aeropuerto?", "Aviso", dialogButton);
			//Si seleccionar que si lo de abajo
			if (result == JOptionPane.YES_OPTION) {
				if (borrarCliente()) {
					new PopUpGeneral("Aeropuerto eliminado con exito");
				} else {
					new PopUpError("Error al eliminar el aeropuerto");
				}
			}
		}

	}

	// Metodo de borrar
	private boolean borrarCliente() {

		return this.aeropuertoDAO.removeAeropuerto(this.currentID);
	}

	// Metodo de buscar/mostrar
	private void traerDatos() {

		Aeropuerto aeropuerto = this.aeropuertoDAO.buscarAeropuerto(textFieldAeropuertoID.getText());
		if (aeropuerto != null) {
			
			currentID = aeropuerto.getNombreAeropuerto();
			
			nombre.setText(aeropuerto.getNombreAeropuerto());
	//		pais.setText(aeropuerto.getPais());
		} else {
			new PopUpError("No se encontraron datos.");
		}
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || pais.getText().isEmpty()) {
			return false;
		}
		return true;
	}
}
