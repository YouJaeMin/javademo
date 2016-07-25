package java0720_api;

import java.text.SimpleDateFormat;

public class Java143_System {

	public static void main(String[] args) {
		// long millis = System.currentTimeMillis();
		// // 시
		// long hours = (millis / (1000 * 60 * 60)) % 24;
		//
		// // 분
		// long minutes = (millis / (1000 * 60)) % 60;
		//
		// // 초
		// long seconds = (millis / 1000) % 60;
		//
		// System.out.printf("%d %d %d\n", hours, minutes, seconds);

		// currentTimeMillis() : 1970.1.1부터 초단위로
		// 누적한 값을 밀리센컨드로 리턴한다.
		// 하루는 86400초이다. 1초는 1000밀리세컨드이다.

		long curr = System.currentTimeMillis();

		// 날짜 시간형식의 패턴을 제공해주는 클래스이다.
		// MM : 월, mm : 분
		// hh : 12시간, HH : 24시간
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String data = sdf.format(curr);
		System.out.println(data);

	}// end main()

}// end class
