package co.edu.upb.InterfazInventario;

public class Articulo {
	private String articulo;
	private int precio;
	
	public Articulo(String articulo, int precio) {
		this.articulo = articulo;
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getArticulo() {
		return articulo;
	}
	
}
