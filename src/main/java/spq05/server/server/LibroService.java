package spq05.server.server;

import java.awt.print.Book;

public class LibroService {

	private static LibroService instance = new LibroService();
	
	public static LibroService getInstance(){
		return instance;
	}
	
	
	public void anyadirLibro(String codigo, String titulo, String autor){
		
	}
	
	public void eliminarLibro(String codigo, String titulo, String autor){
		
	}
	
	public Book editarLibro(String codigo, String titulo, String autor){
		return null;
	}
}
