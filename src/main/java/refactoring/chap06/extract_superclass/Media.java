package refactoring.chap06.extract_superclass;

public abstract class Media {
	protected String data;
	
	public Media(String data2) {
		this.data = data2;
	}
	
	public abstract void play();
	public abstract void loop();
	public abstract void stop();
}
