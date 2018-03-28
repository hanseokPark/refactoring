package refactoring.chap11;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int typecode;
	private final int startx;
	private final int starty;
	private final int endx;
	private final int endy;
	
	public static Shape create(int typecode, int startx, int starty, int endx, int endy) {
		return new Shape(typecode, startx, starty, endx, endy);
	}

	
	private Shape(int typecode, int startx, int starty, int endx, int endy) {
		this.typecode = typecode;
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
	}

	public int getTypecode() {		return typecode;	}
	
	public String getName() {
		switch(typecode) {
		case TYPECODE_LINE:
			return "LINE";
		case TYPECODE_RECTANGLE:
			return "LINE";
		case TYPECODE_OVAL:
			return "LINE";
		default:
			return null;
		}
	}
	public void draw() {
		switch (typecode) {
		case TYPECODE_LINE:
				drawLine();
				break;
		case TYPECODE_RECTANGLE:
				drawRectangle();
				break;
		case TYPECODE_OVAL:
				drawOval();
				break;
		default:
			;
		}
		
	}
	
	@Override
	public String toString() {
		return String.format("[%-2s, (%3s,%3s)- (%3s, %3s)]", getName(), startx, starty, endx, endy);
	}

	private void drawLine() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());
	}
	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}
	private void drawOval() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}
}
