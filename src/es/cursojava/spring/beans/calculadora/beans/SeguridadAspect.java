package es.cursojava.spring.beans.calculadora.beans;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SeguridadAspect {
	
	
	
	@Pointcut("@annotation(SoloAdmin)")
	public void soloAdminMethods() {
		System.out.println("ejecutando soloAdminMethods");
	}
	
	@Before("soloAdminMethods()")
	public void verificarAcceso(JoinPoint jp) {
		System.out.println("ejecutando");
		Object[] objects = jp.getArgs();
		
		Usuario usuario = (Usuario) objects[0];
		if(usuario == null) {
			throw new SecurityException("Usuario no autenticado");
		}
		if(usuario.getRol()!=Rol.ADMIN) {
			throw new SecurityException("Acceso denegado para usuario: " + usuario.getNombre());
		}
	}

	
	
}
