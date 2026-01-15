package es.cursojava.spring.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //comporta como un singelton
@Lazy // espera hasta que ya ha arrancado la aplicacion y luego actua
public class LazyBean {
  public LazyBean() {
    System.out.println("CREADO LazyBean: " + this);
  }
}
