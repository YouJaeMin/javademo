package java0707_statement.prob;

/*
1+1+2+1+2+3+1+2+3+4+1+2+3+4+5=??

출력결과
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
		// int cnt = 0;
		// for (int i = 1; i <= 5; i++) {
		// if (i == 5) {
		// cnt += i;
		// continue;
		// }
		//
		// for (int j = 1; j <= i; j++) {
		// cnt += j;
		// }
		// cnt += i;
		// }
		// System.out.println("sum=" + cnt);

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);

	}// end main()

}// end class
