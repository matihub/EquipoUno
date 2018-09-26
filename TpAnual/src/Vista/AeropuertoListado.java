package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Modelo.Aeropuerto;
import DAO.Interfaces.*;

import javax.swing.JTable;
import java.awt.Font;

public class AeropuertoListado extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -8044390191183257340L;
	
	private AeropuertoDAO aeropuertoDAO;
	private JTable table;

	public AeropuertoListado(AeropuertoDAO aerodao) {
		
		this.aeropuertoDAO = aerodao;
		
		setLayout(null);
		
		traerDatos();
	}

	private void traerDatos() {

		ArrayList<Aeropuerto> aeropuertos = this.aeropuertoDAO.getAeropuertos();
			
		Object rowData[][] = new Object[aeropuertos.size()][2];
		Object columnNames[] = {"Nombre", "Pais"};
		
		for (int i = 0; i < aeropuertos.size(); i++) {
			rowData[i][0] = aeropuertos.get(i).getNombreAeropuerto();
		//	rowData[i][1] = aeropuertos.get(i).getPais();
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
