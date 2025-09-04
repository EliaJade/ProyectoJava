package es.cursojava.inicio.objetos.ejercicios.tienda;

public class UtilidadesTienda {

	public static double calcularValorInventario (Productos[] productos) {
		double totalInventario = 0;
		for(Productos producto:productos) {
//			totalInventario+=totalInventario;
			totalInventario+=producto.calculaValorTotal();
		}
		return totalInventario;
	}
	
	
}
