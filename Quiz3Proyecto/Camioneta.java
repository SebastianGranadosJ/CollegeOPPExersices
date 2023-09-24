package co.edu.upb.Quiz3Proyecto;

public class Camioneta extends Vehiculo {
	
	public Camioneta(String marca, int puertas, int pasajeros, boolean dobleTransmision) {
		super(marca,puertas, dobleTransmision);
		super.setPasajeros(pasajeros);
	}
	
}
