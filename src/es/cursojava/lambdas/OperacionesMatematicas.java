package es.cursojava.lambdas;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		//no lambda
		Suma suma = new Suma();
		int resultado = suma.operar(5, 3);
		System.out.println(resultado);


		//Operaciones lambda
		
		OperacionGetafe sumaLambda = (a,b) -> a+b;
		int resultado2 = sumaLambda.operar(5, 3);
		System.out.println(resultado2);
		
		OperacionGetafe restaLambda =(a,b) -> a-b;

		ejecutarOp(6, 2, restaLambda); //does the same thing
		int resultado3 = restaLambda.operar(4, 2); //does the same thing
	}
	
	public static int ejecutarOp(int a, int b, OperacionGetafe operacion) {
		return operacion.operar(a, b);
	}

}
