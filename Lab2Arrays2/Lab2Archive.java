package co.edu.upb.Lab2Arrays2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Lab2Archive {
	public static boolean saveStringInTextFile(String textToWrite, String fileName) {
		try {
			OutputStream file = new FileOutputStream(fileName, true);
			file.write(textToWrite.getBytes());
			file.close();
			return true;
			}
			catch(IOException e) {
				System.out.println("El archivo no fue encontrado");
				return false;
			}
	}
	public static boolean saveIntInTextFile(int textToWrite, String fileName) {
		try {
			String stringToWrite = Integer.toString(textToWrite);
			OutputStream file = new FileOutputStream(fileName, true);
			file.write(stringToWrite.getBytes());
			file.close();
			return true;
			}
			catch(IOException e) {
				System.out.println("El archivo no fue encontrado");
				return false;
			}
	}
	public static boolean saveArrayInTextFile(int arrayToSave[], String fileName ) {
		try {
			OutputStream file = new FileOutputStream(fileName, true);
			String arrayToString = "";
			for( int ii = 0; ii < arrayToSave.length; ii++) {
				if(ii< arrayToSave.length - 1) {
					arrayToString = Integer.toString(arrayToSave[ii]) + " ";
				}
				else {
					arrayToString = Integer.toString(arrayToSave[ii])+ "\n";
				}
				file.write(arrayToString.getBytes());
			}
			
			file.close();
			return true;
			}
			catch(IOException e) {
				return false;
			}
	}
	public static boolean saveArrayInTextFile(String arrayToSave[], String fileName ) {
		try {
			OutputStream file = new FileOutputStream(fileName, true);
			String arrayToString = "";
			for( int ii = 0; ii < arrayToSave.length; ii++) {
				if(ii< arrayToSave.length - 1) {
					arrayToString = arrayToSave[ii] + " ";
				}
				else {
					arrayToString = arrayToSave[ii]+ "\n";
				}
				file.write(arrayToString.getBytes());
			}
			
			file.close();
			return true;
			}
			catch(IOException e) {
				return false;
			}
	}
}
