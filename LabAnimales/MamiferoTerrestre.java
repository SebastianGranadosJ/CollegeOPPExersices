package co.edu.upb.LabAnimales;

public class MamiferoTerrestre extends Mamifero{
	
	public enum TipoExtremidad {
		PLANTIGRADO,
		DIGITIGRADO,
		UNGULADO
	}
	private TipoExtremidad tipoExtremidad;
	public MamiferoTerrestre(String nombreEspecie) {
		super(nombreEspecie);
	}
	public MamiferoTerrestre(String nombreEspecie, TipoExtremidad tipoExtremidad) {
		super(nombreEspecie);
		setTipoExtremidad(tipoExtremidad);
	}
	
	public String getOnomatopeya() {
		return "Oink";
	}
	
	public TipoExtremidad getTipoExtremidad() {
		return tipoExtremidad;
	}
	public void setTipoExtremidad(TipoExtremidad tipoExtremidad) {
		this.tipoExtremidad = tipoExtremidad;
	}
	
	
}

