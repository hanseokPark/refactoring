package refactoring.chap11;

public abstract class Shape {
	
	private final int startx;
	private final int starty;
	private final int endx;
	private final int endy;
	
	public static Shape createLine(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}
	public static Shape createRectangle(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}
	public static Shape createOval(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}

	
	protected Shape(int startx, int starty, int endx, int endy) {
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
	}
	
	
	public abstract String getName();
	public abstract void draw();
	
	@Override
	public String toString() {
		return String.format("[%-2s, (%3s,%3s)- (%3s, %3s)]", getName(), startx, starty, endx, endy);
	}
}
