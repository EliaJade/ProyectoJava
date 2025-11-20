package es.cursojava.hibernate.ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(nullable = false, length = 20, unique = true)
	private String codigo;
	
	@NotBlank(message = "No puede estar vacio el nombre")
	@NotNull
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@Column(nullable = true, length = 500)
	private String description;

	@Min(value = 1, message = "Las horas totales debe ser mayor que 0")
	@NotNull
	@Column(nullable = false )
	private int horasTotales;
	
	@NotNull
	@Column(nullable = false)
	private boolean activo =true;
	
	@Column(nullable = true, length = 20)
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
	
	@Column(nullable = true, length = 50)
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@Min(value = 0, message = "El precio no puede ser menor que 0")
	@Column(nullable = true)
	private int precio;
	
	@Column(nullable = true)
	private LocalDate fechaInicio;
	
//	@Min(value = fechaInicio )
	@Column(nullable = true)
	private LocalDate fechaFin;
	
	@NotNull
	@Column(nullable = false)
	private	LocalDateTime fechaCreacion = LocalDateTime.now() ;
	

	public Curso() {
		
	}

	//no tiene id
	public Curso(String codigo, String nombre, String description, int horasTotales, boolean activo, Nivel nivel,
			Categoria categoria, int precio, LocalDate fechaInicio, LocalDate fechaFin, LocalDateTime fechaCreacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.description = description;
		this.horasTotales = horasTotales;
		this.activo = activo;
		this.nivel = nivel;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaCreacion = fechaCreacion;
	}
	
	//no optional 
	public Curso(String codigo, String nombre, int horasTotales, boolean activo, LocalDateTime fechaCreacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTotales = horasTotales;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}
}
