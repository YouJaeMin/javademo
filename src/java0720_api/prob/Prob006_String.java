package java0720_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob006_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int low = 0;
		int upp = 0;
		int digit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isAlphabetic(arr[i])) {
				if (Character.isLowerCase(arr[i])) {
					low++;
				} else if (Character.isUpperCase(arr[i])) {
					upp++;
				}
			} else if (Character.isDigit(arr[i])) {
				digit++;
			}
		}

		System.out.println("영어 소문자 갯수 : " + low);
		System.out.println("영어 대문자 갯수 : " + upp);
		System.out.println("숫자 갯수 : " + digit);
	}// end display()

}// end class
