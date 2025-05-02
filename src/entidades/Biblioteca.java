package entidades;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> libros;
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Estudiante> estudiantes;
	
	
	public Biblioteca() {
		libros = new ArrayList<Libro>();
		estudiantes = new ArrayList<Estudiante>();
		prestamos = new ArrayList<Prestamo>();
	}

	public void registrarLibro(Libro libro){
		this.libros.add(libro);
	}
	
	public ArrayList<Libro> consultarLibros(){
		return this.libros;
	}
	
	public void registrarEstudiante(Estudiante estudiante){
		this.estudiantes.add(estudiante);
	}
	
	public void registrarPrestamo(Prestamo prestamo){
		this.prestamos.add(prestamo);
	}

	
}
