package co.edu.upb.EjercicioPais;

public class Principal {

	public static void main(String[] args) {
		/*
		ESTADO/CIUDAD 		CÓD 	HABITANTES

		Antioquia  			05
			Medellín  		05001 	2549537
			Bello 			05088 	491159
			Itagüí 			05360 	279894
			Envigado 		05266 	243568
			Apartadó 		05045 	200931

		Santander 			68
			Bucaramanga 	68001 	528352
			Floridablanca 	68276 	266102
			Barrancabermeja 68081 	191704
			Girón 			68307 	185248
			Piedecuesta 	68547 	152665
		
		Cundinamarca 		25
			Soacha 			25754 	522442
			Fusagasugá 		25290 	137164
			Facatativá 		25269 	134522
			Chía 			25175 	129652
			Zipaquirá 		25899 	124376
		*/
		Pais colombia = new Pais("Colombia", "57");
		Estado estado;
		
		//Antioquia
		
		estado = new Estado("Antioquia", "05");
		estado.setCiudad(new Ciudad("Medellín", "05001", 2549537)); //¿Porque puedo usar el new sin crear un nombre de variablo?
		estado.setCiudad(new Ciudad ("Bello", "05088", 491159));
		estado.setCiudad(new Ciudad("Itagüí", "05360", 279894));
		estado.setCiudad(new Ciudad("Envigado", "05266", 243568));
		estado.setCiudad(new Ciudad("Apartadó", "05045", 200931));
		colombia.setEstado(estado);
		
		//Santander
		estado = new Estado("Santander", "68");
		estado.setCiudad(new Ciudad("Bucaramanga", "68001", 528352)); //¿Porque puedo usar el new sin crear un nombre de variablo?
		estado.setCiudad(new Ciudad ("Floridablanca", "68276", 266102));
		estado.setCiudad(new Ciudad("Barrancabermeja", "68081", 191704));
		estado.setCiudad(new Ciudad("Girón", "68307", 185248));
		estado.setCiudad(new Ciudad("Piedecuesta", "68547", 152665));
		colombia.setEstado(estado);
		
		//Cundinamarca
		estado = new Estado("Cundinamarca", "25");
		estado.setCiudad(new Ciudad("Soacha", "25754", 522442)); //¿Porque puedo usar el new sin crear un nombre de variablo?
		estado.setCiudad(new Ciudad ("Fusagasugá", "25290", 137164));
		estado.setCiudad(new Ciudad("Facatativá", "25269", 134522));
		estado.setCiudad(new Ciudad("Chía", "25175", 129652));
		estado.setCiudad(new Ciudad("Zipaquirá", "25899", 124376));
		colombia.setEstado(estado);
		
		System.out.println(
				"Habitantes en el país " +
				colombia.getNombre()+ ": " +
				colombia.getNumeroHabitantes()
				
		);
		
		Estado resEstado = colombia.buscarEstado("Santander");
		if (resEstado != null) {
			Ciudad[] ciudadesEstado = resEstado.getCiudadArray();
			System.out.println(
					"Departamento encontrada: " + resEstado.getNombre() +
					", código: " + resEstado.getCodigo() +
					", Ciudades del Departamento"
			);
			for (int ii = 0; ii < resEstado.getContadorCiudad(); ii++) {
				System.out.println("- " + ciudadesEstado[ii].getNombre());
			}
			
		}
		System.out.println();
		
		Ciudad resCiudad = colombia.buscarCiudad("Envigado");
		if (resCiudad != null) {
			System.out.println(
					"Ciudad encontrada: " + resCiudad.getNombre() +
					", codigo: " + resCiudad.getCodigo()
		);	
		}
	}
	
}
