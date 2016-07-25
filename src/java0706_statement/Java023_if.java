package java0706_statement;

/*
 * [출력결과]
 * station = "KBS" channel = 7  => 닥터포스터
 * station = "KBS" channel = 9  => 국수의 신
 * station = "MBC" => 몬스터
 * station = "EBS" => 한국기행
 */
public class Java023_if {
	public static void main(String[] args) {
		String station = "KBS";
		int channel = 7;

		String str = "";

		if (station == "KBS") {
			if (channel == 7) {
				str = "닥터포스터";
			} else if (channel == 9) {
				str = "국수의 신";
			}
		} else if (station == "MBC") {
			str = "몬스터";
		} else if (station == "EBS") {
			str = "한국기행";
		}

		System.out.println(str);

	}// end main()
}// end class
