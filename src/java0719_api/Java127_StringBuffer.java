package java0719_api;

public class Java127_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		// StringBuffer > String
		String s = sb.toString();
		// String > char[]
		display(s.toCharArray());

	}// end main()

	public static void display(char[] data) {
		for (char c : data) {
			System.out.print(c);
		}
	}

}// end class
