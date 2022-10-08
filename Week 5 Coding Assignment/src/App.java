
public class App {

	public static void main(String[] args) {
		
		  Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

	        asteriskLogger.Log("Help!");
	        asteriskLogger.Error("Me!");

	        System.out.println();

	        spacedLogger.Log("Thank");
	        spacedLogger.Error("You!");
		
	

	}

}
