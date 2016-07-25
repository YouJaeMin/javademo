package java0719_api;
/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.
 * 입력 : 홍길동,80,93
 * 
 * [출력결과]
 * 이름: 홍길동
 * 국어: 80
 * 영어: 93
 * 평균: 86.5 (double로 계산)
 */

import java.util.Scanner;

public class Java141_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 :");
		String str = sc.nextLine();
		String[] arr = str.split(",");

		int ko = Integer.parseInt(arr[1]);
		int en = Integer.parseInt(arr[2]);
		double avg = (ko + en) / 2;

		// double k = Double.parseDouble(arr[1]);
		// double e = Double.parseDouble(arr[2]);
		// double a = (k + e) / 2;

		System.out.println("이름: " + arr[0]);
		System.out.println("국어: " + ko);
		System.out.println("영어: " + en);
		System.out.println("평균: " + avg);

	}// end main()

}// end class
