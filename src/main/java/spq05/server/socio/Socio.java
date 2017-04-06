package spq05.server.socio;

public class Socio {
	
	private String nick;
	private String email;
	public Socio(String nick, String email) {
		super();
		this.nick = nick;
		this.email = email;
	}
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
