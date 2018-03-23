package refactoring.chap06.extract_superclass;

public class Video extends Media {
	/*private String videoData = "효리네 민박";*/

	public Video(String data) {
		super(data);
	}

	@Override
	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		System.out.printf("%s %s%n", data, "play");	
	}

	@Override
	public void stop() {
		System.out.printf("%s %s%n", data, "play");	
	}

}
