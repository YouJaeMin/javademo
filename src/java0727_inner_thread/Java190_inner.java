package java0727_inner_thread;

/*
 * 지역클래스에서 외부클래스 메서드의 매개변수, 지역변수를
 * 호출하기 위해서는 final이 선언되여 있어야 한다.
 * 하지만, jdk8버전부터는 final이 선언되여 있지 않아도 호출이 가능하다.
 */
class OuterLocal {
	private int x;
	static int y;
	final private int z = 10;

	// java jdk 8에서 final을 자동으로 처리해줌
	public void call(final int a) {
		final int b = 20;
		int c = 30;
		c = 40;
		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("z=" + z);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				// 내부에서 사용 하려면 final 키워드가 있어야한다.
				// System.out.println("c=" + c);
			}
		}
		System.out.println("c=" + c);

		InnerLocal inner = new InnerLocal();
		inner.prn();

	}// end call()
}

public class Java190_inner {
	public static void main(String[] args) {
		// 지역클래스
		OuterLocal ol = new OuterLocal();

		ol.call(100);

	} // end main()
} // end class
