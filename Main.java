package co.edu.upb.Lab2Arrays2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int choice;
		int arrayInt[] = {1, 2, 3, 4, 5};
		int arrayInt2[][] = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
		String arrayString[] = {"hola", "mundo", "esto", "es", "Java"};
		String arrayString2[] = {"hola", "mundo", "tengo", "mucha", "hambre"};
		System.out.println("1. Sumar elementos de un array unidimensional");
		System.out.println("2. Sumar elementos de un array bidimensional");
		System.out.println("3. Invertir elementos de una array entero");
		System.out.println("4. Comprobar si dos arrays string comparten elementos");
		System.out.println("Ingrese un numero segun que funcion desea ejecutar: ");
		try {
			choice = (char) System.in.read();
			}
			catch(IOException a) {
				System.out.println("Error");
				choice = '-';
			}
		switch(choice) {
		case '-': 
			break;
		case '1':
			System.out.println("Array a sumar: " + Lab2Arrays.arrayToString(arrayInt));
			System.out.println("Resultado: " + Lab2Arrays.sumArrayElements(arrayInt));
			Lab2Archive.saveIntInTextFile(Lab2Arrays.sumArrayElements(arrayInt), "sumArrayElementsUnidimensional.txt");
			break;
		case '2':
			System.out.println("Array a sumar: " + Lab2Arrays.arrayBiToString(arrayInt2));
			System.out.println("Resultado: " + Lab2Arrays.sumArrayElements(arrayInt2));
			Lab2Archive.saveIntInTextFile(Lab2Arrays.sumArrayElements(arrayInt2), "sumArrayElementsBidimensional.txt");
			break;
		case '3':
			System.out.println("Array a invertir: " + Lab2Arrays.arrayToString(arrayInt));
			System.out.println("Resultado: " + Lab2Arrays.arrayToString(Lab2Arrays.invertArrayElements(arrayInt)));
			Lab2Archive.saveArrayInTextFile(Lab2Arrays.invertArrayElements(arrayInt) , "invertArray.txt");
			break;
		case '4':
			System.out.println("Array 1: " + Lab2Arrays.arrayToString(arrayString));
			System.out.println("Array 2: " + Lab2Arrays.arrayToString(arrayString2));
			System.out.println("Resultado: " + Lab2Arrays.arrayToString(Lab2Arrays.compareArrays(arrayString ,arrayString2)));
			Lab2Archive.saveArrayInTextFile(Lab2Arrays.compareArrays(arrayString ,arrayString2), "invertArray.txt");
			break;
		default:
			break;
		}
	}
}


