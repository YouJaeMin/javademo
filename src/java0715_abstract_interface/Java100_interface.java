package java0715_abstract_interface;

interface SampleA {
	void prn();
}

interface SampleB extends SampleA {
	void call();
}

class Animal {

	void play() {
		System.out.println("PLAY");
	}

}

class Life extends Animal implements SampleB {
	@Override
	public void prn() {
		System.out.println("PRN");
	}

	@Override
	public void call() {
		System.out.println("CALL");
	}

}

public class Java100_interface {

	public static void main(String[] args) {
		Life lf = new Life();
		lf.play();
		lf.prn();
		lf.call();

	} // end main()
}// end class
