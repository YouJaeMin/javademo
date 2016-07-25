package java0721_exception_stream;

public class Java149_exception {

	public static void main(String[] args) {

		String data1 = "12";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
			// 다중catch
			// is a(상속)관계에 있는 exception들을 나열할때는 제일위에 최하위 자손
			// 제일 아래에 최상의 조상을 입력한다.
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("분모는 0보다 큰 수를 입력하세요.");
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}

	}// end main()

}// end class
