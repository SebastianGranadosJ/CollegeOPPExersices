package co.edu.upb.QuizDepartamento;

public class Departamento {
	private Ciudad[] ciudades = new Ciudad[10];
	private int codigo;
	private String departamento;
	int cnt = 0; //contador del numero de ciudades
	public Departamento(int codigo, String departamento) {
		this.codigo = codigo;
		this.departamento = departamento;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDepartamento(){
		return departamento;
	}
	public void addCiudad(Ciudad ciudad) {
		ciudades[cnt] = ciudad;
		cnt++;
	}
	public Ciudad getCiudad(int codigo) {
		for(int ii = 0; ii < cnt; ii++) {
			if(ciudades[ii].getCodigo() == codigo) {
				return ciudades[ii];
			}
		}
		return null;
	}
	public Ciudad getCiudad(String ciudad) {
		for(int ii = 0; ii < cnt; ii++) {
			if(ciudades[ii].getCiudad() == ciudad) {
				return ciudades[ii];
			}
		}
		return null;
	}
	public int getHabitantes() {
		int habitantes = 0;
		for (int ii = 0; ii < cnt; ii++) {
			habitantes += ciudades[ii].getHabitantes();
		}
		return habitantes;
	}
	
	public void printCiudades() {
		System.out.println(departamento+ ":");
		for(int ii = 0; ii < cnt; ii++) {
			System.out.println(ciudades[ii].toString());
		}
	}
}
