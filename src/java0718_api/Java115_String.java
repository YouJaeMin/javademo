package java0718_api;

public class Java115_String {

	public static void main(String[] args) {
		String str = new String("KoRea,jsp,java");
		System.out.println("문자열 길이 : " + str.length());
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		System.out.println("문자 : " + str.charAt(1));
		System.out.println("인덱스 : " + str.indexOf('R'));
		System.out.println("범위 : " + str.substring(5));
		System.out.println("범위 : " + str.substring(2, 8));

		String[] arr = str.split(",");
		for (String s : arr) {
			System.out.println(s);
		}

		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n", x, y, x + y);

		// 숫자를 문자로
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);

		System.out.printf("%s+%s=%s\n", s1, s2, s1 + s2);
		
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.println(s3);
		
		
		
	}// end main()
}// end class
