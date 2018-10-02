package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



//import com.sun.security.ntlm.Client;

import Modelo.Cliente;

public interface ClienteDAO {

	public Cliente getCliente(int clie_id);
	
	public Cliente buscarCliente();

	public ArrayList<Cliente> getClientes();

	public boolean addCliente(Cliente cli) throws FileNotFoundException, IOException;

	public boolean removeCliente(int clie_id);

	public boolean modifyCliente(List<Cliente> cli);
	
	public int getTotalCount();

	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException;

	Cliente buscarCliente(String search);

	public List<Cliente> findAll();
	
	public default boolean addCliente(String nombre,String apellido,String direccion,String dni,String telefono,String nro_pasaporte,String email) {
		return false;};

}
