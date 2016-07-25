package java0718_api;

/*
 * [출력결과]
 * 홍길동님은 남성입니다.
 * 응삼이님은 여성입니다.
 * 
 */
public class Java117_String {

	public static void main(String[] args) {
		String p1 = "홍길동,591203-1597650";
		String p2 = "응삼이,030628-4056892";
		display(p1);
		display(p2);

	}// end main()

	public static void display(String str) {
		// 여기를 구현하세요
		String[] arr = str.split(",");

		char c = arr[1].charAt(7);
		if (c == '1' || c == '3') {
			System.out.println(arr[0] + "님은 남성입니다.");
		} else if (c == '2' || c == '4') {
			System.out.println(arr[0] + "님은 여성입니다.");
		}else{
			System.out.println("잘못입력하셨습니다.");
		}

	}
}// end class
