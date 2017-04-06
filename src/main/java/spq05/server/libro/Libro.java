package spq05.server.libro;

public class Libro {
	private String titulo;
	String codigo;
	String autor;
	String genero;
	private float precio;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String titulo, String codigo, String autor, String genero, float precio) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.autor = autor;
		this.genero = genero;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString(){
		String toreturn = titulo +"\n";
		toreturn = toreturn + codigo +"\n";
		toreturn = toreturn + autor +"\n";
		toreturn = toreturn + genero +"\n";
		toreturn = toreturn + precio +"\n";
		return toreturn;
	}

}
