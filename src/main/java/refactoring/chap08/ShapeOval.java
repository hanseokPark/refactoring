package refactoring.chap08;

public class ShapeOval extends Shape {	
	public static ShapeOval createShapeOval(int _startx, int _starty, int _endx, int _endy) {
		return new ShapeOval(_startx, _starty, _endx, _endy);
	}
	private ShapeOval(int _startx, int _starty, int _endx, int _endy) {
		super(_startx, _starty, _endx, _endy);
	}
	@Override
	public int get_typecode() {
		return Shape.TYPECODE_OVAL;
	}
	public String getName() {	
		return "OVAL";		
	}
	public void draw() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}
}
