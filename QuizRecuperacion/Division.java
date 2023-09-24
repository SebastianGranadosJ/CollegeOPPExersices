package co.edu.upb.QuizRecuperacion;

public class Division {
	private String division; 
	private Empleado[] empleados = new Empleado[10];
	private int cntE = 0;
	
	public Division(String division) {
		this.division = division;
	}
	public String getDivision() {
		return division;
	}
	public void addEmpleado(Empleado empleado) {
		empleados[cntE] = empleado;
		cntE++;
	}
	public Empleado[] buscarEmpleadosPorNombre(String nombre) {
		Empleado[] empleadosTmp = new Empleado[10]; //array temporal de empleados
		int cntT = 0; //contador de empleadosTmp
		 for(int ii = 0; ii < cntE; ii++) {
			 if(empleados[ii].getNombre() == nombre) {
				 empleadosTmp[cntT] = empleados[ii];
				 cntT++;
			 }
		 }
		 if(cntT == 0) {
				return null;
			}
		
		return empleadosTmp;
	}
	
	public Empleado[] buscarEmpleadosPorFuncion(String funcion) {
		Empleado[] empleadosTmp = new Empleado[10]; //array temporal de empleados
		int cntT = 0; //contador de empleadosTmp
		 for(int ii = 0; ii < cntE; ii++) {
			 if(empleados[ii].tieneFuncion(funcion)) {
				 empleadosTmp[cntT] = empleados[ii];
				 cntT++;
			 }
		 }
		 if(cntT == 0) {
				return null;
			}
		
		return empleadosTmp;
	}
	public Empleado[] buscarEmpleadosPorRevisionesPositivas(int numRevisiones) {
		Empleado[] empleadosTmp = new Empleado[10]; //array temporal de empleados
		int cntT = 0; //contador de empleadosTmp
		 for(int ii = 0; ii < cntE; ii++) {
			 if(empleados[ii].getRevisionesPositivas() == numRevisiones) {
				 empleadosTmp[cntT] = empleados[ii];
				 cntT++;
			 }
		 }
		 if(cntT == 0) {
				return null;
			}
		
		return empleadosTmp;
	}
	public Empleado[] buscarEmpleadosPorRevisionesNegativas(int numRevisiones) {
		Empleado[] empleadosTmp = new Empleado[10]; //array temporal de empleados
		int cntT = 0; //contador de empleadosTmp
		 for(int ii = 0; ii < cntE; ii++) {
			 if(empleados[ii].getRevisionesNegativas() == numRevisiones) {
				 empleadosTmp[cntT] = empleados[ii];
				 cntT++;
			 }
		 }
		if(cntT == 0) {
			return null;
		}
		return empleadosTmp;
	}
	
	public int getNumeroEmpleados() {
		return cntE;
	}
	
}
