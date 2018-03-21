package refactoring.chap04;

public class NullLable extends Label {

	public NullLable() {
		super("(none)");
	}
	@Override
	public boolean isNull() {
		return true;
	}
	@Override
	public void display() {
		
	}	
	
}
