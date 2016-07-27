package java0727_inner_thread;

class OuterStatic {
	private int x;
	static private int y;

	static void call() {
		y = 9;
		// x = 3; //메모리에 생성된 시점이 다르므로 오류발생
		System.out.println(y);
	}

	static class InnerStatic {
		int z;

		void prn() {
			// static 내부클래스에서는 외부클래스의 비-static 자원을 호출 할 수 없다.
			// x = 3;
			y = 20;
			z = 30;
			System.out.println(y);
		}
	}// end InnerStatic
}// end OuterStatic

public class Java189_inner {
	public static void main(String[] args) {
		// 스태틱 클래스
		OuterStatic.call();
		OuterStatic.InnerStatic oi = new OuterStatic.InnerStatic();
		oi.prn();

	} // end main()
} // end class
