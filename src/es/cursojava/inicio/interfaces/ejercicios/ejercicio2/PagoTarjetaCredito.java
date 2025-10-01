package es.cursojava.inicio.interfaces.ejercicios.ejercicio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PagoTarjetaCredito implements Pago{
	private final static Logger Log = LoggerFactory.getLogger(PagoTarjetaCredito.class);
	

	@Override
	public void procesarPago(double monto) {
		double cantidadEnCuenta = (int) Math.random()*100;
		System.out.println(monto);
		System.out.println(cantidadEnCuenta);
		if(monto>=cantidadEnCuenta) {
			Log.info("Pago confirmado");
		}else {
			Log.error("Pago rechazado por insuficiente fondo");
		}
		
	}
	
	
}

