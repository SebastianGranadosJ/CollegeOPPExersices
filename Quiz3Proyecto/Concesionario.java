package co.edu.upb.Quiz3Proyecto;

public class Concesionario {
	private Vehiculo vehiculos[] = new Vehiculo[12];
	private int cnt; //contador
	public Concesionario() {
		
	}
	public void addVehiculo(Vehiculo vehiculo) {
		vehiculos[cnt] = vehiculo;
		cnt++;
	}
	public void imprimirVehiculos() {
		for(int ii = 0; ii < cnt; ii++) {
			 vehiculos[ii].imprimir();
		}
	}
}
