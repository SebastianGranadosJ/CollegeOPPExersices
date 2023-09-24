package co.edu.upb.LabAnimales;

public class MamiferoAcuatico extends Mamifero{
	private int minutosContieneRespiracion;
	
	public MamiferoAcuatico(String nombreEspecie) {
		super(nombreEspecie);
	}
	public  String getOnomatopeya() {
		return "GLu GLu Glu";
	}
	public int getMinutosContieneRespiracion() {
		return minutosContieneRespiracion;
	}
	public void setMinutosContieneRespiracion(int minutosContieneRespiracion) {
		this.minutosContieneRespiracion = minutosContieneRespiracion;
	}
	
}
