package java0708_method;

/*
 * [실행결과]
 * 10는(은) 짝수 입니다.
 */

public class Java055_method {

	public static void main(String[] args) {
		int data = 11;
		boolean res = prosess(data);

		if (res) {
			System.out.printf("%d는(은) 짝수입니다.\n", data);
		} else {
			System.out.printf("%d는(은) 홀수입니다.\n", data);
		}

	}// end main()

	private static boolean prosess(int data) {

		if (data % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}// end class
