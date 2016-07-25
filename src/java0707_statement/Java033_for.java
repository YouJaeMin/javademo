package java0707_statement;

public class Java033_for {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d\t", ++cnt);
			}
			System.out.println();
		}

	}// end main
}// end class
