package co.edu.upb.Quiz3Proyecto;

public class Deportivo extends Vehiculo {
	private int velocidadMaxima;
	
	public Deportivo(String marca, int velocidadMaxima) {
		super(marca,2,false);
		super.setPasajeros(2);
		setVelocidadMaxima(velocidadMaxima);
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	private void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void imprimir() {
		System.out.println( "Vehiculo [marca=" + super.getMarca() + ", puertas=" + super.getPuertas() + ", pasajeros=" + super.getPasajeros() + ", dobleTransmision="
				+ super.isDobleTransmision() + ", velocidadMaxima= " + velocidadMaxima + "]");
	}
}
