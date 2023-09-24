package co.edu.upb.Quiz3Proyecto;

public class Vehiculo {
	private String marca;
	private int puertas;
	private int pasajeros;
	private boolean dobleTransmision;
	
	//------------Constructors-------------------------
	public Vehiculo(String marca) {
		setMarca(marca);
	}
	public Vehiculo(String marca, int puertas) {
		setMarca(marca);
		setPuertas(puertas);
	}
	public Vehiculo(String marca, int puertas, boolean dobleTransmision) {
		setMarca(marca);
		setPuertas(puertas);
		setDobleTransmision(dobleTransmision);
	}
	
	//-------------Getters y setters----------------
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public boolean isDobleTransmision() {
		return dobleTransmision;
	}
	public void setDobleTransmision(boolean dobleTransmision) {
		this.dobleTransmision = dobleTransmision;
	}

	public void imprimir() {
		System.out.println( "Vehiculo [marca=" + marca + ", puertas=" + puertas + ", pasajeros=" + pasajeros + ", dobleTransmision="
				+ dobleTransmision + "]");
	}
	
	
	
}
