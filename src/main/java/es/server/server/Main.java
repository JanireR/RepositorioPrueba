package es.server.server;

public class Main {
	public static void main(String[] args) {
		if (args.length != 8) { // amount of arguments from build file could
								// change later!
			System.exit(0);
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		String nick = "//" + args[0] + ":" + args[1] + "/" + args[2];
		

		try {
			

			System.out.println("- Main '" + nick + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("$ Main exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
