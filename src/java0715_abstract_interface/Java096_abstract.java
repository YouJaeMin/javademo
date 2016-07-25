package java0715_abstract_interface;

/*
 * 클래스 : 클래스, 추상클래스(메소드중 일부가 구현부가 없는것), 인터페이스 (구현부가 없는것)
 * 
 * 다양성 : 오버로딩, 오버라이딩
 * 
 * 메소드 정의 : 메소드 선언부 + 메소드 구현부
 * void prn(){}
 * 
 * 추상메소드 : 구현부가 없는 메소드이다.
 *  abstract void prn();
 *  
 *  추상클래스 : 추상메소드를 가지고 있는 클래스이다.
 *   abstract class Test{ }
 *   
 *  추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고 
 *                   객체생성을 할 수 없도록 하기 위해서
 */

abstract class CarAbs {
	int speed = 0;
	String color;

	void upSpeed(int speed) {
		this.speed = speed;
	}

	abstract void work();

}

class SendaAbs extends CarAbs {

	@Override
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}

}

class TruckAbs extends CarAbs {
	@Override
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}

}

public class Java096_abstract {

	public static void main(String[] args) {

		// 추상 클래스는 완전한 객체가 아니라 객체 생성을 할 수 없다.
		// CarAbs ca = new CarAbs();

		SendaAbs sa = new SendaAbs();
		sa.work();

		TruckAbs ta = new TruckAbs();
		ta.work();

	} // end main()
}// end class
