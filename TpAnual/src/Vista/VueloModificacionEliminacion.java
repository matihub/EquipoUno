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
/*
import negocio.objetos.Avion;
import negocio.objetos.Vuelo;
import persistencia.dao.interfaces.AvionDAO;
import persistencia.dao.interfaces.VueloDAO;
import presentacion.otros.Item;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;
*/
import java.awt.Font;

public class VueloModificacionEliminacion extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
/*
	private static final long serialVersionUID = -960696045403411556L;
	
	private JTextField textFieldVueloID;
	private JButton btnBuscar;

	private VueloDAO vueloDAO;
	private AvionDAO avionDAO;
	
	private JTextField nro_vuelo;
	private JTextField fecha_hora;
	
	private JButton eliminar;
	private JButton modificar;
	
	JComboBox<Item> aviones = new JComboBox<Item>();
	
	private int currentID = 0;

	public VueloModificacionEliminacion(VueloDAO vuedao, AvionDAO avidao) {
		
		this.avionDAO = avidao;
		this.vueloDAO = vuedao;
		
		setLayout(null);

		JLabel lblId = new JLabel("Numero de Vuelo");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(27, 11, 138, 14);
		add(lblId);

		textFieldVueloID = new JTextField();
		textFieldVueloID.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textFieldVueloID.setBounds(27, 25, 183, 20);
		add(textFieldVueloID);
		textFieldVueloID.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(-12, 56, 386, 8);
		add(separator);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		btnBuscar.setBounds(220, 24, 93, 23);
		add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		nro_vuelo = new JTextField();
		nro_vuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_vuelo.setColumns(10);
		nro_vuelo.setBounds(27, 84, 138, 20);
		add(nro_vuelo);
		
		JLabel lblNumeroDeVuelo = new JLabel("Numero de Vuelo *");
		lblNumeroDeVuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNumeroDeVuelo.setBounds(27, 68, 138, 14);
		add(lblNumeroDeVuelo);
		
		JLabel lblFechaYHora = new JLabel("Fecha y Hora *");
		lblFechaYHora.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblFechaYHora.setBounds(177, 68, 136, 14);
		add(lblFechaYHora);
		
		fecha_hora = new JTextField();
		fecha_hora.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		fecha_hora.setColumns(10);
		fecha_hora.setBounds(175, 84, 138, 20);
		add(fecha_hora);
		
		JLabel lblAvion = new JLabel("Avion");
		lblAvion.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblAvion.setBounds(27, 115, 46, 14);
		add(lblAvion);
		
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
		
		aviones.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		aviones.setBounds(27, 129, 286, 20);
		ArrayList<Avion> arrayAviones = this.avionDAO.getAviones();
		for (int i = 0; i < arrayAviones.size(); i++) {
			aviones.addItem(new Item(arrayAviones.get(i).getId(),arrayAviones.get(i).getNombre() + " - " + arrayAviones.get(i).getModelo()));
		}
		add(aviones);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnBuscar)) {
			if (!textFieldVueloID.getText().isEmpty()) {
				traerDatos();
				eliminar.setEnabled(true);
				modificar.setEnabled(true);
			} else {
				new PopUpError("El campo de busqueda no puede estar vacio");
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
					new PopUpGeneral("Vuelo eliminado con exito");
				} else {
					new PopUpError("Error al eliminar el cliente");
				}
			}
		}

	}

	// Metodo de borrar
	private boolean borrarCliente() {

		return this.vueloDAO.removeVuelo(currentID);
	}

	// Metodo de modificar
	private boolean guardarDatos() {
			
		Vuelo vuelo = new Vuelo();
		
		vuelo.setId(currentID);
		vuelo.setNro_vuelo(nro_vuelo.getText());
		vuelo.setFecha_hora(fecha_hora.getText());
		Item item = (Item)(aviones.getSelectedItem());
		vuelo.setId_avion(item.getId());

		return this.vueloDAO.modifyVuelo(vuelo);
	}

	// Metodo de buscar/mostrar
	private void traerDatos() {

		Vuelo vuelo = this.vueloDAO.buscarVuelo(textFieldVueloID.getText());
		if (vuelo != null) {
			
			this.currentID = vuelo.getId();
			
			nro_vuelo.setText(vuelo.getNro_vuelo());
			fecha_hora.setText(vuelo.getFecha_hora());
			
			Avion avion = this.avionDAO.getAvion(vuelo.getId_avion());
			aviones.setSelectedItem(new Item(avion.getId(),avion.getNombre()));
		} else {
			new PopUpError("No se encontraron datos con ese criterio de busqueda");
		}
	}

	private boolean verificarCampos() {
		if (nro_vuelo.getText().isEmpty() || fecha_hora.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	*/
}
