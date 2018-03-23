package refactoring.chap08;

public class ShapeTriangle extends Shape {
	public static ShapeTriangle createShapeTriangle(int _startx, int _starty, int _endx, int _endy) {
		return new ShapeTriangle(_startx, _starty, _endx, _endy);
	}
	private ShapeTriangle(int _startx, int _starty, int _endx, int _endy) {
		super(_startx, _starty, _endx, _endy);
	}
	@Override
	public int get_typecode() {
		return Shape.TYPECODE_TRIANGLE;
	}
	public String getName() {	
		return "TRIANGLE";		
	}
	public void draw() {
		System.out.printf("%15s : %s%n", "drawTriangle", this.toString());
	}

}
