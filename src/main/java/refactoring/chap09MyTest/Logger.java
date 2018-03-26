package refactoring.chap09MyTest;

public class Logger {
	private static final int STATE_STOPPED = 0;
	private static final int STATE_LOGGIN = 1;
	
	private int state;

	public Logger() {
		state = STATE_STOPPED;
	}
	
	public void start() {
		switch(state){
		case STATE_STOPPED:
			System.out.println("** START LOGGING **");
			state = STATE_LOGGIN;
			break;
		case STATE_LOGGIN:
			break;
		default:
			System.out.println("Invalid state: " + state);
		}
	}
	public void stop() {
		
	}
	public void log() {
		
	}
}
