package es.server.jdo;

public class Alquiler {

	private int id_alquiler;
	private Socio socio;
	private Libro libro;
	private String comentario;
	public Alquiler(int id_alquiler, Socio socio, Libro libro, String comentario) {
		super();
		this.id_alquiler = id_alquiler;
		this.socio = socio;
		this.libro = libro;
		this.comentario = comentario;
	}
	public Alquiler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_alquiler() {
		return id_alquiler;
	}
	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
