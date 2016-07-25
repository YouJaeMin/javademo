package java0715_abstract_interface;

abstract class Instrument {

	int volume;

	public Instrument() {
		System.out.println("Instrument");
	}

	void volumeUp() {
		volume += 10;
	}

	void volumeDown() {
		volume -= 10;
	}

	abstract void play();

}

class Flute extends Instrument {

	public Flute() {
		super();
		System.out.println("Flute");
	}

	@Override
	void play() {
		System.out.println("입으로 분다.");
	}

}

class Piano extends Instrument {
	public Piano() {
		super();
		System.out.println("Piano");
	}

	@Override
	void play() {
		System.out.println("손가락으로 누른다.");
	}

}

public class Java098_abstract {

	public static void main(String[] args) {

		Flute fl = new Flute();
		fl.play();

		Piano pi = new Piano();
		pi.play();
		
	} // end main()
}// end class
