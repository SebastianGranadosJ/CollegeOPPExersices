package co.edu.upb.EjercicioPais;

public class Ciudad extends Base {
	public Ciudad(String nombre, String codigo, int numeroHabitantes) {
		super(nombre, codigo);
		setNumeroHabitantes(numeroHabitantes);
	}
}
