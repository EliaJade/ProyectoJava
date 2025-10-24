package es.cursojava.inicio.maps.ejercicios.ejercicio3;

public class Libro {
	
	private String titulo;
	private String isbn;
	private int anios;
	
	public Libro(String titulo, String isbn, int anios) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.anios = anios;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	
	

}
