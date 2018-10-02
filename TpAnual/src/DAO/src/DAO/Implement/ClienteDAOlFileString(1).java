package DAO.Implement;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.sun.security.ntlm.Client;

import DAO.Interfaces.ClienteDAO;
import Modelo.Cliente;
import Modelo.Direccion;
import Modelo.PasajeroFrecuente;
import Modelo.Telefono;



public class ClienteDAOlFileString implements ClienteDAO{
	
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	

	public boolean addCliente(Cliente cliente) throws FileNotFoundException, IOException {
		boolean verif = true ; 
		file = new File("C:\\archivos\\clientes.txt");
		try{
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(ClienteToString(cliente));
		}catch (Exception e){
			verif = false;
		}
		try {
			bw.close();
			fw.close();
			}
		catch (Exception e){
			verif = false;
		}	
		return verif;
	}
	



	@Override
	public boolean modifyCliente(List<Cliente> cli) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\archivos\\clientes.txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		 
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			fw=new FileWriter(f);
			bw=new BufferedWriter(fw);
		
			for (int i = 0; i < cli.size(); i++) {
				
			
			      bw.write(this.ClienteToString(cli.get(i)));
			
				}
		}
			catch (Exception e){
				return false;
			}
	try {
			bw.close();
			fw.close();
			
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	
	

	
	public void deleteCliente(Cliente cliente) throws FileNotFoundException, IOException {
		
	}

	@Override
	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException {
		List<Cliente> list = new ArrayList<Cliente>();
		file = new File("C:\\Archivos\\Clientes.txt");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToCliente(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String ClienteToString(Cliente cliente){
	//	return cliente.getDni()+ ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getCuil() + ";" + cliente.getEmail() + ";" + cliente.getFechanac() + ";" + TelefonoToString(cliente.getTelefono().getNrocelular()) + ";" + pasajerofrecuentetoStroing(cliente.getPsjfrec()) + ";" + cliente.getDireccion() + "\n";
		return cliente.getDni()+ ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getCuil() + ";" + cliente.getEmail() + ";" + cliente.getFechanac() + ";" + TelefonoToString(cliente.getTelefono()) + ";" + pasajerofrecuentetoStroing(cliente.getPsjfrec()) + ";" + cliente.getDireccion().getCalle() + "\n";
		
	}
	
	private static String TelefonoToString(Telefono t){
		return t.getNrocelular()+";" +t.getNrolaboral()+";"+t.getNropersonal()+ "\n";
		
	}
	private static String pasajerofrecuentetoStroing(PasajeroFrecuente pjf){
	//	return pjf.getAlianza()+";"+pjf.getCategoria()+";"+pjf.getNumero()+ "\n";
		return pjf.getCategoria()+";"+pjf.getNumero()+ "\n";
	}
	
	private static String DirecciontoStroing(Direccion dir){
		return dir.getAltura()+";"+dir.getCalle()+";"+dir.getCiudad()+";"+dir.getCodigopostal()+";"+dir.getPais()+";"+dir.getProvincia()+ "\n";
		
	}
	
	private static Cliente StringToCliente(String strCliente){
		String[] straux = strCliente.split(";");
		Cliente cliente = new Cliente();
	//	cliente.setDni(Integer.parseInt(straux[0]));
		cliente.setNombre(straux[1]);
		cliente.setApellido(straux[2]);
		cliente.setCuil(straux[3]);
		cliente.setEmail(straux[4]);
//		cliente.setFechanac(Date.valueOf(straux[5]));
		Telefono tel = new Telefono((straux[6]),straux[7],straux[8]);
		cliente.setTelefono(tel);
		PasajeroFrecuente pf = new PasajeroFrecuente();
		pf.setAlianza(straux[9]);
		pf.setCategoria(straux[10]);
		cliente.setPsjfrec(pf);
		Direccion dir = new Direccion();
		dir.setAltura(Integer.parseInt(straux[11]));
		dir.setCalle(straux[12]);
		dir.setCiudad(straux[13]);
		dir.setCodigopostal(Integer.parseInt(straux[14]));
		dir.setPais(straux[15]);
		dir.setProvincia(straux[16]);
		cliente.setDireccion(dir);
		
		
		return cliente;
		
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
	public boolean removeCliente(int clie_id) {
		// TODO Auto-generated method stub
		return false;
	}








	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public Cliente buscarCliente() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}