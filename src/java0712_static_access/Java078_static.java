package java0712_static_access;

class ThisStatic {

	public ThisStatic() {

	}

	public void prn() {
		System.out.println("this");
	}

	public static void process() {
		System.out.println("static");
	}

	public static void call() {
		// static이 선언된 메소드에서는
		// 비-static 자원(멤버변수, 메소드)를 호출할수 없다.
		// prn();

		process();
	}

}

public class Java078_static {

	public static void main(String[] args) {
		ThisStatic ts = new ThisStatic();
		ts.call();

	}// end main()

}// end class
