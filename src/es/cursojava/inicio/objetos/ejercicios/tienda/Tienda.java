package es.cursojava.inicio.objetos.ejercicios.tienda;

public class Tienda {
	
	public static void main(String[] args) {
		
		Productos producto1 = new Productos("keychain", 2.5, 10);
		
		Productos producto2 = new Productos("hat", 8, 20);
		
		Productos producto3 = new Productos("fridge magnet", 3, 15);
		
		Productos[] todosProductos = {producto1, producto2, producto3};
		
		
		for(Productos producto:todosProductos) {
			producto.muestraInfo();
		}
		
		System.out.println(UtilidadesTienda.calcularValorInventario(todosProductos));
		producto1.muestraInfo();
	}
}
