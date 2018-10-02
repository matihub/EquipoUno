package DAO.Implement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.Interfaces.ProvinciaDAO;
import Modelo.Cliente;
import Modelo.Provincia;
import Modelo.Telefono;

public class ProvinciaDAOImplFileString implements ProvinciaDAO{
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	
	public List<Provincia> getAllProvincia() throws FileNotFoundException, IOException {
		List<Provincia> list = new ArrayList<Provincia>();
		file = new File("C:\\archivos\\provincia\\Provincias.txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		while(sc.hasNextLine()){
			list.add(StringToProvincia(sc.nextLine()));
		}
		
		
		
		
		
		return list;
	}
	
	
	private static Provincia StringToProvincia(String strProvincia){
	
			String[] straux = strProvincia.split(";");
			Provincia provincia = new Provincia();
			
			provincia.setId(Integer.parseInt(straux[0]));
			provincia.setProvincia(straux[1]);
			
			
			return provincia;
			
		}
}
