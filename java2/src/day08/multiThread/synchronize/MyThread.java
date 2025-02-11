package day08.multiThread.synchronize;

public class MyThread extends Thread{
	private CounterInter c;
	private Counter counter;
	
	public MyThread() {;}
	
	public MyThread(CounterInter c, Counter counter) {
		this.c = c;
		this.counter = counter;
	}

	@Override
	public void start() {
		this.c.run(this.counter);
	}
	
}
