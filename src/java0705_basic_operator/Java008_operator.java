package java0705_basic_operator;

public class Java008_operator {
	public static void main(String[] args) {
		int numX = 10;
		int numY = 3;
		// 몫
		System.out.println(numX / numY);
		// 나머지
		System.out.println(numX % numY);

		double numA = 10.0;
		double numB = 3.0;
		System.out.println(numA / numB);
		System.out.println(numA % numB);

		// 3.3333
		System.out.println((double) numX / numY);
		// 3.0
		System.out.println((double) (numX / numY));

	}
}
