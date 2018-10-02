package DAO.Implement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DAO.Conecction.ConfigPropertiesJDBCImpl;
import DAO.Conecction.IConfigProperties;
import DAO.Conecction.MySQLDBConnection;
import Modelo.Cliente;
import DAO.Interfaces.ClienteDAO;

public class ClienteDAOJDBC implements ClienteDAO {
	
	String tabla = "dbo.Clientes";	
	
//public boolean addCliente(Cliente cli) {
	public boolean addCliente(String nombre,String apellido,String direccion,String dni,String telefono,String nro_pasaporte,String email) {
		boolean verif = true;
		
		IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
		MySQLDBConnection connect = new MySQLDBConnection();
		Connection conn = null;
		
		try {
			config.loadConfig();
			conn = connect.getConnection(config);
			String query = "INSERT INTO " + tabla + " (clie_nombre,clie_apellido,clie_pais,clie_dni,clie_pasajFrec_aero,clie_provincia,clie_ciudad) VALUES('" 
				//	+ cli.getNombre() + "','" + cli.getApellido() + "','" + cli.getDireccion() + "','" + cli.getDni() + "','" + cli.getTelefono() + "','" + cli.getNro_pasaporte() + "','" + cli.getEmail() + "');";
					+ nombre + "','" + apellido + "','" + direccion + "','" + dni + "','" + telefono + "','" + nro_pasaporte + "','" + email + "');";
					PreparedStatement ps = conn.prepareStatement(query);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			verif = false;
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return verif;
	}

@Override
public Cliente getCliente(int clie_id) {
	Cliente resultCliente = null;
	
	IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
	MySQLDBConnection connect = new MySQLDBConnection();
	Connection conn = null;
	
	try {
		config.loadConfig();
		conn = connect.getConnection(config);
		String query = "SELECT * FROM " + tabla + " WHERE id_cliente = '" + clie_id + "'";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			resultCliente = new Cliente();
		//	resultCliente.setDni(rs.getInt("id_cliente"));
			resultCliente.setNombre(rs.getString("nombre"));
			resultCliente.setApellido(rs.getString("apellido"));
			resultCliente.setDni(rs.getString("dni"));
		//	resultCliente.setDireccion(rs.getString("direccion"));
			resultCliente.setEmail(rs.getString("email"));
		//	resultCliente.setTelefono(rs.getString("telefono"));
		//	resultCliente.setNro_pasaporte(rs.getString("nro_pasaporte"));
		}
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	return resultCliente;
}


@Override
public Cliente buscarCliente() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<Cliente> getClientes() {
	ArrayList<Cliente> resultArrayList = new ArrayList<Cliente>();
	
	IConfigProperties config = new ConfigPropertiesJDBCImpl("config.properties");
	MySQLDBConnection connect = new MySQLDBConnection();
	Connection conn = null;
	
	try {
		config.loadConfig();
		conn = connect.getConnection(config);
		String query = "SELECT * FROM " + tabla;
		PreparedStatement ps1 = conn.prepareStatement(query);
		ResultSet rs = ps1.executeQuery();
		while (rs.next()) {
			Cliente cliente = new Cliente();
	//		cliente.setId(rs.getInt("id_cliente"));
			cliente.setNombre(rs.getString("clie_nombre"));
			cliente.setApellido(rs.getString("clie_apellido"));
			cliente.setDni(rs.getString("clie_dni"));
	//		cliente.setCuil(cuil);
		//	cliente.setDireccion(direccion);
		//	cliente.setEmail(email);
		//	cliente.setNro_pasaporte(nro_pasaporte);
		//	cliente.setDireccion(rs.getString("direccion"));
	//		cliente.setEmail(rs.getString("email"));
		//	cliente.setTelefono(rs.getString("telefono"));
		//	cliente.setNro_pasaporte(rs.getString("nro_pasaporte"));
			resultArrayList.add(cliente);
		}
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	return resultArrayList;
}

@Override
public boolean addCliente(Cliente cli) throws FileNotFoundException, IOException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeCliente(int clie_id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean modifyCliente(List<Cliente> cli) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public int getTotalCount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List<Cliente> getAllCliente() throws FileNotFoundException, IOException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Cliente buscarCliente(String search) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Cliente> findAll() {
	// TODO Auto-generated method stub
	return null;
}


}
