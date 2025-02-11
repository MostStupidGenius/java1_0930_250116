package day08.multiThread.synchronize;

public class Sync {

	public static void main(String[] args) {
		// 동기화(Synchronization)
		// 두 개 이상의 쓰레드가 하나의 자원에 동시에 접근할 때
		// 발생할 수 있는 문제를
		// 그 순서를 정해서 한쪽을 잠금하고 다른 한쪽에서
		// 먼저 접근할 수 있게끔 설정하여 해결할 수 있도록 하는 것을 가리킨다.
		
		// 이러한 동기화는 메서드의 앞쪽에 synchronized 예약어를 붙여
		// 메서드 단위로 동기화를 걸거나
		// 메서드 내부에서 if문처럼 synchronized를 사용하여
		// 블록단위로 동기화를 걸 수 있다.
		
		// 카운터 클래스를 객체화
		Counter counter = new Counter();
		
		// 카운터 객체를 전달받아 동작을 수행하는
		// 람다식 구현
		CounterInter c2 = (Counter c)->{
			for (int i = 0; i < 10; i++) {
				try {
					c.increment();
					// 현재 카운트 횟수
					System.out.println("th1: " + c.getCount());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		MyThread th = new MyThread(c2, counter);
		MyThread th2 = new MyThread((Counter c)->{
			for (int i = 0; i < 10; i++) {
				try {
					c.increment();
					// 현재 카운트 횟수
					System.out.println("th2: " + c.getCount());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, counter);
		
		th.start();
		th2.start();
		
		
		
		
		
		
	}

}
