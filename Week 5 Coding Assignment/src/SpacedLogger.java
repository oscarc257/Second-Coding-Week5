//3. b. Class for implemented Logger 

public class SpacedLogger implements Logger {

	//6. string builder used to determine and for loop to determine length of characters and have space between each letter.
	    public void Log(String str) {
	        StringBuilder log = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            log.append(str.charAt(i)).append(" ");
	        }
	        System.out.println(log);
	    }

	   //7. ======================= 
	    public void Error(String str) {
	        String miss = ("ERROR: " + str);
	        Log(miss);
	    }
	
}
