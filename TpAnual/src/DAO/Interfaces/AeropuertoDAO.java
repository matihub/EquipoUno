package DAO.Interfaces;

import java.util.ArrayList;

import Modelo.Aeropuerto;

public interface AeropuertoDAO {

	public Aeropuerto getAeropuerto(String nombre);

	public Aeropuerto buscarAeropuerto(String search);

	public ArrayList<Aeropuerto> getAeropuertos();

	public boolean addAeropuerto(Aeropuerto aeropuerto);

	public boolean removeAeropuerto(String nombre);

	public boolean modifyAeropuerto(Aeropuerto areopuerto);

}

