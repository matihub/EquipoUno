package DAO.Interfaces;

import java.util.List;

import Modelo.Vuelo;

public interface VueloDAO {
	
	public boolean create(List<Vuelo> Vuelo);
    public List<Vuelo> findAll();
    public Vuelo findByName(String name);
    public boolean update(Vuelo Vuelo, Vuelo VueloUpdated);
    public boolean delete(Vuelo Vuelo);
    }



