package DAO.Implement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.Interfaces.VueloDAO;
import Modelo.Vuelo;
import Modelo.Direccion;
import Modelo.PasajeroFrecuente;
import Modelo.Telefono;
import Modelo.Vuelo;

public class VueloDAOlFileString implements VueloDAO {

	
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	

	public boolean addVuelo(Vuelo Vuelo) throws FileNotFoundException, IOException {
		boolean verif = true ; 
		file = new File("C:\\Vuelos.txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.VueloToString(Vuelo));
		bw.close();
	
		return verif;
	}
	



	@Override
	public boolean modifyVuelo(List<Vuelo> cli) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\Vuelo"+.txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		 String fechapartido="";
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
		
			for (int i = 0; i < cli.size(); i++) {
				
			
			      bf.write(this.VueloToString(cli.get(i)));
			
				}

	
			bf.close();
			fw.close();
			
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	
	

	
	public void deleteVuelo(Vuelo Vuelo) throws FileNotFoundException, IOException {
		
	}

	@Override
	public List<Vuelo> getAllVuelo() throws FileNotFoundException, IOException {
		List<Vuelo> list = new ArrayList<Vuelo>();
		file = new File("C:\\Archivos\\Vuelos.dat");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToVuelo(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String VueloToString(Vuelo Vuelo){
		return Vuelo.getDni()+ ";" + Vuelo.getNombre() + ";" + Vuelo.getApellido() + ";" + Vuelo.getCuil() + ";" + Vuelo.getEmail() + ";" + Vuelo.getFechanac() + ";" + TelefonoToString(Vuelo.getTelefono()) + ";" + pasajerofrecuentetoStroing(Vuelo.getPsjfrec()) + ";" + Vuelo.getDireccion() + "\n";
		
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
	
	private static Vuelo StringToVuelo(String strVuelo){
		String[] straux = strVuelo.split(";");
		Vuelo Vuelo = new Vuelo();
		Vuelo.setDni(Integer.parseInt(straux[0]));
		Vuelo.setNombre(straux[1]);
		Vuelo.setApellido(straux[2]);
		Vuelo.setCuil(straux[3]);
		Vuelo.setEmail(straux[4]);
//		Vuelo.setFechanac(Date.valueOf(straux[5]));
		Telefono tel = new Telefono((straux[6]),straux[7],straux[8]);
		Vuelo.setTelefono(tel);
	//	PasajeroFrecuente pf = new PasajeroFrecuente(straux[9],straux[10]);
//		Vuelo.setPsjfrec(pf);
	//	Direccion dir = new Direccion(straux[11],straux[12],straux[13],straux[14],straux[15],straux[16]);
//		Vuelo.setDireccion(dir);
		
		
		return Vuelo;
		
	}




	@Override
	public Vuelo getVuelo(int clie_id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Vuelo buscarVuelo(String search) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public ArrayList<Vuelo> getVuelos() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean removeVuelo(int clie_id) {
		// TODO Auto-generated method stub
		return false;
	}








	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public Vuelo buscarVuelo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
