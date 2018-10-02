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

import negocio.objetos.Cliente;
import negocio.objetos.Venta;
import negocio.objetos.Vuelo;
import persistencia.dao.interfaces.ClienteDAO;
import persistencia.dao.interfaces.VentaDAO;
import persistencia.dao.interfaces.VueloDAO;
import presentacion.otros.Item;
import presentacion.otros.ItemRenderer;
import presentacion.popup.PopUpError;
import presentacion.popup.PopUpGeneral;

import java.awt.Font;

public class VentaModificacionEliminacion extends JPanel implements ActionListener {

	private static final long serialVersionUID = -960696045403411556L;
	
	private JTextField textFieldVentaID;
	private JButton btnBuscar;

	private VueloDAO vueloDAO;
	private VentaDAO ventaDAO;
	private ClienteDAO clienteDAO;
	
	private JTextField nro_reserva;
	
	private JButton eliminar;

	JComboBox<Item> vuelos = new JComboBox<Item>();
	JComboBox<Item> clientes = new JComboBox<Item>();
	
	private int currentID = 0;
	private JLabel lblVuelo;

	public VentaModificacionEliminacion(VentaDAO vendao, VueloDAO vuedao, ClienteDAO clidao) {
		
		this.ventaDAO = vendao;
		this.vueloDAO = vuedao;
		this.clienteDAO = clidao;
		
		setLayout(null);

		JLabel lblId = new JLabel("Numero de Vuelo");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(27, 11, 138, 14);
		add(lblId);

		textFieldVentaID = new JTextField();
		textFieldVentaID.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		textFieldVentaID.setBounds(27, 25, 183, 20);
		add(textFieldVentaID);
		textFieldVentaID.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(-12, 56, 386, 8);
		add(separator);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		btnBuscar.setBounds(220, 24, 93, 23);
		add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		nro_reserva = new JTextField();
		nro_reserva.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		nro_reserva.setColumns(10);
		nro_reserva.setBounds(27, 84, 286, 20);
		add(nro_reserva);
		
		JLabel lblNumeroDeVuelo = new JLabel("Numero de Reserva *");
		lblNumeroDeVuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNumeroDeVuelo.setBounds(27, 68, 138, 14);
		add(lblNumeroDeVuelo);
		
		JLabel lblAvion = new JLabel("Cliente *");
		lblAvion.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblAvion.setBounds(27, 115, 46, 14);
		add(lblAvion);
		
		eliminar = new JButton("Eliminar");
		eliminar.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		eliminar.setBounds(27, 266, 286, 23);
		eliminar.addActionListener(this);
		add(eliminar);
		
		lblVuelo = new JLabel("Vuelo *");
		lblVuelo.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblVuelo.setBounds(27, 159, 46, 14);
		add(lblVuelo);

		vuelos.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		vuelos.setBounds(27, 173, 286, 20);
		ArrayList<Vuelo> arrayVuelos = this.vueloDAO.getVuelos();
		for (int i = 0; i < arrayVuelos.size(); i++) {
			vuelos.addItem(new Item(arrayVuelos.get(i).getId(),arrayVuelos.get(i).getNro_vuelo()));
		}
		vuelos.setRenderer(new ItemRenderer());
		add(vuelos);
		
		clientes.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		clientes.setBounds(27, 128, 286, 20);
		ArrayList<Cliente> arrayClientes = this.clienteDAO.getClientes();
		for (int i = 0; i < arrayClientes.size(); i++) {
			clientes.addItem(new Item(arrayClientes.get(i).getId(),arrayClientes.get(i).getNombre()));
		}
		clientes.setRenderer(new ItemRenderer());
		add(clientes);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnBuscar)) {
			if (!textFieldVentaID.getText().isEmpty()) {
				traerDatos();
				eliminar.setEnabled(true);
			} else {
				new PopUpError("El campo de busqueda no puede estar vacio");
			}
		} else if (e.getSource().equals(eliminar)) {
			//Se pregunta si queres borrar el cliente
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar este Cliente?", "Aviso", dialogButton);
			//Si seleccionar que si lo de abajo
			if (result == JOptionPane.YES_OPTION) {
				if (borrarCliente()) {
					new PopUpGeneral("Venta eliminada con exito");
				} else {
					new PopUpError("Error al eliminar la venta");
				}
			}
		}

	}

	// Metodo de borrar
	private boolean borrarCliente() {

		return this.ventaDAO.removeVenta(currentID);
	}

	// Metodo de buscar/mostrar
	private void traerDatos() {

		Venta venta = this.ventaDAO.buscarVenta(textFieldVentaID.getText());
		if (venta != null) {
			
			this.currentID = venta.getId();
			
			nro_reserva.setText(venta.getNro_reserva());
			
			Vuelo vuelo = this.vueloDAO.getVuelo(venta.getId_vuelo());
			vuelos.setSelectedItem(new Item(vuelo.getId(),vuelo.getNro_vuelo() + " - " + vuelo.getFecha_hora()));
			
			Cliente cliente = this.clienteDAO.getCliente(venta.getId_cliente());
			clientes.setSelectedItem(new Item(cliente.getId(),cliente.getNombre() + " " + cliente.getApellido() + " - " + cliente.getDni()));
		} else {
			new PopUpError("No se encontraron datos con ese criterio de busqueda");
		}
	}

	private boolean verificarCampos() {
		if (nro_reserva.getText().isEmpty()) {
			return false;
		}
		return true;
	}
}
