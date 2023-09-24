package co.edu.upb.EjercicioPersona;

public class Estudiante extends Persona{
	private String carrera;
	private int semestre;
	private double promedio;
	public Estudiante(String nombres, String carrera) {
		super(nombres);
		setCarrera(carrera);
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
