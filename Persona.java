package co.edu.upb.EjercicioPersona;

public class Persona {
	private String nombres;
	private int edad;
	private String nacionalidad;
	private double estatura;
	private double peso;
	
	public Persona(String nombres) {
		setNombres(nombres);
	}
	public double getPesoIdeal() {
		return peso/estatura;
	}
	
	//--------------Getters and Setter

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
