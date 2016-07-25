package java0719_api;

import java.util.StringTokenizer;

public class Java129_StringTokenizer {
	public static void main(String[] args) {

		// 연속된 구분자는 두번째 구분자부터는 무시한다.
		StringTokenizer st = new StringTokenizer("java,,jsp/spring", ",/");
		System.out.println("counttoken : " + st.countTokens()); // 3

		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("///////////");
		// 구분자 갯수만큼 무조건 나누어준다.
		String[] data = "java,,jsp/spring".split("[,/]");
		System.out.println("length:" + data.length); // 4
		for (String string : data) {
			System.out.println(string);
		}

	}// end main()

}// end class
