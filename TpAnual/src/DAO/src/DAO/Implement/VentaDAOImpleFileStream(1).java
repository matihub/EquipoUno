package DAO.Implement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.Interfaces.VentaDAO;
import Modelo.Ventas;

public class VentaDAOImpleFileStream implements VentaDAO {

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
	public ArrayList<Ventas> getVentas() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addVenta(Ventas venta) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVenta(int id_venta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyVenta(List<Ventas> venList) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
