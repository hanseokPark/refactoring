package refactoring;

import java.awt.EventQueue;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import refactoring.chap01.Robot;
import refactoring.chap02.FindInt;
import refactoring.chap02.simple.SimpleDatabase;
import refactoring.chap03.SortSample;
import refactoring.chap04.Label;
import refactoring.chap04.Person;
import refactoring.chap05.Banner;
import refactoring.chap06.Book;
import refactoring.chap07.Item;
import refactoring.chap09.Logger;
import refactoring.chap11.Shape;
import refactoring.chap12.IntegerDisplay;
import refactoring.chap13.Dice;
import refactoring.chap14.AddressFile;
import refactoring.chap15.CSVFileTreePrinter;
import refactoring.chap15.CSVStringTablePrinter;

public class Main {
	private static final Random random = new Random(1234);
	
	private static void execute(int length) {
		//난수로 데이터 작성
		int[] data = new int[length];
		for(int i=0; i<data.length; i++) {
			data[i] = random.nextInt(data.length);
		}
		
		//데이터 표시
		SortSample sorter = new SortSample(data);
		System.out.println("BEFORE:" + sorter);
		
		//정렬해서 표시
		sorter.sort();
		System.out.println(" AFTER:" + sorter);
		
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
//		testChap01();
//		testChap02();
//		testChap02Simple();
//		testchap03();			
//		testchap04();
//		testChap05();
//		testChap06();
//		testChap07();		
//		testChap08();
//		testChap09();
//		testChap10();
//		testChap11();
//		testChap12();
//		testChap13();
//		testChap14();
		testChap15();
	}

	private static void testChap15() throws IOException {
		final String SAMPLE_CSV_STRING =
				"좋은 아침입니다.,Good morning.\n" +
				"안녕하세요~,Hello.\n" +
				"안녕하세요.,Good evening.\n" +
				"안녕히 주무세요.,Good night.\n";
		final String SAMPLE_CSV_FILE = "file.csv";
		
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
	}

	

	private static void testChap14() {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.getDatabase().set("Hanjimin", "test1@dgit.or.kr");
			file.getDatabase().set("Song Hae Gyo","test2@korea.com");
			file.getDatabase().set("Kim Min Su", "test3@naver.com");
			file.getDatabase().update();
			
			Enumeration<?> e = file.names();
			while(e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String mail = file.getDatabase().get(name);
				System.out.printf("name=%s, mail=%s%n", name, mail);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void testChap13() {
		List<Dice> dices = Arrays.asList(
					new Dice(),
					new Dice(456L),
					new Dice()
				);
		dices.get(2).setSeed(456L);
		
		for(Dice d : dices) {
			for(int i=0; i<10; i++){
				System.out.printf("%d%s ", d.nextInt(), i<9?",":"");
			}
			System.out.println();
		}
	}

	private static void testChap12() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntegerDisplay frame = new IntegerDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void testChap11() {
		List<Shape> shapes = Arrays.asList(
				new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200),
				new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400)
				);
		for(refactoring.chap11.Shape s : shapes) {
			s.draw();
		}
	}

	private static void testChap10() {
		refactoring.chap10.Robot robot = new refactoring.chap10.Robot("Andrew");
		System.out.println(robot.toString());
		
		robot.execute("forward right forward");
		System.out.println(robot.toString());
		
		robot.execute("left backward left forward");
		System.out.println(robot.toString());
		
		robot.execute("right forward forward farvard");
		System.out.println(robot.toString());
	}

	private static void testChap09() {
		Logger logger = new Logger();
		logger.log("information #1");
		
		logger.start();
		logger.log("information #2");
		
		logger.start();
		logger.log("information #3");
		
		logger.stop();
		logger.log("information #4");
		
		logger.stop();
		logger.log("information #5");
	}

/*	private static void testChap08() {
		List<refactoring.chap08.Shape> shapes = Arrays.asList(
				new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200),
				new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400)
				);
		for(refactoring.chap08.Shape s : shapes) {
			s.draw();
		}
	}*/

	private static void testChap07() {
		Item book = new Item(Item.TYPECODE_BOOK,"세계 역사",4800);
		Item dvd = new Item(Item.TYPECODE_DVD,"뉴욕의 꿈 틀별판",3000);
		Item soft = new Item(Item.TYPECODE_SOFTWARE,"튜링 머신 에뮬레이터",3200);
		
		System.out.printf("%5s = %s%n","book",book);
		System.out.printf("%5s = %s%n","dvd",dvd);
		System.out.printf("%5s = %s%n","soft",soft);
	}

	private static void testChap06() {
		Book refactoring = new Book(
				"Refactoring: improving the design of existing code",
				"ISBN0201485672",
				"$44.95",
				"Martin Fowler",
				"fowler@acm.org");
		Book math = new Book(
				"프로그래머 수학",
				"ISBN4797329734",
				"20000원",
				"유키 히로시",
				"hyuki@hyuki.com");
		
		System.out.println("refactoring:");
		System.out.println(refactoring.toXml());
		
		System.out.println("math:");
		System.out.println(math.toXml());
	}

	private static void testChap05() {
		Banner hello = new Banner("Hello, World!");
		hello.print(3);
	}

	private static void testchap04() {
		Person[] people = {
				new Person(new Label("Alice"), new Label("alice@example.com")),
				new Person(new Label("Bobby"), new Label("bobby@example.com")),
				new Person(new Label("Chris")),
		};
		for(Person p : people) {
			System.out.println(p.toString());
			p.display();
			System.out.println("");
		}
	}

	private static void testchap03() {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
	}

	private static void testChap02Simple() {
		try {
			String fileUrl = Thread.currentThread()
					.getContextClassLoader().getResource("dbfile.txt").getPath();
			
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \""+key+"\"");
				System.out.println("VALUE: \""+db.getValue(key)+"\"");
				System.out.println();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
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
		robot.order(0);//walk
		robot.order(1);//stop
		robot.order(2);//jump
	}

}
