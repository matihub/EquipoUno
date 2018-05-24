package DAO.Interfaces;

import java.util.ArrayList;

import Modelo.Ventas;

public interface VentaDAO {

	public Ventas getVenta(int id_venta);
	public Ventas buscarVenta(String search);
	public ArrayList<Ventas> getVentas();
	public boolean addVenta(Ventas venta);
	public boolean removeVenta(int id_venta);

}

