package co.edu.upb.Persona;

public class Estudiante extends Persona {
	private String carrera;
	private int semestre;
	private double promedio;
	
	public Estudiante(String nombres, String carrera) {
		super(nombres); // Llama el constructor de la Clase persona.
		setCarrera(carrera); // reutiliza codigo (Buena practica)
	}
	
	//Setter and Getters
	public String getCarrera() {
		return carrera;
	}
	public int getSemestre() {
		return semestre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
