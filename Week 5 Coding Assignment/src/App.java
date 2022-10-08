//10. instantiated an instance between both classes part of Logger interface.

public class App {
	

	public static void main(String[] args) {
		
		  Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

//11. 	Implemented  strings to test code.  		
	        asteriskLogger.Log("Help!");
	        asteriskLogger.Error("Me!");

	        System.out.println();

	        spacedLogger.Log("Thank");
	        spacedLogger.Error("You!");
		
	

	}

}
