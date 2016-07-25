package java0718_api;

/*
 * JAVA API(Application programming Interface)
 * Object
 * 1 클래스 중에서 최상의 클래스이다.
 * 2 Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 * 3 java.lang패키지에서 제공하는 클래스이다. (많이 사용되는 것들만 모아둔 곳 따로 import 할필요가 없다.)
 */
public class Java112_api {

	public static void main(String[] args) {

		Object obj = new Object();
		// java.lang.Object@15db9742
		System.out.println(obj.toString());

		int x = 5;
		int y = 5;
		// == 값비교(기본데이터)
		System.out.printf("x=%d y=%d x==y:%b\n", x, y, x == y);

		Object ojt = new Object();
		// == 주소비교(참조데이터)
		System.out.printf("obj==ojt:%b\n", obj == ojt);

		// equals 주소비교 - 객체비교에서만 사용 한다.
		System.out.printf("obj.equals(ojt)=%b\n", obj.equals(ojt));

		// class java.lang.Object
		System.out.println(obj.getClass());
		// java.lang.Object
		System.out.println(obj.getClass().getName());

		System.out.println(obj);
		System.out.println(obj.toString());
		
		
		
	} // end main()
}// end class
