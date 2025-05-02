package entidades;

import java.util.ArrayList;

public class BibliotecaMain {
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		Libro libro1 = new Libro(1, "Java", "123", "Software", "Fowler");
		biblioteca.registrarLibro(libro1);
		
		Libro libro2 = new Libro(2, "C++", "123", "Software", "Fowler");
		biblioteca.registrarLibro(libro2);
		
		ArrayList<Libro> libros = biblioteca.consultarLibros();
		
		for (int i=0; i<libros.size(); i++) {
			System.out.println(libros.get(i).toString());
		}
		
		
		
	}
}
