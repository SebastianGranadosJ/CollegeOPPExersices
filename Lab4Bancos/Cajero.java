package co.edu.upb.Lab4Bancos;

public class Cajero {
	private String codCajero;
	private int efectivoDisponible;
	private boolean txEnProgreso;
	private Usuario usuarioTx;
	
	public Cajero(String codCajero, int efectivoDisponible) {
		this.codCajero = codCajero;
		this.efectivoDisponible = efectivoDisponible;
		this.txEnProgreso = false;
	}
	
	public boolean iniciarSesion(GrupoBancos grupoBancos, int identificacionUsuario) {
		if(txEnProgreso == false) {
			Usuario usuario = grupoBancos.getUsaurio(identificacionUsuario);
			
			if(usuario != null) {
				this.txEnProgreso = true;
				this.usuarioTx = usuario;
				return true;
			}
		}
		return false;
	}
	
	public boolean iniciarSesion(GrupoBancos grupoBancos, String codBanco, int identificacionUsuario) {
		if(txEnProgreso == false) {
			Usuario usuario = grupoBancos.getUsaurio(codBanco, identificacionUsuario);
			if(usuario != null) {
				this.txEnProgreso = true;
				this.usuarioTx = usuario;
				return true;
			}
		}
		return false;
	}
	
	public boolean retirarDinero(int valorARetirar) {
		if(txEnProgreso) {
			if(valorARetirar > usuarioTx.getBalance()) {
				terminarSesion();
				return false;
			}
			if(efectivoDisponible < valorARetirar) {
				terminarSesion();
				return false;
			}
				usuarioTx.setBalance(usuarioTx.getBalance() - valorARetirar );
				this.efectivoDisponible = efectivoDisponible - valorARetirar;
				terminarSesion();
				return true;
			
		}
		return false;
	}
	private void terminarSesion() {
		this.txEnProgreso = false;
		this.usuarioTx = null;
	}
}
