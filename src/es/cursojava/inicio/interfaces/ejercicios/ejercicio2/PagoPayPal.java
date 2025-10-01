package es.cursojava.inicio.interfaces.ejercicios.ejercicio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagoPayPal implements Pago{
	private final static Logger Log = LoggerFactory.getLogger(PagoPayPal.class);


	@Override
	public void procesarPago(double monto) {
		double cantidadEnCuenta = (int) (Math.random()*100);
		System.out.println(monto);
		System.out.println(cantidadEnCuenta);
		if(monto<=cantidadEnCuenta) {

			cantidadEnCuenta= cantidadEnCuenta-monto;
			Log.info("Pago confirmado por PayPal. El total de su fondo es " + cantidadEnCuenta);
		}else {
			Log.error("Pago rechazado por insuficiente fondo en su PayPal. El coste del es " + monto + " y solo tiene " + cantidadEnCuenta);
		}
	
}

}
