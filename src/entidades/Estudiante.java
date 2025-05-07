package entidades;

public class Estudiante {
	
	private int id;
	private String nombre;
	private String email;
	private String programa;
	
	public Estudiante(int id, String nombre, String email, String programa) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.programa = programa;
	}


	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", programa=" + programa + "]";
	}


	public String getNombre() {
		return nombre;
	}
	
	
}
