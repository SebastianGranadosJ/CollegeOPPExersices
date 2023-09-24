package co.edu.upb.EjercicioPais;

public class Estado extends Base {
	private Ciudad[] ciudadArray = new Ciudad[100];
	private int contadorCiudad = 0;
	
	public Estado(String nombre, String codigo) {
		super(nombre, codigo);
	}
	public int getNumeroHabitantes() {
		int numeroHabitantes = 0;
		for(int ii = 0; ii < contadorCiudad; ii++) {
			numeroHabitantes += ciudadArray[ii].getNumeroHabitantes();
		}
		return numeroHabitantes;
	}

	public Ciudad buscarCiudad(String nombreCiudad) {
		for( int ii = 0; ii < contadorCiudad; ii++) {
			if( ciudadArray[ii].getNombre() == nombreCiudad) {
				return ciudadArray[ii];
			}
		}
		return null;
	}
	
	
	//-----------------------------------------
	public void setContadorCiudad(int contador) {
		this.contadorCiudad = contador;
	}
	public void setCiudad(Ciudad ciudad) {
		ciudadArray[contadorCiudad] = ciudad;
		contadorCiudad++;
	}
	public Ciudad[] getCiudadArray() {
		return ciudadArray;
	}
	public int getContadorCiudad() {
		return contadorCiudad;
	}
}
