package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import negocio.objetos.Avion;
import persistencia.dao.interfaces.AvionDAO;

import javax.swing.JTable;
import java.awt.Font;

public class AvionListado extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -8044390191183257340L;
	
	private AvionDAO avionDAO;
	private JTable table;

	public AvionListado(AvionDAO avionDAO) {
		
		this.avionDAO = avionDAO;
		
		setLayout(null);
		
		traerDatos();
	}

	private void traerDatos() {

	//	ArrayList<Avion> aviones = this.avionDAO.getAviones();
			
		Object rowData[][] = new Object[aviones.size()][3];
		Object columnNames[] = {"Nombre", "Apellido", "Cant. Asientos"};
		
		for (int i = 0; i < aviones.size(); i++) {
			rowData[i][0] = aviones.get(i).getNombre();
			rowData[i][1] = aviones.get(i).getModelo();
			rowData[i][2] = aviones.get(i).getCant_asientos();
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
}
