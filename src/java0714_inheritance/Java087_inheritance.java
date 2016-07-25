package java0714_inheritance;

class MyGrand {
	public MyGrand() {
		System.out.println("조상생성자");
	}
}

class MyFather extends MyGrand {
	public MyFather() {
		super();
		System.out.println("부모생성자");
	}
}

class My extends MyFather {
	// 자손생성자에선 반드시 부모생성자를 호출해줘야 한다. (상속받은 클래스에선 반드지 상속 클래스의 생성자를 호출한다.)
	// 생성자 호출이 생략되어 있으면 JVM에서 super()로 호출한다.
	public My() {
		super();// 상속받은 클래스의 생성자호출
		System.out.println("자손생성자");
	}

}

public class Java087_inheritance {

	public static void main(String[] args) {

		My me = new My();

	}// end main()

}// end class
