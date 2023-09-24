package co.edu.upb.Lab2Arrays2;

public class Lab2Arrays {
	public static String arrayToString(int array[]) {
		String stringReturn = "[";
		for (int ii = 0; ii < array.length; ii++) {
			if ( ii < array.length - 1) {
				stringReturn += array[ii] +", ";
			}
			else {
				stringReturn += array[ii] +"]";
			}
		}
		return stringReturn;
	}
	public static String arrayToString(String array[]) {
		String stringReturn = "[";
		for (int ii = 0; ii < array.length; ii++) {
			if ( ii < array.length - 1) {
				stringReturn += array[ii] +", ";
			}
			else {
				stringReturn += array[ii] +"]";
			}
		}
		return stringReturn;
	}
	public static String arrayBiToString(int array[][]) {
		String stringReturn = "[";
		for (int ii = 0; ii < array.length; ii++) {
			stringReturn +="[";
				for(int kk = 0; kk < array[ii].length;kk++ ) {
					if ( kk < array[ii].length - 1) {
						stringReturn += array[ii][kk] +", ";
					}
					else {
						if( ii < array.length - 1 ) {
							stringReturn += array[ii][kk] +"], ";
						}
						else {
							stringReturn += array[ii][kk] +"]";
						}
					}
			}
				
		}
		stringReturn +="]";
		return stringReturn;
	}
	public static int sumArrayElements(int array[]) {
		int sum = 0;
		for(int ii = 0; ii < array.length; ii++) {
			sum += array[ii];
		}
		return sum;
	}
	public static int sumArrayElements(int array[][]) {
		int sum = 0;
		for(int ii = 0; ii < array.length; ii++) {
			for(int kk = 0; kk<array[ii].length; kk++) {
				sum += array[ii][kk];
			}
		}
		return sum;
	}
	public static int[] invertArrayElements(int array[]) {
		int invertedArray[] = new int[array.length];
		for(int ii = 0; ii < array.length; ii++) {
			invertedArray[ii] = array[array.length - 1 - ii];
		}
		return invertedArray;
	}
	
	public static String[] compareArrays(String array1[], String array2[]) {
		int cnt = 0;
		int lenght = 0;
		if(array1.length < array2.length) {
			lenght = array1.length;
		}
		else {
			lenght = array2.length;
		}
		String sameElements[] = new String[lenght];
		for(int ii = 0; ii < array1.length;ii++ ) {
			for (int kk = 0; kk < array2.length; kk++) {
				if( array1[ii] == array2[kk]) {
					sameElements[cnt] = array1[ii];
					cnt++;
				}
			}
		}
		String arrayReturn[] = new String[cnt];
		for(int ii = 0; ii < cnt; ii++) {
			arrayReturn[ii] = sameElements[ii];
		}
		return arrayReturn; 
	}
	public static String[] searchStringInArray(String array[], String stringToSearch) {
		int cnt = 0;
		for (int ii = 0; ii < array.length; ii++) {
			if(stringToSearch == array[ii]) {
				cnt ++;
			}
		}
		String arrayReturn[] = new String[cnt];
		for (int ii = 0; ii < cnt; ii++) {
			arrayReturn[ii] = stringToSearch;
		}
		return arrayReturn;
	}
}
