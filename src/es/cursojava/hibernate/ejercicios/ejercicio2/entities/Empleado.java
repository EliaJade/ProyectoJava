package es.cursojava.hibernate.ejercicios.ejercicio2.entities;

import org.hibernate.annotations.Check;
import org.hibernate.validator.constraints.UniqueElements;

import es.cursojava.hibernate.ejercicios.ejercicio2.entities.enums.Departamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Empleado {
	@Id
	@GeneratedValue
	private Long id;
	@NotBlank
	@Size(max = 15)
	@UniqueElements
	@Column(unique = true, length = 15, nullable = false)
	private String nif;
	@NotBlank
	@Size(max = 20)
	@Column(length = 20, nullable = false)
	private String nombre;
	@Size(max = 5)
	@Column(length = 5, nullable = false)
	private Departamento departamento;
	@Column(precision = 2, nullable = false)
	@Check(constraints = "salario >0")
	private double salario;

}
