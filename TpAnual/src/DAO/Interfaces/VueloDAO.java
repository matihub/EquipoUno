package DAO.Interfaces;



import java.util.ArrayList;

import Modelo.Vuelo;

public interface VueloDAO {

	public Vuelo getVuelo(int id_vuelo);

	public Vuelo buscarVuelo(String search);

	public ArrayList<Vuelo> getVuelos();

	public boolean addVuelo(Vuelo vuelo);

	public boolean removeVuelo(int id_vuelo);

	public boolean modifyVuelo(Vuelo vuelo);

}



