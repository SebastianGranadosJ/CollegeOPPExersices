package co.edu.upb.QuizRecuperacion;

public class Empleado {
	private String[] funciones = new String[10];
	private int cntF = 0; // contador de funciones
	private Revision[] revisiones = new Revision[10];
	private int cntR = 0; //contador de revisiones
	private String nombre;
	
	public Empleado(String nombre, String[] funciones) {
		this.nombre = nombre;
		this.funciones = funciones;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean tieneFuncion(String funcion) {
		for(int ii = 0; ii < cntF; ii++) {
			if(funciones[ii] == funcion) {
				return true;
			}
		}
		return false;
	}
	public void addRevison(Revision revision) {
		revisiones[cntR] = revision;
		cntR++;
	}
	public int getRevisionesPositivas() {
		int revisionesPositivas = 0;
		for(int ii = 0; ii < cntR; ii++) {
			if (revisiones[ii].esRevisionPositiva()) {
				revisionesPositivas++;
			}
		}
		return revisionesPositivas;
	}
	public int getRevisionesNegativas(){
		int revisionesNegativas = 0;
		for(int ii = 0; ii < cntR; ii++) {
			if (revisiones[ii].esRevisionPositiva() == false) {
				revisionesNegativas++;
			}
		}
		return revisionesNegativas;
	}
	
}
