package refactoring.chap09;

public class StateLogging extends State {
//	public int getTypeCode() {
//		return Logger.STATE_LOGGIN;
//	}
	private static final StateLogging instance = new StateLogging();
	
	public static StateLogging getInstance() {
		return instance;
	}
	private StateLogging() {
	}
	@Override
	public void start(Logger logger) {
		//아무것도 하지 않음
	}
	@Override
	public void stop(Logger logger) {
		System.out.println("** STOP LOGGING **");
		logger.set_state(StateStopped.getInstance());
	}
	public void log(String info) {
		System.out.println("Logging: " + info);
	}
	
}
