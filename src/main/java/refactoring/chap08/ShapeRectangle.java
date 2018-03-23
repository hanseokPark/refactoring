package refactoring.chap08;

public class ShapeRectangle extends Shape {

	public ShapeRectangle(int _startx, int _starty, int _endx, int _endy) {
		super(_startx, _starty, _endx, _endy);
	}
	@Override
	public int get_typecode() {
		return Shape.TYPECODE_RECTANGLE;
	}
	
	public String getName() {		
		return "RECTANGLE";		
	}
	
	public void draw() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}
}
