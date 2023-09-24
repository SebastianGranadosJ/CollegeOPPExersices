package co.edu.upb.InterfazInventario;

public interface InterfazInventario {
	
	void agregar(Articulo articulo);
	
	void agregar(Articulo[] articulo);
	
	void eliminar(int indice);
	
	Articulo buscar(String nombreArticulo);
	
	int cantidadElementos ();
}
