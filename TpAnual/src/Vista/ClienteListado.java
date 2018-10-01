package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

//import negocio.objetos.Cliente;
//import persistencia.dao.interfaces.ClienteDAO;

import javax.swing.JTable;

import Controlador.IOCliente;

import java.awt.Font;

public class ClienteListado extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	private static final long serialVersionUID = -8044390191183257340L;
	
	private IOCliente clienteDAO;
	private JTable table;

	public ClienteListado(IOCliente clienteDAO) {
		
		this.clienteDAO = clienteDAO;
		
		setLayout(null);
		
		traerDatos();
	}

	private void traerDatos() {

		Object columnNames[] = {"Nombre", "Apellido", "DNI"};
		table = new JTable(this.clienteDAO.findAll(),columnNames);
		table.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		table.setEnabled(false);
		table.setBounds(0, 0, 330, 300);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		scrollPane.setBounds(0, 0, 330, 300);
		scrollPane.setViewportView(table);
		add(scrollPane);
	}


	
}
