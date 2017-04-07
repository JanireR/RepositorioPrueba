package es.server.dto;

import java.io.Serializable;

public class SocioDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	

	String nick;
	String password;
	String DNI;
	public SocioDTO(String nick, String password, String dNI) {
		super();
		this.nick = nick;
		this.password = password;
		DNI = dNI;
	}
	public SocioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
