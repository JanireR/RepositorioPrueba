package es.server.jdo;

public class Libro {
	private String titulo;
	String codigo, autor, genero;
	private float precio;
	int alquilado;
	int cantidadDisp;
	int cantidadLibros;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String titulo, String codigo, String autor, String genero, float precio, int alquilado,	int cantidadDisp,int cantidadLibros) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.autor = autor;
		this.genero = genero;
		this.precio = precio;
		this.alquilado = alquilado;
		this.cantidadDisp = cantidadDisp;
		this.cantidadLibros = cantidadLibros;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	
	public int getAlquilado() {
		return alquilado;
	}
	public void setAlquilado(int alquilado) {
		this.alquilado = alquilado;
	}
	
	
	public int getCantidadDisp() {
		return cantidadDisp;
	}
	public void setCantidadDisp(int cantidadDisp) {
		this.cantidadDisp = cantidadDisp;
	}
	
		
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	public String toString(){
		String toreturn = titulo+"\n";
		toreturn = toreturn + codigo+"\n";
		toreturn = toreturn + autor+"\n";
		toreturn = toreturn + genero+"\n";
		toreturn = toreturn + precio+"\n";
		toreturn = toreturn + alquilado+"\n";
		toreturn = toreturn + cantidadDisp+"\n";
		toreturn = toreturn + cantidadLibros+"\n";
		return toreturn;
	}

}
