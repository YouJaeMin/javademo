package java0719_api;

/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림 해서 구하시오.
 * ex) 0.5689.... > 5.7
 */

public class Java132_Math {
	public static void main(String[] args) {

		double ran;
		ran = Math.random();
		System.out.println(Math.round(ran * 100.0) / 10.0);

		ran = ran * 100;
		long data = Math.round(ran);
		double num = (double) data / 10;
		System.out.println(num);

	}// end main()

}// end class
