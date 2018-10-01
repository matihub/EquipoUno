package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controlador.IOAerolinea;
import DAO.Interfaces.AeropuertoDAO;
import Modelo.Aeropuerto;

public class AeropuertoAlta extends JPanel {

	private static final long serialVersionUID = 100206553674159671L;

	private IOCliente aeropuertoDAO;
	
	private JTextField nombre;
	private JTextField pais;
	private JButton aceptar;
	private JButton cancelar;

	public AeropuertoAlta(IOcliente aerodao) {

		this.aeropuertoDAO = aerodao;
		
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre *");
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNombre.setBounds(27, 42, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Pais *");
		lblApellido.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblApellido.setBounds(177, 42, 46, 14);
		add(lblApellido);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nombre.setBounds(27, 58, 138, 20);
		add(nombre);
		nombre.setColumns(10);
		
		pais = new JTextField();
		pais.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		pais.setBounds(175, 58, 138, 20);
		add(pais);
		pais.setColumns(10);
		
		aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		aceptar.setBounds(27, 240, 138, 23);
		aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (verificarCampos()) {
					if (guardarDatos()) {
						new PopUpGeneral("Aeropuerto guardado exitosamente");
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
	}
	
	private void vaciarCampos() {

		nombre.setText("");
		pais.setText("");
	}

	private boolean guardarDatos() {
		
		Aeropuerto aeropuerto = new Aeropuerto();
		
		aeropuerto.setNombreAeropuerto(nombre.getText());
		//aeropuerto.se  .setPais(pais.getText());

		return this.aeropuertoDAO.addAeropuerto(aeropuerto);
	}

	private boolean verificarCampos() {
		if (nombre.getText().isEmpty() || pais.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	
}
