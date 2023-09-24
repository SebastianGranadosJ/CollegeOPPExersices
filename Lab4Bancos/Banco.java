package co.edu.upb.Lab4Bancos;

public class Banco {
	private String codBanco;
	private Usuario[] usuarios = new Usuario[20];
	private int cnt = 0; //Contador del array usuarios
	
	public Banco(String codBanco) {
		this.codBanco = codBanco;
	}
	
	public String getCodBanco() {
		return codBanco;
	}
	
	public void addUsuario(Usuario usuario) {
		usuarios[cnt] = usuario;
		cnt++;
	}
	public Usuario getUsuario(int identificacion) {
		for(int ii = 0; ii < cnt; ii++) {
			if(usuarios[ii].getIdentificacion() == identificacion) {
				return usuarios[ii];
			}
		}
		return null;
	}
	
}
