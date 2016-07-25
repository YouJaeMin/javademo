package java0707_statement.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_01_array {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		// 여기를 구현하시오.
		int count = 0;
		int rowsum = 0;
		int colsum = 0;

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (row < data[row].length - 1 && col < data.length - 1) {
					data[row][col] = cnt++;
				} else if (row == data.length - 1) {
					for (int i = 0; i < row; i++) {
						data[row][col] += data[i][col];
					}
				} else if (col == data[col].length - 1) {
					for (int i = 0; i < col; i++) {
						data[row][col] += data[row][i];
					}

				}

				System.out.printf("%4d", data[row][col]);
			}
			System.out.println();

		}

		// for (int row = 0; row < data.length - 1; row++) {
		// for (int col = 0; col < data[row].length; col++) {
		// if (col == data[row].length - 1) {
		// data[row][col] = colsum;
		// count = col;
		// } else {
		// colsum += cnt;
		// data[row][col] = cnt++;
		// }
		// }
		// colsum = 0;
		// }
		//
		// // 세로 계산
		// for (int i = 0; i < data.length; i++) {
		// for (int j = 0; j < data[i].length; j++) {
		// rowsum += data[j][i];
		// }
		// data[data.length - 1][i] = rowsum;
		// rowsum = 0;
		// }
		//
		// for (int row = 0; row < data.length; row++) {
		// for (int col = 0; col < data[row].length; col++) {
		// System.out.printf("%4d", data[row][col]);
		// }
		// System.out.println();
		// }

	}// end main()

}// end class
