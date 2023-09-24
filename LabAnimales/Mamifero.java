package co.edu.upb.LabAnimales;

public abstract class Mamifero extends Animal {
	private String habitat;
	
	public Mamifero(String nombreEspecie) {
		super(nombreEspecie);
	}
	public abstract String getOnomatopeya();
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
