package refactoring.chap11;

public abstract class Shape {
	
	private int startx;
	private int starty;
	private int endx;
	private int endy;
	
	protected Shape() {}
	
	public void setShape(int startx, int starty, int endx, int endy) {
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
