package refactoring.chap08;

public class ShapeLine extends Shape {

	public ShapeLine(int _startx, int _starty, int _endx, int _endy) {
		super(_startx, _starty, _endx, _endy);
	}
	@Override
	public int get_typecode() {
		// TODO Auto-generated method stub
		return Shape.TYPECODE_LINE;
	}
	
	public String getName() {
		return "LINE";
	}
	
	public void draw() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());		
	}
	
}
