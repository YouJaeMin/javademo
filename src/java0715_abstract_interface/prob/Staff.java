package java0715_abstract_interface.prob;

public class Staff extends Person {

	public Staff(String name, String jumin) {
		super(name, jumin);
	}

	@Override
	public char gender() {
		// 주민번호를 이용해서 성별을 구한후 반환하는 로직을 구현하세요.

		char c = jumin.charAt(6);
		if (c == '1' || c == '3') {
			c = '남';
		} else if (c == '2' || c == '4') {
			c = '여';
		}

		return c;
	}

	@Override
	public int getYear() {
		// 주민번호를 이용한 년도4자리를 구한후 반환하는 로직을 구현하세요.
		int ju = 0;
		char c = jumin.charAt(6);
		if (c == '1' || c == '2') {
			ju = 1900;
		} else {
			ju = 2000;
		}

		ju += Integer.parseInt(getJumin().substring(0, 2));
		return ju;
	}

	@Override
	public int getMonth() {
		return Integer.parseInt(getJumin().substring(2, 4));
	}

	@Override
	public int getDATE() {
		return Integer.parseInt(getJumin().substring(4, 6));
	}

}// end Staff
