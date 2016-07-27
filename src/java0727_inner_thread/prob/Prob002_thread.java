package java0727_inner_thread.prob;

class KoreanThread extends Thread {
	private char[] cArr;

	public void setcArr(char[] cArr) {
		this.cArr = cArr;
	}

	@Override
	public void run() {

		for (int i = 0; i < cArr.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(cArr[i]);
		}
		System.out.println();

	}

}

class EnglishLowerThread extends Thread {

	private char[] cArr;

	public void setcArr(char[] cArr) {
		this.cArr = cArr;
	}

	@Override
	public void run() {

		for (int i = 0; i < cArr.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(Character.toLowerCase(cArr[i]));
		}
		System.out.println();

	}
}

class EnglishUpperThread extends Thread {
	private char[] cArr;

	public void setcArr(char[] cArr) {
		this.cArr = cArr;
	}

	@Override
	public void run() {

		for (int i = 0; i < cArr.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(Character.toUpperCase(cArr[i]));
		}
		System.out.println();

	}
}

public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1 = new EnglishLowerThread();
		EnglishUpperThread t2 = new EnglishUpperThread();
		KoreanThread t3 = new KoreanThread();

		char[] cArr = new String("abcdefghijklmnopqrstuvwxyz").toCharArray();

		try {
			t1.setcArr(cArr);
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t2.setcArr(cArr);
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			cArr = new String("ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ").toCharArray();
			t3.setcArr(cArr);
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
