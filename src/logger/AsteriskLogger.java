package logger;
/**
 * 
 * @author marcy
 *
 */
public class AsteriskLogger implements Logger {

	/**
	 * Method used to print a message with asterisks surrounding it Example: ***message***
	 * @param message This will be the message with asterisks added to it
	 */
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");	//print the entire message inside one print statement
	}
	/**
	 * Method used to print an error message surrounded by asterisks
	 * Example:
	 * ******************** 
	 * ***Error: message***
	 * ********************
	 * @param message This will be the message surrounded by asterisks
	 */
	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();		//Create the message inside the asterisk box
		sb.append("***Error:"+error+"***");				
		String aBox = "";
		for(int ix = 0; ix<sb.length(); ix++) {		//Create a line of asterisk the same length as the message
			aBox+="*";
		}
		System.out.println(aBox);					//print all to console
		System.out.println(sb);
		System.out.println(aBox);
	}

}
