package java0707_statement;

/*
 * data 배열에서 대문자의 갯수를 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 2
 */
public class Java041_array {
	public static void main(String[] args) {
		int cnt = 0; // 대문자의 갯수 누적
		char[] data = new char[] { 'A', 'b', 'F', 'R', 'a' };

		for (int i = 0; i <= data.length - 1; i++) {
			if ('A' <= data[i] && 'Z' >= data[i]) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}// end main()
}// end class
