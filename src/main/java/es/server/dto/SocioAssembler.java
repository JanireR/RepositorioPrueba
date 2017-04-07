package es.server.dto;

import es.server.jdo.Socio;

public class SocioAssembler {
	private static SocioAssembler instance = new SocioAssembler();
	
	public SocioDTO assemble(Socio iSocio){
		return null;		
	}
	public static SocioAssembler getInstance(){
		return instance;
	}

}
