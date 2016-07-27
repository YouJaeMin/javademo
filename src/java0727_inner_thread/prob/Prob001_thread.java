package java0727_inner_thread.prob;

class VendingMachine {
	private String drink;

	synchronized public String getDrink() {
		while (drink == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return drink;
	}

	synchronized public void putDrink(String drink) {
		this.drink = drink;
		notifyAll();
	}
}

class Producer extends Thread {
	VendingMachine vm;

	public Producer() {
		// TODO Auto-generated constructor stub
	}

	public Producer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
				String drink = "음료수 No. " + i;
				vm.putDrink(drink);
				System.out.println(Thread.currentThread().getName() + " : " + drink + "자판기에 넣기");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Consumer extends Thread {
	VendingMachine vm;

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {

		// if (vm.getDrink() == null) {
		// try {
		// Thread.sleep(10);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
				System.out.printf("%s : %s 꺼내먹음\n", Thread.currentThread().getName(), vm.getDrink());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class Prob001_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();

		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);

		Thread t1 = new Thread(p, "생산자");
		Thread t2 = new Thread(c, "소비자");

		t1.start();
		t2.start();
	}

}
