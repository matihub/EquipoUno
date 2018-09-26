package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import negocio.objetos.Aeropuerto;
import negocio.objetos.Avion;
import persistencia.dao.interfaces.AeropuertoDAO;
import persistencia.dao.interfaces.AvionDAO;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;

import java.awt.Font;

public class AvionModificacionEliminacion extends JPanel implements ActionListener {

	private static final long serialVersionUID = -960696045403411556L;
	
	private JTextField textFieldAvionID;
	private JButton btnBuscar;

	private AvionDAO avionDAO;
	private AeropuertoDAO aeropuertoDAO;
	
	private JTextField nombre;
	private JTextField modelo;
	private JTextField cant_asientos;
	
	private JComboBox<String> aeropuerto;
	
	private JButton eliminar;
	private JButton modificar;
	private JLabel lblAeropuerto;
	
	private int currentID;

	public AvionModificacionEliminacion(AvionDAO avionDAO, AeropuertoDAO aerodao) {
		
		this.avionDAO = avionDAO;
		this.aeropuertoDAO = aerodao;
		
		setLayout(null);

		JLabel lblId = new JLabel("Nombre, Modelo");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(27, 11, 138, 14);
		add(lblId);

		textFieldAvionID = new JTextField();
		textFieldAvionID.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textFieldAvionID.setBounds(27, 25, 183, 20);
		add(textFieldAvionID);
		textFieldAvionID.setColumns(10);

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
		
		modelo = new JTextField();
		modelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		modelo.setColumns(10);
		modelo.setBounds(175, 84, 138, 20);
		add(modelo);
		
		JLabel lblCantidadAsientos = new JLabel("Cantidad Asientos*");
		lblCantidadAsientos.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblCantidadAsientos.setBounds(27, 115, 138, 14);
		add(lblCantidadAsientos);
		
		cant_asientos = new JTextField();
		cant_asientos.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cant_asientos.setColumns(10);
		cant_asientos.setBounds(27, 129, 138, 20);
		add(cant_asientos);
		
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
		
		aeropuerto = new JComboBox<String>();
		aeropuerto.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		aeropuerto.setBounds(177, 129, 136, 20);
		aeropuerto.addItem("");
		ArrayList<Aeropuerto> aeropuertos = this.aeropuertoDAO.getAeropuertos();
		for (int i = 0; i < aeropuertos.size(); i++) {
			aeropuerto.addItem(String.valueOf(aeropuertos.get(i).getNombre()));
		}
		add(aeropuerto);
		
		lblAeropuerto = new JLabel("Aeropuerto");
		lblAeropuerto.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblAeropuerto.setBounds(175, 114, 138, 14);
		add(lblAeropuerto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnBuscar)) {
			if (!textFieldAvionID.getText().isEmpty()) {
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

		return this.avionDAO.removeAvion(Integer.valueOf(textFieldAvionID.getText()));
	}

	// Metodo de modificar
	private boolean guardarDatos() {
			
		Avion avion = new Avion();
		
		avion.setId(currentID);
		avion.setNombre(nombre.getText());
		avion.setModelo(modelo.getText());
		avion.setCant_asientos(Integer.valueOf(cant_asientos.getText()));
		avion.setNombre_aeropuerto(aeropuerto.getSelectedItem().toString());

		return this.avionDAO.modifyAvion(avion);
	}

	// Metodo de buscar/mostrar
	private void traerDatos() {

		Avion avion = this.avionDAO.buscarAvion(textFieldAvionID.getText());
		if (avion != null) {
			
			currentID = avion.getId();
			
			nombre.setText(avion.getNombre());
			modelo.setText(avion.getModelo());
			cant_asientos.setText(String.valueOf(avion.getCant_asientos()));
			aeropuerto.setSelectedItem(avion.getNombre_aeropuerto());
		} else {
			new PopUpError("No se encontraron datos.");
		}
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || modelo.getText().isEmpty() || cant_asientos.getText().isEmpty() || aeropuerto.getSelectedItem().toString().isEmpty()) {
			return false;
		}
		return true;
	}
}
