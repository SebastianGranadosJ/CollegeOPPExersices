package co.edu.upb.InterfazInventario;

public class Inventario implements InterfazInventario{
	private Articulo[] articulos;
	private int cntA = 0;
	
	
	
	public Inventario(Articulo[] articulos) {
		this.articulos = articulos;
		this.cntA = calCntArticulos(articulos);
		if(this.cntA == 0) {
			articulos = new Articulo[10];
		}
	}
	private int calCntArticulos(Articulo[] articulos) {
		int cntA = 0;
		for(int ii = 0; ii < articulos.length; ii++) {
			if(articulos[ii] != null) {
				cntA++;
			}
			else {
				return cntA;
			}
		}
		return cntA;
	}
	
	public Articulo[] retornar() {
		return articulos;
	}
	public void eliminar() {
		for(int ii = 0; ii < cntA; ii++) {
			articulos[ii] = null;
		}
	}
	public void agregar(Articulo articulo) {
		expandirArray(10);
		articulos[cntA] = articulo;
		cntA ++;
		
	}
	
	public void agregar(Articulo[] articulos) {
		int cntArg = calCntArticulos(articulos); // contador del argumento articulos
		for( int ii = 0; ii < cntArg; ii++) {
			expandirArray(10);
			this.articulos[cntA] = articulos[ii];
			cntA ++;
		}
	}// 0 1 2 null 4 5 null
	public void eliminar(int indice) {
		articulos[indice] = null;
		for (int ii = 0; ii < cntA - indice; ii++) {
			if(ii == cntA - indice - 1) {
				articulos[indice + ii] = null;
			}
			else {
				articulos[indice + ii] = articulos[indice + ii + 1];
			}
		}
		cntA--;
	}
	
	private boolean expandirArray(int cntExp) { // Cantidad a expandir en el array
		
		if (cntA >= articulos.length) {
			Articulo[] articulosTmp = new Articulo[articulos.length];
			articulosTmp = articulos;
			articulos = new Articulo[articulosTmp.length + cntExp];
			for(int ii = 0; ii < cntA; ii++) {
				articulos[ii] = articulosTmp[ii];
			}
		}
		return true;
	}
	public Articulo buscar(String nombreArticulo) {
		
		for(int ii = 0; ii < cntA; ii++) {
			if(articulos[ii].getArticulo() == nombreArticulo) {
				return articulos[ii];
			}
		}
		return null;
	}

	public int cantidadElementos() {
		return cntA;
	}

}
