package co.edu.upb.Quiz3Proyecto;

public class CamionetaPlaton extends Camioneta {
	private double capacidadCargaKg;
	public CamionetaPlaton(String marca, int puertas, int pasajeros, boolean dobleTransmision, double capacidadCargaKg) {
		super(marca,puertas, pasajeros,dobleTransmision);
		setCapacidadCargaKg(capacidadCargaKg);
		
	}
	public double getCapacidadCargaKg() {
		return capacidadCargaKg;
	}
	private void setCapacidadCargaKg(double capacidadCargaKg) {
		this.capacidadCargaKg = capacidadCargaKg;
	}
	public void imprimir() {
		System.out.println( "Vehiculo [marca=" + super.getMarca() + ", puertas=" + super.getPuertas() + ", pasajeros=" + super.getPasajeros() + ", dobleTransmision="
				+ super.isDobleTransmision() + ", capacidadCargaKg= " + capacidadCargaKg + "]");
	}
	
}
