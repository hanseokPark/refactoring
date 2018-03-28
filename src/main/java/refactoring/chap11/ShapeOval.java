package refactoring.chap11;

public class ShapeOval extends Shape {
	private static final ShapeOval Instance = new ShapeOval();

	public static ShapeOval getInstance(int startx, int starty, int endx, int endy) {
		Instance.setShape(startx, starty, endx, endy);
		return Instance;
	}

	private ShapeOval() {
	}
	
	@Override
	public String getName() {
		return "OVAL";
	}
	@Override
	public void draw() {
		drawOval();
	}
	
	private void drawOval() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}
}
