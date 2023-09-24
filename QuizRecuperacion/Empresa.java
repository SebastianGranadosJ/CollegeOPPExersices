package co.edu.upb.QuizRecuperacion;

public class Empresa {
	private Division[] divisiones = new Division[10];
	private int cntD = 0; //Contador del array divisiones
	private String razon;
	private String nit;
	
	public Empresa(String razon, String nit) {
		this.razon = razon;
		this.nit = nit;
	}
	
	public void addDivision(Division division) {
		divisiones[cntD] = division;
		cntD++;
	}
	public int getNumeroEmpleados() {
		int cntEmpleados = 0;
		for(int ii = 0; ii < cntD; ii++) {
			cntEmpleados += divisiones[ii].getNumeroEmpleados();
		}
		return cntEmpleados;
	}
	public Division buscarDivision(String division) {
		for(int ii = 0; ii < cntD; ii++) {
			if(divisiones[ii].getDivision() == division) {
				return divisiones[ii];
			}
		}
		
		return null;
	}
	public Empleado[][] buscarEmpleadosPorNombre(String nombre){
		Empleado[][] empleados = new Empleado[10][10];
		Empleado[] tmp = new Empleado[1];
		for( int ii = 0; ii < cntD; ii++) {
			if( divisiones[ii] == null) {
				empleados[ii] = tmp;
			}
			else {
				empleados[ii] = divisiones[ii].buscarEmpleadosPorNombre(nombre);
			}
		}
		return empleados;
	}
	
	public Empleado[][] buscarEmpleadosPorFuncion(String funcion){
		Empleado[][] empleados = new Empleado[10][10];
		Empleado[] tmp = new Empleado[1];
		for( int ii = 0; ii < cntD; ii++) {
			if( divisiones[ii] == null) {
				empleados[ii] = tmp;
			}
			else {
				empleados[ii] = divisiones[ii].buscarEmpleadosPorFuncion(funcion);
			}
		}
		return empleados;
	}
	public Empleado[][] buscarEmpleadosPorRevisionesPositivas(int numRevisiones){
		Empleado[][] empleados = new Empleado[10][10];
		Empleado[] tmp = new Empleado[1];
		for( int ii = 0; ii < cntD; ii++) {
			if( divisiones[ii] == null) {
				empleados[ii] = tmp;
			}
			else {
				empleados[ii] = divisiones[ii].buscarEmpleadosPorRevisionesPositivas(numRevisiones);
			}
		}
		return empleados;
	}
	
	public Empleado[][] buscarEmpleadosPorRevisionesNegativas(int numRevisiones){
		Empleado[][] empleados = new Empleado[10][10];
		Empleado[] tmp = new Empleado[1];
		for( int ii = 0; ii < cntD; ii++) {
			if( divisiones[ii] == null) {
				empleados[ii] = tmp;
			}
			else {
				empleados[ii] = divisiones[ii].buscarEmpleadosPorRevisionesNegativas(numRevisiones);
			}
		}
		return empleados;
	}

	
}
