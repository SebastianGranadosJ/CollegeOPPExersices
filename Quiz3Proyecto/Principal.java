package co.edu.upb.Quiz3Proyecto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concesionario concesionarioUPB = new Concesionario();
		concesionarioUPB.addVehiculo(new Deportivo("CharalaCars", 120));
		concesionarioUPB.addVehiculo(new Deportivo("Logan", 112));
		concesionarioUPB.addVehiculo(new Sedan("Chevrolet"));
		concesionarioUPB.addVehiculo(new Sedan("CharalaCars"));
		concesionarioUPB.addVehiculo(new CamionetaSuv("Suzuki", 4, 8, true));
		concesionarioUPB.addVehiculo(new CamionetaSuv("Lexus", 2, 6, false));
		concesionarioUPB.addVehiculo(new Camioneta("CharalaCamionetas", 4, 4, true));
		concesionarioUPB.addVehiculo(new Camioneta("Honda", 4, 8, true));
		concesionarioUPB.addVehiculo(new CamionetaPlaton("BMW", 4, 8, false, 200));
		concesionarioUPB.addVehiculo(new CamionetaPlaton("CharalaMachines", 4, 4, true, 600));
		concesionarioUPB.imprimirVehiculos();
	}

}
