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
		file = new File("C:\\Clientes.txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.ClienteToString(cliente));
		bw.close();
	
		return verif;
	}
	



	@Override
	public boolean modifyCliente(List<Cliente> cli) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\Users\\moncerra\\Desktop\\usal 1er cuatri 2017\\prg avanzada\\guia5\\Guia07\\archivos\\fixture4.txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		 String fechapartido="";
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
		
			for (int i = 0; i < cli.size(); i++) {
				
			
			      bf.write(this.ClienteToString(cli.get(i)));
			
				}

	
			bf.close();
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
		file = new File("C:\\Archivos\\Clientes.dat");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToCliente(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String ClienteToString(Cliente cliente){
		return cliente.getDni()+ ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getCuil() + ";" + cliente.getEmail() + ";" + cliente.getFechanac() + ";" + TelefonoToString(cliente.getTelefono()) + ";" + pasajerofrecuentetoStroing(cliente.getPsjfrec()) + ";" + cliente.getDireccion() + "\n";
		
	}
	
	private static String TelefonoToString(Telefono t){
		return t.getNrocelular()+";" +t.getNrolaboral()+";"+t.getNropersonal()+ "\n";
		
	}
	private static String pasajerofrecuentetoStroing(PasajeroFrecuente pjf){
		return pjf.getAlianza()+";"+pjf.getCategoria()+";"+pjf.getNumero()+ "\n";
		
	}
	
	private static String DirecciontoStroing(Direccion dir){
		return dir.getAltura()+";"+dir.getCalle()+";"+dir.getCiudad()+";"+dir.getCodigopostal()+";"+dir.getPais()+";"+dir.getProvincia()+ "\n";
		
	}
	
	private static Cliente StringToCliente(String strCliente){
		String[] straux = strCliente.split(";");
		Cliente cliente = new Cliente();
		cliente.setDni(Integer.parseInt(straux[0]));
		cliente.setNombre(straux[1]);
		cliente.setApellido(straux[2]);
		cliente.setCuil(straux[3]);
		cliente.setEmail(straux[4]);
//		cliente.setFechanac(Date.valueOf(straux[5]));
		Telefono tel = new Telefono((straux[6]),straux[7],straux[8]);
		cliente.setTelefono(tel);
	//	PasajeroFrecuente pf = new PasajeroFrecuente(straux[9],straux[10]);
//		cliente.setPsjfrec(pf);
	//	Direccion dir = new Direccion(straux[11],straux[12],straux[13],straux[14],straux[15],straux[16]);
//		cliente.setDireccion(dir);
		
		
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
}