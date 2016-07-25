package java0721_exception_stream;

public class Java147_exception{

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			arr[4] = 10;
			System.out.println("arr[]" + arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외정보
			// System.out.println(e.getMessage()); //4
			// 자세한내용
			// System.out.println(e.toString());
			// 위치까지 보여줌
			e.printStackTrace();
		} finally {
			System.out.println("program end");
		}

	}// end main()

}// end class
