package refactoring;

import refactoring.chap01.Robot;
import refactoring.chap02.FindInt;

public class Main {

	public static void main(String[] args) {
//		testChap01();
		testChap02();
	}

	private static void testChap02() {
		int[] data = {1,9,0,2,8,5,6,3,4,7};
		
		if(FindInt.find(data, 5)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found...");
		}
		
	}

	private static void testChap01() {
		Robot robot = new Robot("Andrew");
		robot.order(Robot.COMMAND_WALK);//walk
		robot.order(Robot.COMMAND_STOP);//stop
		robot.order(Robot.COMMAND_JUMP);//jump
	}

}
