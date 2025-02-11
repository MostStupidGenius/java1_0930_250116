package day08.multiThread.synchronize.practice;

public class Counter {
	// count를 증가시키거나 확인하는 기능만 한다.
	// 증가와 확인에 대해서 동기화를 걸어서
	// 여러 객체에서 접근할 때, 잠금이 시행되도록 할 것이다.
	
	private Object lock;
	private int count=0;
	private String name;
	
	public Counter(Object o, String n) {
		this.lock = o;
		this.name = n;
	}
	
	// 카운트 증가
	public synchronized void increment() {
		this.count++;
	}
	
	// 카운트 확인
	public int getCount() {
		synchronized (lock) {
			return this.count;
		}
	}

	public String getName() {
		return this.name;
	}
	
}
