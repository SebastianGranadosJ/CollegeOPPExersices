package co.edu.upb.LabAnimales;

public class MamiferoVolador extends Mamifero{
	private boolean alas;
	
	public MamiferoVolador(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public String getOnomatopeya(){
		return "Auuuu";
	}
	
	public boolean getAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	
	
}
