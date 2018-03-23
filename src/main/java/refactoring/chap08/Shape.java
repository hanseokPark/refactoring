package refactoring.chap08;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int _typecode;
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	public Shape(int _typecode, int _startx, int _starty, int _endx, int _endy) {
		this._typecode = _typecode;
		this._startx = _startx;
		this._starty = _starty;
		this._endx = _endx;
		this._endy = _endy;
	}

	public int get_typecode() {		return _typecode;	}
	
	public String getName() {
		switch (_typecode) {
		case TYPECODE_LINE:
				return "LINE";
		case TYPECODE_RECTANGLE:
			return "RECTANGLE";
		case TYPECODE_OVAL:
			return "OVAL";
		default:
			return null;			
		}
	}

	@Override
	public String toString() {
		return String.format("[%-10s, (%3s,%3s)- (%3s, %3s)]", getName(), _startx, _starty, _endx, _endy);
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

	public void draw() {
		switch (_typecode) {
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
	
	
	
	
}
