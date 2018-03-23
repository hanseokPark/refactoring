package refactoring.chap08;

public abstract class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	public static final int TYPECODE_TRIANGLE = 3;
	
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	public Shape(int _startx, int _starty, int _endx, int _endy) {
		this._startx = _startx;
		this._starty = _starty;
		this._endx = _endx;
		this._endy = _endy;
	}
	public static Shape createShape(int _typecode, int _startx, int _starty, int _endx, int _endy) {
		switch (_typecode) {
		case TYPECODE_LINE:
				return new ShapeLine(_startx,_starty,_endx,_endy);
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(_startx,_starty,_endx,_endy);
		case TYPECODE_OVAL:
			return new ShapeOval(_startx,_starty,_endx,_endy);
		case TYPECODE_TRIANGLE:
			return new ShapeTriangle(_startx,_starty,_endx,_endy);
		default:
			throw new IllegalArgumentException("typecode =" + _typecode);
		}
	}

	public abstract int get_typecode();
	
	public abstract String getName();
	
	public abstract void draw();	

	@Override
	public String toString() {
		return String.format("[%-10s, (%3s,%3s) - (%3s, %3s)]", getName(), _startx, _starty, _endx, _endy);
	}

}
