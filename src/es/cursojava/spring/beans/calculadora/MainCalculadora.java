package es.cursojava.spring.beans.calculadora;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.AppConfig;
import es.cursojava.spring.beans.calculadora.beans.Rol;
import es.cursojava.spring.beans.calculadora.beans.SeguridadAspect;
import es.cursojava.spring.beans.calculadora.beans.Usuario;
import es.cursojava.spring.beans.calculadora.services.CalculadoraService;
import es.cursojava.spring.beans.calculadora.services.CalculadoraService2;

public class MainCalculadora {
	public static void main(String[]args) {
		try(var ctx= new AnnotationConfigApplicationContext(AppConfig.class)){
//			CalculadoraService calc = ctx.getBean(CalculadoraService.class);
//		
//			double a = 10;
//			double b = 5;
//			
//			System.out.println(calc.calcular(a, b, "suma"));
//			System.out.println(calc.calcular(a, b, "resta"));
//			System.out.println(calc.calcular(a, b, "multiply"));
//			System.out.println(calc.calcular(a, b, "divide"));
//			
//			
			CalculadoraService2 calc2 = ctx.getBean(CalculadoraService2.class);
			SeguridadAspect seguridad = ctx.getBean(SeguridadAspect.class);
			
			Usuario admin = new Usuario("Alicia", Rol.ADMIN);
			Usuario user = new Usuario("Sammy", Rol.USER);
			
			
				double resultado = calc2.calcular(admin, "+", 1, 0);
				System.out.println("Resultado: " + resultado);
			
				try {
					double resultado2 = calc2.calcular(user, "+", 1, 0);
					System.out.println("Resultado 2: " + resultado);
				} catch (SecurityException e) {
					System.out.println(e.getLocalizedMessage());
				}
			
			ctx.close();
		}
	}

}
