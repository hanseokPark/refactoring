package refactoring.chap05;

public class Banner {
	private final String _content;
	
	public Banner(String content) {
		_content = content;
	}
	//template method
	public void print(int times) {
		printBorder();		
		printContent(times);		
		printBorder();	
	}

	private void printContent(int times) {
		//내용 출력
		for(int i=0; i < times; i++) {
			System.out.println("|" + _content + "|");
		}
	}

	private void printBorder() {
		//테투리 출력
		System.out.print("+");
		for(int i=0; i < _content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
