package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAO.Interfaces.AeropuertoDAO;
import DAO.Interfaces.AvionDAO;
import Modelo.Aeropuerto;
import Modelo.Avion;

public class AvionAlta extends JPanel {

	private static final long serialVersionUID = 100206553674159671L;

	private DAO.Interfaces.AvionDAO avionDAO;
	private DAO.Interfaces.AeropuertoDAO aeropuertoDAO;
	
	private JTextField nombre;
	private JTextField modelo;
	private JTextField cant_asientos;
	private JButton aceptar;
	private JButton cancelar;
	private JComboBox<String> aeropuerto;
	private JLabel lblAeropuerto;

	public AvionAlta(AvionDAO avidao, AeropuertoDAO aerodao) {

		this.avionDAO = avidao;
		this.aeropuertoDAO = aerodao;
		
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre *");
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNombre.setBounds(27, 42, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Modelo *");
		lblApellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblApellido.setBounds(177, 42, 46, 14);
		add(lblApellido);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nombre.setBounds(27, 58, 138, 20);
		add(nombre);
		nombre.setColumns(10);
		
		modelo = new JTextField();
		modelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		modelo.setBounds(175, 58, 138, 20);
		add(modelo);
		modelo.setColumns(10);
		
		JLabel lblEmail = new JLabel("Cantidad Asientos *");
		lblEmail.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblEmail.setBounds(27, 89, 138, 14);
		add(lblEmail);
		
		cant_asientos = new JTextField();
		cant_asientos.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cant_asientos.setBounds(27, 103, 138, 20);
		add(cant_asientos);
		cant_asientos.setColumns(10);
		
		aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		aceptar.setBounds(27, 240, 138, 23);
		aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (verificarCampos()) {
					if (guardarDatos()) {
						new PopUpGeneral("Avion guardado exitosamente");
						vaciarCampos();
					} else {
						new PopUpError("Ha ocurrido un error");
					}
				} else {
					new PopUpError("Debe completar todos los campos obligatorios (*)");
				}
			}
		});
		add(aceptar);
		
		cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cancelar.setBounds(177, 240, 136, 23);
		add(cancelar);
		
		aeropuerto = new JComboBox<String>();
		aeropuerto.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		aeropuerto.setBounds(177, 103, 136, 20);
		aeropuerto.addItem("");
		ArrayList<Aeropuerto> aeropuertos = this.aeropuertoDAO.getAeropuertos();
		for (int i = 0; i < aeropuertos.size(); i++) {
			aeropuerto.addItem(String.valueOf(aeropuertos.get(i).getNombreAeropuerto()));
		}
		add(aeropuerto);
		
		lblAeropuerto = new JLabel("Aeropuerto");
		lblAeropuerto.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblAeropuerto.setBounds(177, 89, 138, 14);
		add(lblAeropuerto);
	}
	
	private void vaciarCampos() {

		nombre.setText("");
		modelo.setText("");
		cant_asientos.setText("");
		aeropuerto.setSelectedIndex(0);
	}

	private boolean guardarDatos() {
		
		Avion avion = new Avion();
		
		avion.setNombre(nombre.getText());
		avion.setModelo(modelo.getText());
	//	avion.set setCant_asientos(Integer.valueOf(cant_asientos.getText()));
		avion.setNombre(aeropuerto.getSelectedItem().toString());

		return this.avionDAO.addAvion(avion);
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || modelo.getText().isEmpty() || cant_asientos.getText().isEmpty() || aeropuerto.getSelectedItem().toString().isEmpty()) {
			return false;
		}
		return true;
	}
}
