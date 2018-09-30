package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
/*
import negocio.objetos.Avion;
import negocio.objetos.Vuelo;
import persistencia.dao.interfaces.AvionDAO;
import persistencia.dao.interfaces.VueloDAO;
*/
import javax.swing.JTable;
import java.awt.Font;

public class VueloListado extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	private static final long serialVersionUID = -8044390191183257340L;

	private VueloDAO vueloDAO;
	private AvionDAO avionDAO;
	
	private JTable table;

	public VueloListado(VueloDAO vuedao, AvionDAO avidao) {

		this.vueloDAO = vuedao;
		this.avionDAO = avidao; 
		
		setLayout(null);
		
		traerDatos();
	}

	private void traerDatos() {

		ArrayList<Vuelo> vuelos = this.vueloDAO.getVuelos();
			
		Object rowData[][] = new Object[vuelos.size()][3];
		Object columnNames[] = {"Nro Vuelo", "Fecha y Hora", "Avion"};
		
		for (int i = 0; i < vuelos.size(); i++) {
			rowData[i][0] = vuelos.get(i).getNro_vuelo();
			rowData[i][1] = vuelos.get(i).getFecha_hora();
			Avion avion = this.avionDAO.getAvion(vuelos.get(i).getId_avion());
			rowData[i][2] = avion.getNombre() + " - " + avion.getModelo();
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
