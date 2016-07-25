package java0707_statement;

public class Java034_for {
	public static void main(String[] args) {

		int cnt = 1;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				sum += cnt;
				System.out.printf("%d\t", cnt++);
			}
			System.out.println(sum);
			sum = 0;
		}

	}// end main
}// end class
