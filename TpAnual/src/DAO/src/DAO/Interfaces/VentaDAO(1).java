package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Aerolinea;
import Modelo.Ventas;

public interface VentaDAO {

	public Ventas getVenta(int id_venta);
	public Ventas buscarVenta(String search);
	public ArrayList<Ventas> getVentas() throws FileNotFoundException;
	public boolean addVenta(Ventas venta) throws FileNotFoundException, IOException;
	public boolean removeVenta(int id_venta);
	public boolean modifyVenta(List<Ventas> venList);
}

