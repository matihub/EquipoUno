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
import DAO.Interfaces.AerolineaDAO;

import Modelo.Vuelo;

public class VueloDAOlFileString implements VueloDAO {

	
	private File file;
	private File directorio;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	private AerolineaDAOlFileString aer;

	public boolean addVuelo(Vuelo Vuelo) throws FileNotFoundException, IOException {
		boolean verif = true ; 
		file = new File("C:\\Vuelos"+Vuelo.getNroVuelo()+".txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.VueloToString(Vuelo));
		bw.close();
	
		return verif;
	}
	



	@Override
	public boolean modifyVuelo(Vuelo vue) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\Vuelo"+vue.getNroVuelo()+".txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
		
			      bf.write(this.VueloToString(vue));
			
			
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
	
		directorio = new File("C:\\Archivos\\Vuelos.dat");
		String[] arregloArchivos = directorio.list();
		int numArchivos = arregloArchivos.length;
	    for (int i = 0; i < arregloArchivos.length; i++) {
			
	    	file = new File(arregloArchivos[i]);
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToVuelo(sc.nextLine()));
		}
	    }
		return list;
	}
	
	private static String VueloToString(Vuelo Vuelo){
		return Vuelo.getNroVuelo()+ ";" + Vuelo.getLugarOrigen() + ";" + Vuelo.getLugarDestino() + ";" + Vuelo.getHoraSalida() + ";" + Vuelo.getHoraLlegada()+ ";" + Vuelo.getAerolinea().getNombre()+ "\n";
		
	}
	
	
	
	
	
	private static Vuelo StringToVuelo(String strVuelo){
		AerolineaDAOlFileString aer = new AerolineaDAOlFileString();
		String[] straux = strVuelo.split(";");
		Vuelo Vuelo = new Vuelo();
		Vuelo.setNroVuelo(straux[0]);
		Vuelo.setLugarOrigen(straux[1]);
		Vuelo.setLugarDestino(straux[2]);
		Vuelo.setHoraSalida(straux[3]);
		Vuelo.setHoraLlegada(straux[4]);
        Vuelo.setAerolinea(aer.buscarAerolinea(straux[5]));
		
		
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
