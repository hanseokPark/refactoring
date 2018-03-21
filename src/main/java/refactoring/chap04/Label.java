package refactoring.chap04;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}
	//factory method
	public static Label newNull() {
		return new NullLabel();
	}
	public boolean isNull() {
		return false;
	}
	public void display() {
		System.out.println("display: " + label);
	}	
	@Override
	public String toString() {
		return "\"" + label + "\"";
	}
	
	
}
