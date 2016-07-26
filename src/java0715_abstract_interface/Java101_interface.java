package java0715_abstract_interface;

interface TestB {
	void prn();
}

interface TestC {
	void prn();
}

class TestD {
	void prn() {
		System.out.println("TestD");
	}
}

class TestE extends TestD {
	@Override
	void prn() {
		System.out.println("TestE");
	}
}

class TestA implements TestB, TestC {

	@Override
	public void prn() {

	}

}

public class Java101_interface {

	public static void main(String[] args) {

	} // end main()
}// end class