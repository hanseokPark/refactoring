package refactoring.chap08;

public class ShapeTriangle extends Shape {

	public ShapeTriangle(int _startx, int _starty, int _endx, int _endy) {
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
