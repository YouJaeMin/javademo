package java0720_api.prob;
/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 * 공백을 구분해서 배열로 저장 후  main(String[] args) args에 보낸다.
 */

/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob001_String {

	public static void main(String[] args) {
		System.out.printf("java Prob001_String %s %s\n", args[0], args[1]);

		System.out.printf("source : %s %s\n", args[0], args[1]);

		System.out.printf("convert : %s %s\n", convert(args[0]), convert(args[1]));

		String str = args[0] + " " + args[1];
		System.out.println("length:" + str.length());

		System.out.printf("reverse : %s\n", reverse(str));

	}

	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}

	public static String convert(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				s += Character.toUpperCase(c);
			} else if (c >= 'A' && c <= 'Z') {
				s += Character.toLowerCase(c);
			}
		}
		return s;
	}

}// end class
