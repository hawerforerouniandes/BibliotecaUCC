package entidades;

import java.util.Date;

public class Prestamo {
	private int id;
	private Estudiante estudiante;
	private Libro libro;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	public Prestamo(int id, Estudiante estudiante, Libro libro, Date fechaInicio, Date fechaFin, String estado) {
		super();
		this.id = id;
		this.estudiante = estudiante;
		this.libro = libro;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}
	
	
	public String toString() {
		return "Prestamo [id=" + id + ", estudiante=" + estudiante + ", libro=" + libro + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", estado=" + estado + "]";
	}	
	
}
