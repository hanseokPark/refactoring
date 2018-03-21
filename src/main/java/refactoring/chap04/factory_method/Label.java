package refactoring.chap04.factory_method;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}
	//factory method
	public static Label newNull() {
		return NullLabel.getInstance();
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
	
	private static class NullLabel extends Label {
		private static final NullLabel instance = new NullLabel();
		
		
		public static NullLabel getInstance() {
			return instance;
		}
		
		private NullLabel() {
			super("(none)");
		}//25부터 34까지 싱글턴 패턴
		
		@Override
		public boolean isNull() {
			return true;
		}
		@Override
		public void display() {
			
		}	
		
	}

	
}
