package refactoring.chap11;

public class ShapeOval extends Shape {

	public ShapeOval(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
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
