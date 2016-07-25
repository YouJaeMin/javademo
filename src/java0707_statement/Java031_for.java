package java0707_statement;

public class Java031_for {
	public static void main(String[] args) {

		int even = 0; // 짝수
		int sum = 0; // 홀수
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				sum += i;
			}
		}

		System.out.printf("짝수누적:%d\n", even);
		System.out.printf("홀수누적:%d\n", sum);

	}// end main
}// end class
