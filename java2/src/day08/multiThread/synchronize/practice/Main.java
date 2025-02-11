package day08.multiThread.synchronize.practice;

public class Main {
	public static void main(String[] args) {
		Object o = new Object();
		Counter counter = new Counter(o, "counter");
		
		MyThread mt1 = new MyThread(counter, "mt1");
		MyThread mt2 = new MyThread(counter, "mt2");
		
		mt1.start();
		mt2.start();
		
	}
}
