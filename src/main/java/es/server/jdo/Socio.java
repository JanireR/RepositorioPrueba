package es.server.jdo;

public class Socio {
	
	private String nick;
	String password;
	String DNI;
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Socio(String nick, String password, String dNI) {
		super();
		this.nick = nick;
		this.password = password;
		DNI = dNI;
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
	
	public String toString(){
		String toreturn = nick+"\n";
		toreturn = toreturn + password+"\n";
		toreturn = toreturn + DNI+"\n";
		
		return toreturn;
	}

}
