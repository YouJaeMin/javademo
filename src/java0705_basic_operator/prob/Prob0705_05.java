package java0705_basic_operator.prob;

/*
 * 동전교환프로그램
 * 1 가장적은 동전으로 교환할 수 있는 프로그램작성하시오
 * 2 [출력결과]
 *   500원: 15개
     100원: 2개
     50원: 1개
     10원: 2개
     1원: 7개
 */

public class Prob0705_05 {

	public static void main(String[] args) {
		int money = 7777;
		int mok = money / 500;

		// 여기에 작성하시오
		System.out.println("500원 : " + mok);

		money -= (mok * 500);
		mok = money / 100;
		System.out.println("100원 : " + mok);
		money -= (mok * 100);
		mok = money / 50;
		System.out.println("50원 : " + mok);
		money -= (mok * 50);
		mok = money / 10;
		System.out.println("10원 : " + mok);
		money -= (mok * 10);
		mok = money / 1;
		System.out.println("1원 : " + mok);

		// 강사님
		int money2 = 7777;
		int mok2 = money2 / 500;

		System.out.printf("500원:%d개\n", mok2);

		money2 = money2 % 500;
		mok2 = money2 / 100;
		System.out.printf("100원:%d개\n", mok2);

		money2 = money2 % 100;
		mok2 = money2 / 50;
		System.out.printf("50원:%d개\n", mok2);

		money2 = money2 % 50;
		mok2 = money2 / 10;
		System.out.printf("10원:%d개\n", mok2);

		money2 = money2 % 10;
		mok2 = money2 / 1;
		System.out.printf("1원:%d개\n", mok2);

	}// end main()

}// end class
