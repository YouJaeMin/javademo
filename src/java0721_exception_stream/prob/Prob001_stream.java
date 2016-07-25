package java0721_exception_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {

	public static void main(String[] args) {
		// 각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file = new File("./src/java0721_exception_stream/prob/score.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(sc.nextLine(), ":/");
				System.out.printf("%s의 점수 통합: %d\n", st.nextToken(), (Integer.parseInt(st.nextToken())
						+ Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
			}

			// int i = 0;
			// String[] arr = new String[3];
			// while (sc.hasNextLine()) {
			// arr[i] = sc.nextLine();
			// i++;
			// }
			// int k = 0;
			// StringTokenizer[] st = new StringTokenizer[arr.length];
			// for (int j = 0; j < arr.length; j++) {
			// st[j] = new StringTokenizer(arr[j], ":/");
			// String[] sarr = new String[st[j].countTokens()];
			// while (st[j].hasMoreTokens()) {
			// sarr[k] = st[j].nextToken();
			// k++;
			// }
			// System.out.printf("%s의 점수 통합 : %d\n", sarr[0],
			// (Integer.parseInt(sarr[1]) + Integer.parseInt(sarr[2]) +
			// Integer.parseInt(sarr[3])));
			// k = 0;
			// }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}// end main()

}// end class
