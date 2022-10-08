
public class SpacedLogger implements Logger {

	
	    public void Log(String str) {
	        StringBuilder log = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            log.append(str.charAt(i)).append(" ");
	        }
	        System.out.println(log);
	    }

	   
	    public void Error(String str) {
	        String miss = ("ERROR: " + str);
	        Log(miss);
	    }
	
}
