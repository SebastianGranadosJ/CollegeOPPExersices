package co.edu.upb.Lab4Bancos;

public class Usuario {
	private int identificacion;
	private int balance;
	
	public Usuario(int identificacion, int balance) {
		setBalance(balance);
		setIdentificacion(identificacion);
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	private void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
}
