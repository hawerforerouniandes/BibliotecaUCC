package entidades;

public class Libro {
	
	private int id;
	private String titulo;
	private String isbn;
	private String categoria;
	private String autor;
	public Libro(int id, String titulo, String isbn, String categoria, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.categoria = categoria;
		this.autor = autor;
	}
	
	
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", categoria=" + categoria + ", autor="
				+ autor + "]";
	}


	public String getTitulo() {
		return titulo;
	}
	
	
}
