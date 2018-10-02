package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Provincia;


public interface ProvinciaDAO {
	

	public  List<Provincia> getAllProvincia() throws FileNotFoundException, IOException;

}
