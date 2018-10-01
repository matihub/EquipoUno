package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.IOAerolinea;
import Controlador.IOCliente;
import Controlador.IOVenta;
import Controlador.IOVuelo;
//import DAO.Interfaces.*;
//import panels.*;


import java.awt.Font;

public class FramePrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = -5522966213537914564L;
	private JPanel contentPane;
	
	private JMenuItem itemBuscarClientes;
	private JMenuItem itemAltaCliente;
	private JMenuItem itemListarClientes;

	private JMenuItem itemBuscarAviones;
	private JMenuItem itemAltaAvion;
	private JMenuItem itemListarAviones;

	private JMenuItem itemBuscarAeropuertos;
	private JMenuItem itemAltaAeropuerto;
	private JMenuItem itemListarAeropuertos;

	private JMenuItem itemBuscarVuelos;
	private JMenuItem itemAltaVuelo;
	private JMenuItem itemListarVuelos;

	private JMenuItem itemBuscarVentas;
	private JMenuItem itemAltaVenta;
	private JMenuItem itemListarVentas;

	private IOCliente clienteDAO;
	private IOAerolinea avionDAO;
//	private AeropuertoDAO aeropuertoDAO;
//	private VueloDAO vueloDAO;
//	private VentaDAO ventaDAO;

	public FramePrincipal(IOCliente clienteDAO2/*,   AeropuertoDAO aeropuertoDAO2, VueloDAO vueloDAO2, VentaDAO ventaDAO2*/) {

		this.clienteDAO = clienteDAO2;
	//	this.avionDAO = avidao;
	//	this.aeropuertoDAO = aeropuertoDAO2;
	//	this.vueloDAO = vueloDAO2;
//		this.ventaDAO = ventaDAO2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	setBounds(100, 100, 350, 300);
		setBounds(100, 100, 591, 403);
		setBackground(Color.DARK_GRAY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setFont(new Font("SimSun", Font.ITALIC, 15));
		menuBar.add(mnClientes);

		itemListarClientes = new JMenuItem("Consulta");
		itemListarClientes.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnClientes.add(itemListarClientes);
		itemListarClientes.addActionListener(this);

		itemAltaCliente = new JMenuItem("Alta Clientes");
		itemAltaCliente.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnClientes.add(itemAltaCliente);
		itemAltaCliente.addActionListener(this);

		itemBuscarClientes = new JMenuItem("Eliminar | Modificar");
		itemBuscarClientes.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnClientes.add(itemBuscarClientes);
		itemBuscarClientes.addActionListener(this);

		
	}
	

	private void setContentPane(
			JPanel contentPane) {
		// TODO Auto-generated method stub
		
	}
	public FramePrincipal(IOAerLineas AerolineaIO/*,   AeropuertoDAO aeropuertoDAO2, VueloDAO vueloDAO2, VentaDAO ventaDAO2*/) {

		this.AerolineaIO = AerolineaIO;
	//	this.avionDAO = avidao;
	//	this.aeropuertoDAO = aeropuertoDAO2;
	//	this.vueloDAO = vueloDAO2;
//		this.ventaDAO = ventaDAO2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

	
		itemBuscarClientes.addActionListener(this);

		JMenu mnAvion = new JMenu("Aviones");
		mnAvion.setFont(new Font("SimSun", Font.ITALIC, 15));
		menuBar.add(mnAvion);

		itemListarAviones = new JMenuItem("Listado");
		itemListarAviones.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnAvion.add(itemListarAviones);
		itemListarAviones.addActionListener(this);

		itemAltaAvion = new JMenuItem("Alta Avion");
		itemAltaAvion.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnAvion.add(itemAltaAvion);
		itemAltaAvion.addActionListener(this);

		itemBuscarAviones = new JMenuItem("Eliminar | Modificar");
		itemBuscarAviones.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnAvion.add(itemBuscarAviones);
		itemBuscarAviones.addActionListener(this);

		
	}
	
	public FramePrincipal(IOvUELOS VuelosIO/*,   AeropuertoDAO aeropuertoDAO2, VueloDAO vueloDAO2, VentaDAO ventaDAO2*/) {

		this.VuelosIO = VuelosIO;
	//	this.avionDAO = avidao;
	//	this.aeropuertoDAO = aeropuertoDAO2;
	//	this.vueloDAO = vueloDAO2;
//		this.ventaDAO = ventaDAO2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

	
		
		
		JMenu mnVuelos = new JMenu("Vuelos");
		mnVuelos.setFont(new Font("SimSun", Font.ITALIC, 15));
		menuBar.add(mnVuelos);

		itemListarVuelos = new JMenuItem("Listado");
		itemListarVuelos.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVuelos.add(itemListarVuelos);
		itemListarVuelos.addActionListener(this);

		itemAltaVuelo = new JMenuItem("Nuevo");
		itemAltaVuelo.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVuelos.add(itemAltaVuelo);
		itemAltaVuelo.addActionListener(this);

		itemBuscarVuelos = new JMenuItem("Eliminar | Modificar");
		itemBuscarVuelos.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVuelos.add(itemBuscarVuelos);
		itemBuscarVuelos.addActionListener(this);

		
	}
	
	public FramePrincipal(IOVentas VentasIO/*,   AeropuertoDAO aeropuertoDAO2, VueloDAO vueloDAO2, VentaDAO ventaDAO2*/) {

		this.VuelosIO = VuelosIO;
	//	this.avionDAO = avidao;
	//	this.aeropuertoDAO = aeropuertoDAO2;
	//	this.vueloDAO = vueloDAO2;
//		this.ventaDAO = ventaDAO2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("SimSun", Font.ITALIC, 15));
		menuBar.add(mnVentas);

		itemListarVentas = new JMenuItem("Listado");
		itemListarVentas.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVentas.add(itemListarVentas);
		itemListarVentas.addActionListener(this);

		itemAltaVenta = new JMenuItem("Nuevo");
		itemAltaVenta.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVentas.add(itemAltaVenta);
		itemAltaVenta.addActionListener(this);

		itemBuscarVentas = new JMenuItem("Eliminar | Modificar");
		itemBuscarVentas.setFont(new Font("SimSun", Font.ITALIC, 15));
		mnVentas.add(itemBuscarVentas);
		itemBuscarVentas.addActionListener(this);
	}
	

	private void setContentPane(
			JPanel contentPane) {
		// TODO Auto-generated method stub
		
	}
	public void FramePrincipal() {
		// TODO Auto-generated constructor stub
	}

	private void refrescarPaneles() {
		
		getContentPane().add(contentPane);
		this.repaint();
		this.revalidate();
	}

	private void removerPaneles() {
		
		try {
			this.remove(contentPane);
			contentPane = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(itemBuscarClientes)) {
			this.removerPaneles();
//			contentPane = new ClienteModificacionEliminacion(this.clienteDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemAltaCliente)) {
			this.removerPaneles();
			contentPane = new ClienteAlta(this.clienteDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemListarClientes)) {
			this.removerPaneles();
			contentPane = new ClienteListado(this.clienteDAO);
			this.refrescarPaneles();
		}
		/*
		///////////
		if (e.getSource().equals(itemBuscarAviones)) {
			this.removerPaneles();
		//	contentPane = new AvionModificacionEliminacion(this.avionDAO, this.aeropuertoDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemAltaAvion)) {
			this.removerPaneles();
			//contentPane = new AvionAlta(this.avionDAO, this.aeropuertoDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemListarAviones)) {
			this.removerPaneles();
			contentPane = new AvionListado(this.avionDAO);
			this.refrescarPaneles();
		}
		//////////
		if (e.getSource().equals(itemBuscarAeropuertos)) {
			this.removerPaneles();
			contentPane = new AeropuertoModificacionEliminacion(this.aeropuertoDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemAltaAeropuerto)) {
			this.removerPaneles();
			contentPane = new AeropuertoAlta(this.aeropuertoDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemListarAeropuertos)) {
			this.removerPaneles();
			contentPane = new AeropuertoListado(this.aeropuertoDAO);
			this.refrescarPaneles();
		}
		//////////
		if (e.getSource().equals(itemBuscarVuelos)) {
			this.removerPaneles();
			contentPane = new VueloModificacionEliminacion(this.vueloDAO,this.avionDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemAltaVuelo)) {
			this.removerPaneles();
			contentPane = new VueloAlta(this.vueloDAO,this.avionDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemListarVuelos)) {
			this.removerPaneles();
			contentPane = new VueloListado(this.vueloDAO,this.avionDAO);
			this.refrescarPaneles();
		}
		//////////
		if (e.getSource().equals(itemBuscarVentas)) {
			this.removerPaneles();
			contentPane = new VentaModificacionEliminacion(this.ventaDAO,this.vueloDAO,this.clienteDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemAltaVenta)) {
			this.removerPaneles();
			contentPane = new VentaAlta(this.ventaDAO,this.vueloDAO,this.clienteDAO);
			this.refrescarPaneles();
		} else if (e.getSource().equals(itemListarVentas)) {
			this.removerPaneles();
			contentPane = new VentaListado(this.ventaDAO,this.vueloDAO,this.clienteDAO);
			this.refrescarPaneles();
		}
		*/
	}

}
