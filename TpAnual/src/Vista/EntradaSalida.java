package Vista;

import java.util.*;

public class EntradaSalida {
	
	public static void pritln(String frase){
		System.out.println(frase);
	}
	
	public static int leerInt(String msjInicio, String msjError){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()){
			EntradaSalida.pritln(msjError);
			scan.next();
		}
		return scan.nextInt();
	}
	
	public static boolean leerboolean(String msjInicio, String msjError){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextBoolean()){
			EntradaSalida.pritln(msjError);
			scan.next();
		}
		return scan.nextBoolean();
	}
	
	public static float leerFloat(String msjInicio, String msjError){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextFloat()){
			EntradaSalida.pritln(msjError);
			scan.next();
		}
		return scan.nextFloat();
	}
	
	public static double leerDouble(String msjInicio, String msjError){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner (System.in);
		while(!scan.hasNextDouble()){
			EntradaSalida.pritln(msjError);
			scan.next();
		}
		return scan.nextDouble();
	}
	
	public static String leerLinea(String msjInicio){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
	public static String leerFrase(String msjInicio){
		EntradaSalida.pritln(msjInicio);
		Scanner scan = new Scanner (System.in);
		return scan.next();
	}

}
