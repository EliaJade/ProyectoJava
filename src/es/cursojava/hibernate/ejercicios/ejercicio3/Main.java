package es.cursojava.hibernate.ejercicios.ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.AulaDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.CursoRequestDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.dtos.CursoResponseDTO;
import es.cursojava.hibernate.ejercicios.ejercicio3.service.AulaService;
import es.cursojava.hibernate.ejercicios.ejercicio3.service.CursoService;

public class Main {

	private CursoService serviceC= new CursoService();
	private AulaService serviceA = new AulaService();

	public static void main(String[] args) {
		Main main= new Main();

		List<CursoResponseDTO> cursos = main.crearCurso();
		List<AulaDTO> aulas = main.crearAula();
		main.serviceC.asignarAula(cursos.get(0).id(), aulas.get(0).id());
		main.serviceC.asignarAula(cursos.get(1).id(), aulas.get(2).id());

		main.serviceC.asignarAula(cursos.get(2).id(), aulas.get(1).id());
		
		CursoResponseDTO curso1 = main.serviceC.obtenerCursoPorId(cursos.get(0).id());
		CursoResponseDTO curso2 = main.serviceC.obtenerCursoPorId(cursos.get(1).id());
		CursoResponseDTO curso3 = main.serviceC.obtenerCursoPorId(cursos.get(2).id());
		System.out.println(curso1 +", \n "+ curso2+", \n"+ curso3 );
	}

	
	public List<CursoResponseDTO> crearCurso() {
		CursoRequestDTO curso1 = new CursoRequestDTO("123", "Curso de Floristeria", "Aprender a cuidar flores y montar ramos", 150, true,
				"Basico", "Decoracion", 200, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		CursoRequestDTO curso2 = new CursoRequestDTO("456", "Curso de Peluqueria", "Aprender a cuidar, cortar y decorar pelo", 150, true,
				"Avanzado", "Belleza", 150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		CursoRequestDTO curso3 = new CursoRequestDTO("789", "Curso de Maquillaje", "Aprender a cuidar, maquillar y decorar la cara", 150, true,
				"Avanzado", "Belleza", 150, LocalDate.of(2024, 8, 13), LocalDate.of(2024, 8, 13),
				LocalDateTime.of(2023, 11, 20, 14, 30));
		List<CursoRequestDTO> cursos = new CopyOnWriteArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		List<CursoResponseDTO> cursosGuardados= new CopyOnWriteArrayList<CursoResponseDTO>();

		System.out.println("Cursos dados de alta; " );
		for (CursoRequestDTO curso : cursos) {
			  CursoResponseDTO cursoGuardado = serviceC.altaCurso(curso); // capturamos el DTO con ID
		      cursosGuardados.add(cursoGuardado);
		      System.out.println(cursoGuardado);
		}
		
		return cursosGuardados;
		
	}
	public List<AulaDTO> crearAula() {
		
		AulaDTO aula1 = new AulaDTO(null, "1", 20, "Planta 2");
		AulaDTO aula2 = new AulaDTO(null, "2", 30, "Planta 1");
		AulaDTO aula3 = new AulaDTO(null, "3", 30, "Planta 3");
		List<AulaDTO> aulas = new CopyOnWriteArrayList<AulaDTO>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		List<AulaDTO> aulasGuardadas = new CopyOnWriteArrayList<AulaDTO>();
		System.out.println("Aulas dados de alta; " );
		for (AulaDTO aula : aulas) {
			AulaDTO aulaGuardado = serviceA.altaAula(aula);
			aulasGuardadas.add(aulaGuardado);
			
			System.out.println(aulaGuardado);
		}
		return aulasGuardadas;
	}

}

