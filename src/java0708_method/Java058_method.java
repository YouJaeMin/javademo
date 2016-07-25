package java0708_method;

/*
 * [실행결과]
 * test avaj
 */
public class Java058_method {
	static char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };

	public static void main(String[] args) {

		// 문자 배열은 출력 가능.
		System.out.println(reverse(arr));
		// 숫자가 저장된 배열은 주소가 출력된다.
		System.out.println(new int[] { 2, 3, 4 });

	}// end main()

	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램을 구현하세요.
		char[] data2 = new char[data.length];

		for (int i = 0; i <= data.length - 1; i++) {
			data2[i] = data[data.length - 1 - i];
		}

		return data2;
	}

}// end class
