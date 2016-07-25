package java0712_static_access;

public class Java081_access {

	public static void main(String[] args) {
		Java080_access ja = new Java080_access();
		// private으로 선언된 자원은 외부에서 접근할수 없다.
		// System.out.printf("var_private=%d\n", ja.var_private);
		System.out.printf("var_default=%d\n", ja.var_default);
		System.out.printf("var_protected=%d\n", ja.var_protected);
		System.out.printf("var_public=%d\n", ja.var_public);

	}// end main()

}// end class
