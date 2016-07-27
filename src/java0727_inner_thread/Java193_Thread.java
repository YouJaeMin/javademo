package java0727_inner_thread;

class User2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), i);
		}
	}

}

public class Java193_Thread {
	public static void main(String[] args) {
		User2 user = new User2();
		Thread th = new Thread(user);
		th.start();

		System.out.println("main thread end");

	} // end main()
} // end class
