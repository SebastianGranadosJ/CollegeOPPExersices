package co.edu.upb.Persona;

public class Empleado extends Persona {
	private String cargo;
	private int mesesExperiencia;
	private double sueldo;
	
	public Empleado(String nombres, String cargo) {
		super(nombres);
		setCargo(cargo);
	}

	//-----Setters and getters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMesesExperiencia() {
		return mesesExperiencia;
	}

	public void setMesesExperiencia(int mesesExperiencia) {
		this.mesesExperiencia = mesesExperiencia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
