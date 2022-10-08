








public class AsteriskLogger implements Logger {

	
	public void Log(String str) {
		System.out.println("***" + str + "***");
	}

	
	public void Error(String str) {
		String mistake = "Error: " + str;
		System.out.println("***********");
		Log(mistake);
		System.out.println("***********");
	}

	


	
	
}
