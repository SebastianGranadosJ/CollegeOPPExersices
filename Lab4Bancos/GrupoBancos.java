package co.edu.upb.Lab4Bancos;

public class GrupoBancos {
	private String grupo;
	private Banco[] bancos = new Banco[20];
	private int cnt = 0;
	
	public GrupoBancos(String grupo) {
		this.grupo = grupo;
	}
	public void addBanco(Banco banco) {
		bancos[cnt] = banco;
		cnt++;
	}
	public Usuario getUsaurio(int identificacion) {
		for(int ii = 0; ii < cnt; ii++) {
			if(bancos[ii].getUsuario(identificacion) != null){
				return bancos[ii].getUsuario(identificacion);
			}
			
		}
		return null;
	}
	public Usuario getUsaurio(String codBanco, int identificacion) {
		if(getBanco(codBanco) != null) {
			return getBanco(codBanco).getUsuario(identificacion);
		}
		return null;
	}
	private Banco getBanco(String codBanco) {
		for(int ii = 0; ii < cnt; ii++) {
			if(bancos[ii].getCodBanco() == codBanco) {
				return bancos[ii];
			}
		}
		return null;
	}
	
}
