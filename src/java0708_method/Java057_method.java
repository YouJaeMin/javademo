package java0708_method;

/*
 * year 변수에 값이 윤년이면 true 평년이면 false을 반환하는 프로그램을 구현하시오.
	[실행결과]
 */

public class Java057_method {

	public static void main(String[] args) {

		int year = 2012;

		if (isLeapYear(year)) {
			System.out.printf("%d는 윤년입니다.", year);
		} else {
			System.out.printf("%d는 평년입니다.", year);
		}

	}// end main()

	private static boolean isLeapYear(int year) {
		// 여기를 구현하시오.

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}

}// end class
