package java0707_statement;

//3의 배수만 제외하고 출력하는 프로그램을 구현하세요.
public class Java032_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				// continue는 반복문에서만 사용됨.
				continue; // for문에서 continue를만나면 증감식으로 이동.
			}
			System.out.println(i);
		}

	}// end main
}// end class
