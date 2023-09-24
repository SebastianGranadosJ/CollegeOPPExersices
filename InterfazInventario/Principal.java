package co.edu.upb.InterfazInventario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo[] articulos = {
				new Articulo("Jabon", 5000),
				new Articulo("Crema", 6000),
				new Articulo("Lavadora", 1000),
				new Articulo("Cuchillo", 30000),
				new Articulo("Matera", 40000),
		};
		Inventario inventario = new Inventario(articulos);
		for(int ii = 0; ii < inventario.cantidadElementos(); ii++) {
			System.out.println(inventario.retornar()[ii].getArticulo());
		}
		System.out.println("-------------------------");
		inventario.eliminar(2);
		for(int ii = 0; ii < inventario.retornar().length; ii++) {
			if(inventario.retornar()[ii] != null) {
				System.out.println(inventario.retornar()[ii].getArticulo());
			}
			else {
				System.out.println("null");
			}
		}
		
	}

}
