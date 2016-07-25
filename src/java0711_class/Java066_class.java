package java0711_class;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius; // 원의 면적
	}

	public void prn() {
		System.out.println(name + "의 면적은 " + getArea());
	}
}// end class////////////////////////

public class Java066_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////

		Circle cc = new Circle();
		cc.name = "자바피자";
		cc.radius = 10;
		System.out.println(cc.name + "의 면적은 " + cc.getArea());

		Circle cc2 = new Circle();
		cc2.name = "자바도넛";
		cc2.radius = 2;
		System.out.println(cc2.name + "의 면적은 " + cc2.getArea());

		System.out.println("//////////////////////");

		Circle[] cd = new Circle[2];
		cd[0] = cc;
		cd[1] = cc2;

		for (int i = 0; i < cd.length; i++) {
			cd[i].prn();
		}

	}// end main()

}// end class
