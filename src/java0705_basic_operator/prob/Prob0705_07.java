package java0705_basic_operator.prob;
/*
    1.jumsu변수에 저장된 값에 따라 상, 중, 하를 출력하는 프로그램을 작성하시오.
	 jumsu변수의 값이 80이상이면 상	 80미만 65이상이면 중     65미만이면 하 로 출력하시오.
    2. [출력결과]
       상
 */

public class Prob0705_07 {

	public static void main(String[] args) {
		int jumsu = 85;
		String str;
		// 여기에 작성하시오.

		str = jumsu >= 80 ? "상" : jumsu < 80 && jumsu >= 65 ? "중" : "하";
		System.out.println(str);

		// 강사님
		// str = jumsu >= 80 ? "상" : jumsu >= 65 ? "중" : "하";
		str = jumsu < 65 ? "하" : jumsu < 80 ? "중" : "상";
		System.out.println(str);

	}// end main()

}// end class
