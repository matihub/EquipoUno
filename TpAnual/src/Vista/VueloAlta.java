package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
import negocio.objetos.Avion;
import persistencia.dao.interfaces.AvionDAO;
import persistencia.dao.interfaces.VueloDAO;
import negocio.objetos.Vuelo;
import presentacion.otros.Item;
import presentacion.otros.ItemRenderer;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;
*/
import java.awt.Font;

public class VueloAlta extends JPanel {
/*
	private static final long serialVersionUID = 100206553674159671L;

	private VueloDAO vueloDAO;
	private AvionDAO avionDAO;
	
	private JTextField nro_vuelo;
	private JTextField fecha_hora;
	private JButton aceptar;
	private JButton cancelar;
	
	JComboBox<Item> aviones = new JComboBox<Item>();

	public VueloAlta(VueloDAO vuedao, AvionDAO avidao) {

		this.vueloDAO = vuedao;
		this.avionDAO = avidao;
		
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Numero de Vuelo *");
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNombre.setBounds(27, 42, 140, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Fecha y Hora");
		lblApellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblApellido.setBounds(177, 42, 136, 14);
		add(lblApellido);
		
		nro_vuelo = new JTextField();
		nro_vuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_vuelo.setBounds(27, 58, 138, 20);
		add(nro_vuelo);
		nro_vuelo.setColumns(10);
		
		fecha_hora = new JTextField();
		fecha_hora.setToolTipText("yyyy-mm-dd hh:mm");
		fecha_hora.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		fecha_hora.setBounds(175, 58, 138, 20);
		add(fecha_hora);
		fecha_hora.setColumns(10);
		
		JLabel lblEmail = new JLabel("Avion *");
		lblEmail.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblEmail.setBounds(27, 89, 46, 14);
		add(lblEmail);
		
		aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		aceptar.setBounds(27, 240, 138, 23);
		aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (verificarCampos()) {
					if (guardarDatos()) {
						new PopUpGeneral("Vuelo guardado exitosamente");
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
		
		aviones.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		aviones.setBounds(27, 103, 286, 20);
		ArrayList<Avion> arrayAviones = this.avionDAO.getAviones();
		for (int i = 0; i < arrayAviones.size(); i++) {
			aviones.addItem(new Item(arrayAviones.get(i).getId(),arrayAviones.get(i).getNombre() + " - " + arrayAviones.get(i).getModelo()));
		}
		aviones.setRenderer(new ItemRenderer());
		add(aviones);
	}
	
	private void vaciarCampos() {

		nro_vuelo.setText("");
		fecha_hora.setText("");
		aviones.setSelectedIndex(0);
	}

	private boolean guardarDatos() {
		
		Vuelo vuelo = new Vuelo();
		
		vuelo.setNro_vuelo(nro_vuelo.getText());
		vuelo.setFecha_hora(fecha_hora.getText());
		vuelo.setId_avion(((Item)aviones.getSelectedItem()).getId());

		return this.vueloDAO.addVuelo(vuelo);
	}

	private boolean verificarCampos() {
		if (nro_vuelo.getText().isEmpty() || fecha_hora.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	*/
}
