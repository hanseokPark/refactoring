package refactoring.chap11;

public class ShapeLine extends Shape {
	private static final ShapeLine Instance = new ShapeLine();
	
	public static ShapeLine getInstance(int startx, int starty, int endx, int endy) {
		Instance.setShape(startx, starty, endx, endy);
		return Instance;
	}

	private ShapeLine() {
		
	}
	
	@Override
	public String getName() {
		return "LINE";
	}
	@Override
	public void draw() {
		drawLine();
	}
	
	private void drawLine() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());
	}
}
