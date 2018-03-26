package refactoring.chap09;

public class StateStopped extends State {
	/*public int getTypeCode() {
		return Logger.STATE_STOPPED;
	}*/
	private static final StateStopped instance = new StateStopped();
	
	public static StateStopped getInstance() {
		return instance;
	}
	private StateStopped() {
	}
	@Override
	public void start(Logger logger) {
		System.out.println("** START LOGGING **");
		logger.set_state(StateLogging.getInstance());
	}
	@Override
	public void stop(Logger logger) {
		//아무것도 하지 않음
	}
	public void log(String info) {
		System.out.println("Logging: " + info);
	}
	
}
