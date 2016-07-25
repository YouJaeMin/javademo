package java0707_statement.prob;

/*
 * 1 10=2x+3y의 해를 구하시오.
 *   x와y의 범위 : 0<=x<=10,  0<=y<=10
 *   
 * 2 출력결과
 *  x=2, y=2
 *  x=5, y=0
 */
public class Prob_04 {

	public static void main(String[] args) {
		int sum = 10;
		int x = 10;
		int y = 10;
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				if ((2 * i) + (3 * j) == sum) {
					System.out.printf("x=%d, y=%d\n", i, j);
				}
			}
		}

	}// end main()

}// end class
