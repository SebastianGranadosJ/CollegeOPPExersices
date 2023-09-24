package co.edu.upb.EjercicioPais;

public class Base {
	private String nombre;
	private String codigo;
	private int numeroHabitantes;
	
	public Base(String nombre, String codigo) {
		setNombre(nombre);
		setCodigo(codigo);
	}
	
	//---------------------
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
}
