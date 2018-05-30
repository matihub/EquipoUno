package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Vuelo;
import Modelo.Vuelo;

public interface VueloDAO {
	
	public Vuelo getVuelo(int vue_id);
	
	public Vuelo buscarVuelo();

	public ArrayList<Vuelo> getVuelos();

	public boolean addVuelo(Vuelo vue) throws FileNotFoundException, IOException;

	public boolean removeVuelo(int vue_id);

	public boolean modifyVuelo(Vuelo vue);
	
	public int getTotalCount();

	public List<Vuelo> getAllVuelo() throws FileNotFoundException, IOException;

	Vuelo buscarVuelo(String search);

	public static List<Vuelo> ingresarvuelo() {
		// TODO Auto-generated method stub
		return null;
	}

    }



