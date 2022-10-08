






//3. a. class implemented for Logger interface.

public class AsteriskLogger implements Logger {

	//4. printed out asterisks before and after ***Log.***
	public void Log(String str) {
		System.out.println("***" + str + "***");
	}

	// 5. printed out the asterisks above and below Error.
	public void Error(String str) {
		String mistake = "Error: " + str;
		System.out.println("***********");
		Log(mistake);
		System.out.println("***********");
	}

	


	
	
}
