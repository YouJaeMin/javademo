package java0707_statement;

public class Java045_array {
	public static void main(String[] args) {

		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%d\t", num[i][j]);
			}
			System.out.println();
		}

	}// end main()
}// end class
