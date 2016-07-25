package java0715_abstract_interface;

class BindTest {
	String stn;

	public BindTest(String stn) {
		this.stn = stn;
	}

	public String toString() {
		return stn;
	}

}

class A {
	void pr() {
		System.out.println("rr");
	}
}

class B {
	void prn() {
		System.out.println("11");
	}
}

// 객체형변환 (바인딩)
public class Java105_binding {

	public static void main(String[] args) {
		// A aa = new A();
		// B bb = new B();
		// aa = bb;

		// 바인딩(binding) : 두개의 관계를 연결한 것이다.
		// 정적 바인딩 : 메모리에 생성된 영약과 같은 타입으로 메모리를 관리한다.
		BindTest bt = new BindTest("java");
		System.out.println(bt.toString());

		// 동적 바인딩 : 메모리에 생성된 영역을 부모객체로 메모리를 관리한다.
		// 업캐스팅후 다운캐스팅 가능 반대의 경우는 불가
		// 상속관계에서만 가능 (is a) -> 업캐스팅 -> 동적 바인딩
		Object obj = new Object();
		String st = new String("jsp");
		// obj = (Object) st;
		obj = st;
		System.out.println(obj);

		// 다운캐스팅 -> 동적 바인딩
		String str = (String) obj;
		System.out.println(str);
	} // end main()

}// end class
