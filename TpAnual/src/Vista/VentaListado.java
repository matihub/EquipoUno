package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
/*
import negocio.objetos.Cliente;
import negocio.objetos.Venta;
import negocio.objetos.Vuelo;
import persistencia.dao.interfaces.ClienteDAO;
import persistencia.dao.interfaces.VentaDAO;
import persistencia.dao.interfaces.VueloDAO;
*/
import javax.swing.JTable;
import java.awt.Font;

public class VentaListado extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
/*	
	private static final long serialVersionUID = -8044390191183257340L;

	private VentaDAO ventaDAO;
	private VueloDAO vueloDAO;
	private ClienteDAO clienteDAO;
	
	private JTable table;

	public VentaListado(VentaDAO vendao,VueloDAO vuedao, ClienteDAO clidao) {

		this.vueloDAO = vuedao;
		this.ventaDAO = vendao; 
		this.clienteDAO = clidao;
		
		setLayout(null);
		
		traerDatos();
	}

	private void traerDatos() {

		ArrayList<Venta> ventas = this.ventaDAO.getVentas();
			
		Object rowData[][] = new Object[ventas.size()][3];
		Object columnNames[] = {"Nro Vuelo", "Cliente", "Nro Reserva"};
		
		for (int i = 0; i < ventas.size(); i++) {
			Vuelo vuelo = this.vueloDAO.getVuelo(ventas.get(i).getId_vuelo());
			rowData[i][0] = vuelo.getNro_vuelo();
			Cliente cliente = this.clienteDAO.getCliente(ventas.get(i).getId_cliente());
			rowData[i][1] = cliente.getNombre() + " " + cliente.getApellido();
			rowData[i][2] = ventas.get(i).getNro_reserva();
		}
		table = new JTable(rowData,columnNames);
		table.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		table.setEnabled(false);
		table.setBounds(0, 0, 330, 300);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		scrollPane.setBounds(0, 0, 330, 300);
		scrollPane.setViewportView(table);
		add(scrollPane);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	*/
}
