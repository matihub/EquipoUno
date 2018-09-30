package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
import negocio.objetos.Cliente;
import negocio.objetos.Venta;
import persistencia.dao.interfaces.ClienteDAO;
import persistencia.dao.interfaces.VentaDAO;
import persistencia.dao.interfaces.VueloDAO;
import negocio.objetos.Vuelo;
import presentacion.otros.Item;
import presentacion.otros.ItemRenderer;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;
import java.awt.Font;

 */
public class VentaAlta extends JPanel {
/*
	private static final long serialVersionUID = 100206553674159671L;

	private VentaDAO ventaDAO;
	private VueloDAO vueloDAO;
	private ClienteDAO clienteDAO;
	
	private JTextField nro_reserva;
	private JButton aceptar;
	private JButton cancelar;

	JComboBox<Item> vuelos = new JComboBox<Item>();
	JComboBox<Item> clientes = new JComboBox<Item>();
	private JLabel lblVuelo;

	public VentaAlta(VentaDAO vendao, VueloDAO vuedao, ClienteDAO clidao) {

		this.ventaDAO = vendao;
		this.vueloDAO = vuedao;
		this.clienteDAO = clidao;
		
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Numero de Reserva *");
		lblNombre.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNombre.setBounds(27, 42, 140, 14);
		add(lblNombre);
		
		nro_reserva = new JTextField();
		nro_reserva.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_reserva.setBounds(27, 58, 286, 20);
		add(nro_reserva);
		nro_reserva.setColumns(10);
		
		JLabel lblEmail = new JLabel("Cliente *");
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
						new PopUpGeneral("Venta realizada exitosamente");
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
		
		vuelos.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		vuelos.setBounds(27, 148, 286, 20);
		ArrayList<Vuelo> arrayVuelos = this.vueloDAO.getVuelos();
		for (int i = 0; i < arrayVuelos.size(); i++) {
			vuelos.addItem(new Item(arrayVuelos.get(i).getId(),arrayVuelos.get(i).getNro_vuelo() + " - " + arrayVuelos.get(i).getFecha_hora()));
		}
		vuelos.setRenderer(new ItemRenderer());
		add(vuelos);
		
		clientes.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		clientes.setBounds(27, 103, 286, 20);
		ArrayList<Cliente> arrayClientes = this.clienteDAO.getClientes();
		for (int i = 0; i < arrayClientes.size(); i++) {
			clientes.addItem(new Item(arrayClientes.get(i).getId(),arrayClientes.get(i).getNombre() + " " + arrayClientes.get(i).getApellido() + " - " + arrayClientes.get(i).getDni()));
		}
		clientes.setRenderer(new ItemRenderer());
		add(clientes);
		
		lblVuelo = new JLabel("Vuelo *");
		lblVuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblVuelo.setBounds(27, 134, 46, 14);
		add(lblVuelo);
	}
	
	private void vaciarCampos() {

		nro_reserva.setText("");
		vuelos.setSelectedIndex(0);
		clientes.setSelectedIndex(0);
	}

	private boolean guardarDatos() {
		
		Venta venta = new Venta();
		
		venta.setNro_reserva(nro_reserva.getText());
		venta.setId_cliente(((Item)clientes.getSelectedItem()).getId());
		venta.setId_vuelo(((Item)vuelos.getSelectedItem()).getId());
		
		String datetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		venta.setFecha_hora(datetime);

		return this.ventaDAO.addVenta(venta);
	}

	private boolean verificarCampos() {
		if (nro_reserva.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	*/
}
