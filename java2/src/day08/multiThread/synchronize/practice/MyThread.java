package day08.multiThread.synchronize.practice;

public class MyThread extends Thread {

	private Counter counter;
	private String name;

	public MyThread(Counter c, String n) {
		this.counter = c;
		this.name = n;
	}

	@Override
	public void run() {
		synchronized (counter) {
			try {
				for (int i = 0; i < 10; i++) {
					this.counter.increment();
					System.out.println(
							this.name + "\n" +
							this.counter.getCount()
							);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
