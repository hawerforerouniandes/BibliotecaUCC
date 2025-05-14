package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class BibliotecaMain {
	
	public static void main(String[] args) {
		
		int opcionSalir = 2;
		do {
		
			Scanner sc = new Scanner(System.in); 
			
			Biblioteca biblioteca = new Biblioteca();
			System.out.println("Bienvenidos a la Biblioteca UCC");
			System.out.println("MENU");
			System.out.println("1. Registrar libro");
			System.out.println("2. Registrar estudiante");
			System.out.println("3. Registrar prestamo");
			System.out.println("4. Consultar prestamos");
			System.out.println("Seleccione la acción a realizar:");
			
			int opcion = sc.nextInt();
			
			
			switch(opcion) {
				case 1: 
					
					System.out.println("Ingrese el id:");
					int idLibro = sc.nextInt();
					
					System.out.println("Ingrese el titulo:");
					String titulo = sc.next();
					
					System.out.println("Ingrese isbn:");
					String isbn = sc.next();
					
					System.out.println("Ingrese categoria:");
					String categoria = sc.next();
					
					System.out.println("Ingrese autor:");
					String autor = sc.next();
					
					Libro libro = new Libro(idLibro, titulo, isbn, categoria, autor);
					biblioteca.registrarLibro(libro);
					
					System.out.println("Libro registrado con exito: "+libro.toString());
					
					break;
				case 2: 
		
					System.out.println("Ingrese el id:");
					int idEstudiante = sc.nextInt();
					
					System.out.println("Ingrese el nombre:");
					String nombre = sc.next();
					
					System.out.println("Ingrese el email:");
					String email = sc.next();
					
					System.out.println("Ingrese el programa:");
					String programa = sc.next();
					
					
					Estudiante estudiante = new Estudiante(idEstudiante, nombre, email, programa);
					biblioteca.registrarEstudiante(estudiante);
					
					System.out.println("Estudiante registrado con exito: "+estudiante.toString());
					break;
				case 3: 
					
					ArrayList<Libro> libros = biblioteca.consultarLibros();
					System.out.println("Selecione el libro:");
					for (int i=0; i<libros.size(); i++) {
						System.out.println(i + " :"+libros.get(i).getTitulo());
					}
				
					int opcionLibro = sc.nextInt();
					System.out.println("El libro a prestar es el : "+opcionLibro);
					
					
					ArrayList<Estudiante> estudiantes = biblioteca.consultarEstudiantes();
					System.out.println("Selecione el estudiante:");
					for (int i=0; i<estudiantes.size(); i++) {
						System.out.println(i + " :"+estudiantes.get(i).getNombre());
					}
				
					int opcionEstudiante = sc.nextInt();
					System.out.println("El estudiante seleccionado es : "+opcionEstudiante);
					
					
					Date fechaPrestamo = new Date();
					Date fechaEntrega = fechaPrestamo;
					Prestamo prestamo = new Prestamo(1, estudiantes.get(opcionEstudiante), libros.get(opcionLibro), fechaPrestamo, fechaEntrega, "activo");
					biblioteca.registrarPrestamo(prestamo);
				
					
					break;
				case 4: 
					break;
			}
			
			System.out.println("¿Desea salir? (1=SI, 2=NO)");
			opcionSalir = sc.nextInt();
		
	
			
		}while(opcionSalir  == 2);
		
		
		
		
		
		
		
		
	
	
		/*
		Estudiante estudiante1 = new Estudiante(1, "Hawer", "email@gmail.com", "Sistemas");
		biblioteca.registrarEstudiante(estudiante1);
		
		Estudiante estudiante2 = new Estudiante(2, "Carlos", "email@gmail.com", "Sistemas");
		biblioteca.registrarEstudiante(estudiante2);
		
		ArrayList<Estudiante> estudiantes = biblioteca.consultarEstudiantes();

		for (int i=0; i<estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i).toString());
		}
		
		Date fechaPrestamo = new Date();
		Date fechaEntrega = fechaPrestamo;
		Prestamo prestamo1 = new Prestamo(1, estudiante1, libro1, fechaPrestamo, fechaEntrega, "activo");
		biblioteca.registrarPrestamo(prestamo1);
		
		ArrayList<Prestamo> prestamos = biblioteca.consultarPrestamos();

		for (int i=0; i<prestamos.size(); i++) {
			System.out.println(prestamos.get(i).toString());
		}*/
		

		
		
	}
}
