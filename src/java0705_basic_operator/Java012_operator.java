package java0705_basic_operator;

public class Java012_operator {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		// &&연산자의 앞의 값이 false 이면 뒤를 실행하지 않는다.
		boolean res = (++a > b) && (++b < c);
		System.out.printf("res=%b, b=%d\n", res, b);

		int x = 4;
		int y = 8;
		int z = 10;
		// ||연산자의 앞의 값이 true 이면 뒤를 실행하지 않는다.
		boolean res2 = (z > ++y) || (++x > y);
		System.out.printf("res2=%b, x=%d\n", res2, x);
		
		
		
		

	} // end main()
}// end class
