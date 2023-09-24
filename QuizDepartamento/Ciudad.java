package co.edu.upb.QuizDepartamento;

public class Ciudad {
	private int codigo;
	private String ciudad;
	private int habitantes;
	public Ciudad(int codigo, String ciudad, int habitantes) {
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.habitantes = habitantes;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", ciudad=" + ciudad + ", habitantes=" + habitantes + "]";
	}
	
}
