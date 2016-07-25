package java0707_statement;

public class Java044_array {
	public static void main(String[] args) {

		int[][] num = new int[3][2];
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

		// num.length 행의 크기를 리턴
		for (int i = 0; i < num.length; i++) {
			// num[i].length : i행에 해당하는 열의 크기를 리턴한다.
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%d\t", num[i][j]);
			}
			System.out.println();
		}

		System.out.println("/////////////");

		int col = 0;
		for (; col < num[col].length; col++) {
			for (int j = 0; j < num.length; j++) {
				System.out.printf("%d\t", num[j][col]);
			}
			System.out.println();
		}

	}// end main()
}// end class
