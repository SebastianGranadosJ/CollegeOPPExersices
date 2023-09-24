package co.edu.upb.EjercicioPais;
import java.io.*;

public class Archivo {
	public static boolean guardarArrayEnArchivoTxt(String sArchivoDestino, int[] aItems) {
		String stringArray = "[";
		for (int ii = 0; ii < aItems.length; ii++) {
			if ( ii < aItems.length - 1) {
				stringArray += aItems[ii] +", ";
			}
			else {
				stringArray += aItems[ii] +"]";
			}
		}
	
	return guardarCadenaEnArchivoTxt(sArchivoDestino, stringArray);
	
	}//guardarArrayEnArchivoTxt int[]
	
	public static boolean guardarArrayEnArchivoTxt(String sArchivoDestino, String[] sItems) {
		String stringArray = "[";
		for (int ii = 0; ii < sItems.length; ii++) {
			if ( ii < sItems.length - 1) {
				stringArray += sItems[ii] +", ";
			}
			else {
				stringArray += sItems[ii] +"]";
			}
		}
	
	return guardarCadenaEnArchivoTxt(sArchivoDestino, stringArray);
	
	}//guardarArrayEnArchivoTxt int[]
	
	public static boolean guardarCadenaEnArchivoTxt(String sArchivoDestino, String aCadena) {
		try {
			aCadena += "\n";
			OutputStream file = new FileOutputStream(sArchivoDestino, true);
			file.write(aCadena.getBytes());
			file.close();
				return true;
			}
			catch(IOException e) {
				return false;
			}
	}
}
