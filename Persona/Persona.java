package co.edu.upb.Persona;

public class Persona {
	private String nombres;
	private int edad;
	private String nacionalidad;
	private double estatura;
	private double peso;
	
	public Persona(String nombres){
		setNombres(nombres);
	}
	public double getPesoIdeal() {
		return peso/estatura;
	}
	
	//-------------------------- Setters and Getters-------------------------------
	public String getNombres() {
		return nombres;
	}
	public int getEdad() {
		return edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public double getEstatura() {
		return estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
