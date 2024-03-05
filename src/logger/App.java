package logger;

public class App {
	public static void main(String[] args) {
		AsteriskLogger aLog = new AsteriskLogger();
		SpacedLogger sLog = new SpacedLogger();
		
		aLog.log("Bepoo");
		aLog.error("He approaches");
		sLog.log("Space");
		sLog.error("Maximum Capacity");
	}
}
