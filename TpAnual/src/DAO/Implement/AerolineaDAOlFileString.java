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
import Modelo.Direccion;
import Modelo.PasajeroFrecuente;
import Modelo.Telefono;
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
	



	@Override
	public boolean modifyAerolinea(List<Aerolinea> cli) {
		// TODO Auto-generated method stub
		
		String ruta=("C:\\Users\\moncerra\\Desktop\\usal 1er cuatri 2017\\prg avanzada\\guia5\\Guia07\\archivos\\fixture4.txt");
		//llama al writer y al buffer y escribe lo que se encuentra en cada posicion del array
		
	
		try{
		
			File f= new File(ruta);
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(fw);
		
			for (int i = 0; i < cli.size(); i++) {
				
			
			      bf.write(this.AerolineaToString(cli.get(i)));
			
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
		file = new File("C:\\Archivos\\Aerolineas.dat");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToAerolinea(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String AerolineaToString(Aerolinea Aerolinea){
		return Aerolinea.getNombre()+ ";" + Aerolinea.getAlianza()+ ";" + + "\n";
		
	}
	
	private String vuelotoString(List<Vuelo> vu) {
		
		for (int i = 0; i < vu.size() ; i++) {
			  
		}
		return String;
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
	
	private static Aerolinea StringToAerolinea(String strAerolinea){
		String[] straux = strAerolinea.split(";");
		Aerolinea Aerolinea = new Aerolinea();
		Aerolinea.setNombre(straux[0]);
		Aerolinea.setAlianza(straux[1]);
		Aerolinea.setDni(Integer.parseInt(straux[0]));
		Aerolinea.setNombre(straux[1]);
		Aerolinea.setApellido(straux[2]);
		Aerolinea.setCuil(straux[3]);
		Aerolinea.setEmail(straux[4]);
//		Aerolinea.setFechanac(Date.valueOf(straux[5]));
		Telefono tel = new Telefono((straux[6]),straux[7],straux[8]);
		Aerolinea.setTelefono(tel);
	//	PasajeroFrecuente pf = new PasajeroFrecuente(straux[9],straux[10]);
//		Aerolinea.setPsjfrec(pf);
	//	Direccion dir = new Direccion(straux[11],straux[12],straux[13],straux[14],straux[15],straux[16]);
//		Aerolinea.setDireccion(dir);
		
		
		return Aerolinea;
		
	}




	@Override
	public Aerolinea getAerolinea(int clie_id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Aerolinea buscarAerolinea(String search) {
		// TODO Auto-generated method stub
		return null;
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