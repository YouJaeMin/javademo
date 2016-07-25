package java0711_class;

/*
 * 칼의노래                 대출증
 * 어두운 상점의 거리   대출가능
 */
class Book {
	String title;
	boolean state;

	String process(boolean state) {
		if (state) {
			return "대출가능";
		} else {
			return "대출중";
		}
	}

	String process() {
		if (state) {
			return "대출가능";
		} else {
			return "대출중";
		}
	}

}

public class Java060_constructor {

	public static void main(String[] args) {
		int data = 10;
		// 객체참조 변수 bk 선언.
		Book bk = new Book();
		bk.title = "칼의노래";
		bk.state = false;
		System.out.printf("%s %s \n", bk.title, bk.process());

		Book bk2 = new Book();
		bk2.title = "어두운 상점의 거리";
		bk2.state = true;
		System.out.printf("%s %s \n", bk2.title, bk2.process());

	}// end main()

}// end class
