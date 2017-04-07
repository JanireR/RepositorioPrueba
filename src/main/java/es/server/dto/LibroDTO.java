package es.server.dto;

import java.io.Serializable;

public class LibroDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String titulo;
	String codigo, autor, genero;
	float precio;
	public LibroDTO(String titulo, String codigo, String autor, String genero, float precio) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.autor = autor;
		this.genero = genero;
		this.precio = precio;
	}
	public LibroDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
