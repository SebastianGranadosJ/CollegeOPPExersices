package co.edu.upb.QuizDepartamento;

public class Principal {

	public static void main(String[] args) {
		Departamento Santander = new Departamento(68,"Santander" );
		Santander.addCiudad(new Ciudad(68001, "Bucaramanga", 581130));
		Santander.addCiudad(new Ciudad(68276, "Floridablanca", 267591));
		Santander.addCiudad(new Ciudad(68307, "Girón", 206005));
		Santander.addCiudad(new Ciudad(68547, "Piedecuesta", 163362));
		Santander.addCiudad(new Ciudad(68406, "Lebrija", 42895));
		
		Santander.printCiudades();
		System.out.println(Santander.getCiudad(68001).getCiudad());
		System.out.println(Santander.getCiudad("Lebrija").getCiudad());
		System.out.println(Santander.getHabitantes());
	}

}
