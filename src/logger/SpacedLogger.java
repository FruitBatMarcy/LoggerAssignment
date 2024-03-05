/**
 * 
 */
package logger;

/**
 * @author marcy
 *
 */
public class SpacedLogger implements Logger {

	
	/**
	 * Method used to print message with spaces between its characters
	 * @param message this is the message that will have spaces put between its characters
	 */
	@Override
	public void log(String message) {				//uses StringBuilder class to append the message and then insert the spaces between the Characters
		StringBuilder sb = new StringBuilder();
		sb.append(message);
		for(int ix = sb.length()-1; ix>0; ix--) {	//length minus 1 to avoid adding unneeded space at the end of message
			sb.insert(ix, " ");
		}
		System.out.println(sb);
	}

	/**
	 * Method used to print "ERROR: " and then a message with spaces between its characters
	 * @param message The message that will go after the "ERROR: " and will have spaces between its characters
	 */
	@Override
	public void error(String message) {					//uses StringBuilder class for the same reason as the first
		StringBuilder sb = new StringBuilder();
		sb.append("ERROR: " + message);
		for(int ix = sb.length()-1; ix>7; ix--) {		//ends at 7 as to avoid putting spaces between the ERROR: part of the message
			sb.insert(ix, " ");
		}
		System.out.println(sb);
	}

}
