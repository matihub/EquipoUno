package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Aerolinea;

public interface AerolineaDAO {

	public Aerolinea getAerolinea(int clie_id);
	
	public Aerolinea buscarAerolinea();

	public ArrayList<Aerolinea> getAerolineas();

	public boolean addAerolinea(Aerolinea cli) throws FileNotFoundException, IOException;

	public boolean removeAerolinea(int clie_id);

	public boolean modifyAerolinea(List<Aerolinea> cli);
	
	public int getTotalCount();

	public List<Aerolinea> getAllAerolinea() throws FileNotFoundException, IOException;

	Aerolinea buscarAerolinea(String search);

}

