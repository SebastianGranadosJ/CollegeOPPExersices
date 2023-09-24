package co.edu.upb.LabAnimales;

public class Reptil extends Animal{
	private TipoReptil tipoReptil;
	
	public Reptil(String nombreEspecie) {
		super(nombreEspecie);
	}
	public Reptil(String nombreEspecie, TipoReptil tipoReptil) {
		super(nombreEspecie);
		setTipoReptil(tipoReptil);
	}
	public String getOnomatopeya() {
		return "kSshhh kShhh";
	}
	public TipoReptil getTipoReptil() {
		return tipoReptil;
	}
	public void setTipoReptil(TipoReptil tipoReptil) {
		this.tipoReptil = tipoReptil;
	}
	
	
}
