package DAO.Implement;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



//import com.sun.security.ntlm.Client;

import DAO.Interfaces.ClienteDAO;
import Modelo.Cliente;

public class ClienteDAOImplFileStream implements ClienteDAO {

	@Override
	public boolean addCliente(Cliente cliente) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return true;
	}

	public void updateCliente(Cliente cliente) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	public void deleteCliente(Cliente cliente) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getCliente(int clie_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarCliente(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeCliente(int clie_id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Cliente buscarCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyCliente(List<Cliente> cli) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
