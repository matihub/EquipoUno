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

import javax.swing.text.StyledEditorKit.ForegroundAction;

import DAO.Interfaces.AerolineaDAO;
import Modelo.Aerolinea;
import Modelo.Vuelo;



public class AerolineaDAOlFileString implements AerolineaDAO{
	
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	

	public boolean addAerolinea(Aerolinea Aerolinea) throws FileNotFoundException, IOException {
		boolean verif = true ; 
		file = new File("C:\\Aerolineas.txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.AerolineaToString(Aerolinea));
		bw.close();
	
		return verif;
	}
	



	
	public boolean modifyAerolinea(Aerolinea aer ) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\Aerolinea"+aer.getNombre()+".txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
		
			      bf.write(this.AerolineaToString(aer));
			      for (int i = 0; i < aer.getVuelo().size(); i++) {
			    	  bf.write(aer.getVuelo().get(i).getNroVuelo()+"-");
				}
		
			bf.close();
			fw.close();
			
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	
	

	
	public void deleteAerolinea(Aerolinea Aerolinea) throws FileNotFoundException, IOException {
		
	}

	@Override
	public List<Aerolinea> getAllAerolinea() throws FileNotFoundException, IOException {
		List<Aerolinea> list = new ArrayList<Aerolinea>();
		file = new File("C:\\Archivos\\Aerolineas.txt");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToAerolinea(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String AerolineaToString(Aerolinea Aer){
		 return Aerolinea.getNombre()+ ";"  + Aerolinea.getAlianza()+ ":"+ "\n" ;
	 
	}
	



	
	private static Aerolinea StringToAerolinea(String strAerolinea){
		String[] straux = strAerolinea.split(";");
		Aerolinea Aerolinea = new Aerolinea();
		Aerolinea.setNombre(straux[0]);
		Aerolinea.setAlianza(straux[1]);
		String[] straux2= straux[2].split("-");
		
	//	Aerolinea.setVuelo(VueloDAOImpleFile.);
		
		
		
		return Aerolinea;
		
	}




	@Override
	public Aerolinea getAerolinea(int clie_id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Aerolinea buscarAerolinea(String search) {
		Aerolinea aer = new Aerolinea();
		file = new File("C:\\Archivos\\Aerolineas"+search+".txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNextLine()){
			aer = StringToAerolinea(sc.nextLine());
		}
		
		return aer;
	
	}




	@Override
	public ArrayList<Aerolinea> getAerolineas() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean removeAerolinea(int clie_id) {
		// TODO Auto-generated method stub
		return false;
	}








	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public Aerolinea buscarAerolinea() {
		// TODO Auto-generated method stub
		return null;
	}
}