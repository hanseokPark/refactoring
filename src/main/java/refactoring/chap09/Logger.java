package refactoring.chap09;

public class Logger {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGIN = 1;
	
	private int _state;
	
	public Logger() {
		_state = STATE_STOPPED;
	}
	
	public void start() {
		switch(_state) {
		case STATE_STOPPED:
			System.out.println("** START LOGGING **");
			_state = STATE_LOGGIN;
			break;
		case STATE_LOGGIN:
			//아무것도 하지 않음
			break;
		default:
			System.out.println("Invalid state: " + _state);
		}
	}
	public void stop() {
		switch(_state) {
		case STATE_STOPPED:
			//아무것도 하지 않음
			break;
		case STATE_LOGGIN:
			System.out.println("** STOP LOGGING **");
			_state = STATE_STOPPED;
			break;
		default:
			System.out.println("Invalid state: " + _state);
		}
	}
	
	public void log(String info) {
		switch(_state) {
		case STATE_STOPPED:
			System.out.println("Ignoring: " + info);
			break;			
		case STATE_LOGGIN:
			System.out.println("Logging: " + info);
			break;
		default:
			System.out.println("Invalid state: " + _state);
		}
	}
	
	
	
}














