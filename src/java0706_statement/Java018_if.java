package java0706_statement;

/*
 * 조건식을 만족할때만 수행할 문장이 있는 경우
 * if(조건신){
 *   수행할 문장;
 * }
 */
public class Java018_if {
	public static void main(String[] args) {
		int num = -9; // 1

		if (num > 0) { // 2
			System.out.println("자연수"); // 3
		}

		System.out.println("program end"); // 4   3

	}// end main()
}// end class
