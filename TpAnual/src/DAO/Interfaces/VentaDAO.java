package DAO.Interfaces;

import java.util.ArrayList;

import Modelo.Venta;

public interface VentaDAO {

	public Venta getVenta(int id_venta);

	public Venta buscarVenta(String search);

	public ArrayList<Venta> getVentas();

	public boolean addVenta(Venta venta);

	public boolean removeVenta(int id_venta);

}

