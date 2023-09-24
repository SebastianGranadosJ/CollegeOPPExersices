package co.edu.upb.LabAnimales;

public class Ave extends Animal{
	private TipoAve tipoAve;
	private TipoPico tipoPico;
	
	public Ave(String nombreEspecie) {
		super(nombreEspecie);
	}
	public String getOnomatopeya() {
		return "Pio Pio";
	}
	public Ave(String nombreEspecie, TipoAve tipoAve) {
		super(nombreEspecie);
		setTipoAve(tipoAve);
	}

	public TipoAve getTipoAve() {
		return tipoAve;
	}

	public void setTipoAve(TipoAve tipoAve) {
		this.tipoAve = tipoAve;
	}

	public TipoPico getTipoPico() {
		return tipoPico;
	}

	public void setTipoPico(TipoPico tipoPico) {
		this.tipoPico = tipoPico;
	}
	
}
