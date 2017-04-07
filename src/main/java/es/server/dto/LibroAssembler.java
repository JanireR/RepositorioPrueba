package es.server.dto;

import es.server.jdo.Socio;

public class LibroAssembler {

private static LibroAssembler instance = new LibroAssembler();
	
	public LibroDTO assemble(Socio iSocio){
		return null;		
	}
	public static LibroAssembler getInstance(){
		return instance;
	}
}
