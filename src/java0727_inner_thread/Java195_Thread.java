package java0727_inner_thread;

class User4 extends Thread {
	public User4() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%s i=%d priority=%d\n", getName(), i, getPriority());
		}
	}
}

public class Java195_Thread {
	public static void main(String[] args) {
		// 항상 우선순위가 높은 스레드가 수행되는건 아니다.

		User4 user = new User4();
		user.setName("user");
		// 스레드의 우선순위는 1~10까지 지정 할 수 있다.
		// 기본값은 5이다.
		user.setPriority(Thread.MAX_PRIORITY); // 10
		user.start();

		User4 u2 = new User4();
		u2.setPriority(Thread.MIN_PRIORITY); // 1
		u2.start();

		User4 u3 = new User4();
		u3.setPriority(8);
		u3.start();

	} // end main()
} // end class
