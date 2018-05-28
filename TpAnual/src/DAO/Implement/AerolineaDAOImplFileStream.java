package DAO.Implement;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.Interfaces.AerolineaDAO;
import Modelo.Aerolinea;

public class AerolineaDAOImplFileStream implements AerolineaDAO {

	@Override
	public boolean addAerolinea(Aerolinea Aerolinea) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return true;
	}

	public void updateAerolinea(Aerolinea Aerolinea) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	public void deleteAerolinea(Aerolinea Aerolinea) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aerolinea> getAllAerolinea() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aerolinea getAerolinea(int clie_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aerolinea buscarAerolinea(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Aerolinea> getAerolineas() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeAerolinea(int clie_id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Aerolinea buscarAerolinea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyAerolinea(List<Aerolinea> cli) {
		// TODO Auto-generated method stub
		return false;
	}
}
