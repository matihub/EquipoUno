package DAO.Interfaces;


import java.util.ArrayList;

import Modelo.Avion;

public interface AvionDAO {

	public Avion getAvion(int id_avion);

	public Avion buscarAvion(String search);

	public ArrayList<Avion> getAviones();

	public boolean addAvion(Avion avion);

	public boolean removeAvion(int id_avion);

	public boolean modifyAvion(Avion avion);

}

