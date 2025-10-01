package es.cursojava.inicio.interfaces.ejercicios.ejercicio2;

public class Main {
	
	public static void main(String[]args) {
		Pago pagoPayPal = new PagoPayPal();
		Pago pagoTarjetaCredito = new PagoTarjetaCredito();
		Pago pagoCriptomoneda = new PagoCriptomoneda();	
		Main main = new Main();

		double
		monto = (int) Math.random()*100;
		
		ProcesadorPagos.realizarPago(pagoPayPal, monto);
		ProcesadorPagos.realizarPago(pagoTarjetaCredito, monto);
		ProcesadorPagos.realizarPago(pagoCriptomoneda, monto);
		
	}
	
	

}
