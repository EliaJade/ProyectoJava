package es.cursojava.inicio.objetos.ejercicios.biblioteca;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Libro book1 = new Libro("Mistborn", "Brandon Sanderson", "111A");
		Libro book2 = new Libro("Six Of Crow", "Leigh Bardugo", "222B");
		Libro book3 = new Libro("A Court Of Thorns And Roses", "Sarah J. Mass", "333C");
		
		Libro[] libros = {book1, book2, book3};
		
		Biblioteca library1 = new Biblioteca("Book Store 1", libros, (new Direccion("John Street, ", "Madrid, ", "28011") ));
		
		Biblioteca[] bibliotecas = {library1};
		
		showAllLibraryInfo(bibliotecas, libros);
		
		showBookInfo(libros);
		
		
		
		}
	public static void showBookInfo(Libro[] libros) {
		for (Libro libro : libros) {
			libro.showInfo();
		}
	}
	
	public static void showAllLibraryInfo(Biblioteca[] bibliotecas, Libro[] libros) {
		for (Biblioteca biblioteca : bibliotecas) {
			for(Libro libro : libros) {
				String bookTitle = libro.getTitle();
			}
			biblioteca.showInfoBiblioteca();
		}
	}

}
