package co.edu.upb.QuizRecuperacion;

public class Revision {
	private String revision;
	private boolean positiva;
	
	public Revision(String revision, boolean positiva) {
		this.revision	= revision;
		this.positiva = positiva;	
		}
	
	
	public String getRevision() {
		return revision;
	}
	public boolean esRevisionPositiva() {
		return positiva;
	}
}
