package refactoring.chap11;

public class ShapeRectangle extends Shape {
	private static final ShapeRectangle Instance = new ShapeRectangle();
	
	public static ShapeRectangle getInstance(int startx, int starty, int endx, int endy) {
		Instance.setShape(startx, starty, endx, endy);
		return Instance;
	}
	
	private ShapeRectangle() {}
	
	@Override
	public String getName() {
		return "RECTANGLE";
	}
	@Override
	public void draw() {
		drawRectangle();
	}
	
	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}
}
