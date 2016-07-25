package java0708_method;

public class Java054_method {

	public static void main(String[] args) {
		char data = 'g';
		char code = prosess(data);
		System.out.printf("%c의 대문자는 %c입니다.\n", data, code);

	}// end main()

	public static char prosess(char data) {
		// 매개변수 data의 값을 대문자로 리턴하는 프로그램을 구현하세요.

		if (data >= 'A' && data <= 'Z') {
			data = (char) (data + 32);
		} else if (data >= 'a' && data <= 'z') {
			data = (char) (data - 32);
		}

		return data;
	}

	public static char prosess2(char data) {
		// 매개변수 data의 값을 대문자로 리턴하는 프로그램을 구현하세요.
		return data = (char) (data - 32);
	}

}// end class
