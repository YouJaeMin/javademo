package java0719_api;

public class Java126_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");

		// 4인덱스에서 ", jsp" 문자열을 삽입한다.
		sb.insert(4, ",jsp");
		System.out.println(sb);

		// 4인덱스부터 8의 미만사이의 문자열을 삭제한다.
		sb.delete(4, 8);
		System.out.println(sb);

		// 0인덱스 문자를 삭제한다.
		sb.deleteCharAt(0);
		System.out.println(sb);

		// " sample" 문자열을 추가한다.
		sb.append(" sample");
		System.out.println(sb);

		// 문자열을 반대로 변경해서 리턴한다.
		sb.reverse();
		System.out.println(sb);

		String data = "mybatis orm";
		StringBuffer ss = new StringBuffer(data);
		ss.reverse();
		System.out.println(ss);

		char[] arr = { 'k', 'o', 'r', 'e', 'a' };
		String s1 = new String(arr);
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		System.out.println(s2);

	}// end main()
}// end class
