package DAO.Implement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.Interfaces.VentaDAO;
import Modelo.Cliente;
import Modelo.Ventas;

public class VentaDAOImpleFileString implements VentaDAO{
	
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	
	@Override
	public Ventas getVenta(int id_venta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ventas buscarVenta(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Ventas> getVentas () throws FileNotFoundException {
		List<Ventas> list = new ArrayList<Ventas>();
		file = new File("C:\\Archivos\\Ventas.dat");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToVentas(sc.nextLine()));
		}
		
		return (ArrayList<Ventas>) list;
	}



	private Ventas StringToVentas(String strVentas) {
		String[] straux = strVentas.split(";");
		Ventas venta = new Ventas(strVentas, strVentas, 0, 0, 0);
		venta.setCantPasajeros(Integer.parseInt(straux[0]));
		venta.setClienteNumero(straux[1]);
		venta.setPrecioTotal(Long.parseLong(straux[2]));
		venta.setPrecioUnit(Long.parseLong(straux[3]));
		
		return venta;
	}

	@Override
	public boolean addVenta(Ventas venta) throws FileNotFoundException, IOException {
		boolean verif = true ; 
		file = new File("C:\\Ventas.txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.VentaToString(venta));
		bw.close();
	
		return verif;
	}

	public boolean removeVenta(Ventas venta) throws FileNotFoundException, IOException {
		return false;
		
	}
	
	
	private static String VentaToString(Ventas venta){
		return venta.getVentaNumero()+ ";" + venta.getPrecioTotal()+ ";" + venta.getClienteNumero()+ ";" + venta.getPrecioUnit()+ "\n";
		
	}

	@Override
	public boolean removeVenta(int id_venta) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	
	
	
	

}
