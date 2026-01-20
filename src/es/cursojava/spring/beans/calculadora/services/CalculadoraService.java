package es.cursojava.spring.beans.calculadora.services;

import org.springframework.stereotype.Service;

import es.cursojava.spring.beans.calculadora.beans.Division;
import es.cursojava.spring.beans.calculadora.beans.Multiplicacion;
import es.cursojava.spring.beans.calculadora.beans.Resta;
import es.cursojava.spring.beans.calculadora.beans.Suma;

@Service
public class CalculadoraService {
	private Suma suma;
	private Resta resta;
	private Division division;
	private Multiplicacion multiplicacion;
	
	public double calcular(double a, double b, String operacion) {
		double resultado = 0;
		
		switch(operacion) {
		case "add":
			resultado =suma.calcular(a, b);
			break;
			
		case "subract":
			resultado =resta.calcular(a, b);
			break;
		
		case "multiply":
			resultado =multiplicacion.calcular(a, b);
			break;
			
		case "divide":
			resultado =division.calcular(a, b);
			break;
			
		default:	
			throw new IllegalArgumentException("Operacion no es valida");
			
		}
		
		
		
		return b;
		
	}
}
