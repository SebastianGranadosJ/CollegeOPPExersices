package co.edu.upb.EjercicioPais;

public class Pais extends Base {
	private Estado[] estadoArray = new Estado[100];
	private int contadorEstado = 0;
	
	public int getNumeroHabitantes() {
		int numeroHabitantes = 0;
		for(int ii = 0; ii < contadorEstado; ii++) {
			numeroHabitantes += estadoArray[ii].getNumeroHabitantes();
		}
		return numeroHabitantes;
	}
	public Pais(String nombre, String codigo) {
		super(nombre, codigo);
	}
	public Estado buscarEstado(String nombreEstado) {
		for( int ii = 0; ii < contadorEstado; ii++) {
			if( estadoArray[ii].getNombre() == nombreEstado) {
				return estadoArray[ii];
			}
		}
		return null;
	}
	public Ciudad buscarCiudad(String nombreCiudad) {
		for (int ii = 0; ii < contadorEstado; ii++) {
			if(estadoArray[ii].buscarCiudad(nombreCiudad) != null) {
				return estadoArray[ii].buscarCiudad(nombreCiudad);
			}
		}
		return null;
	}
	
	
	//---------------------
	public void setContadorEstado(int contador) {
		this.contadorEstado = contador;
	}
	public void setEstado(Estado estado) {
		estadoArray[contadorEstado] = estado;
		contadorEstado ++;
	}
	public Estado[] getEstadoArray() {
		return estadoArray;
	}
	public int getContadorEstado() {
		return contadorEstado;
	}
}
