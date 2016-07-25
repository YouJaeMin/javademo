package java0714_inheritance;

class SuperConst {
	int x;
	int y;

	// public SuperConst() {
	// }

	public SuperConst(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("x=%d y=%d\n", x, y);
	}
}

// JVM에서 지원하는 기본 생성자는 class에 접근 제어자를 따른다.

class SubConst extends SuperConst {

	public SubConst() {
		super(10, 20);
	}

}

public class Java088_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst();

		System.out.printf("sc.x=%d sc.y=%d\n", sc.x, sc.y);
		
	}// end main()

}// end class
