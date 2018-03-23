package refactoring.chap06.extract_superclass;

public class Player{
	boolean isMusic;
	/*private String musicData = "좋니";
	private String videoData = "효리네 민박";*/
	private Music music = new Music("좋니");
	private Video video = new Video("효리네 민박");

	public void setCurrentMedia(boolean isMusic) {
		this.isMusic = isMusic ;
	}	
	
	public void play() {
		if(isMusic) {
			music.play();
		}else {
			video.play();
		}
	}

	public void loop() {
		if(isMusic) {
			music.loop();
		}else {
			video.loop();
		}
	}

	public void stop() {
		if(isMusic) {
			music.stop();
		}else {
			video.stop();
		}
	}
}
