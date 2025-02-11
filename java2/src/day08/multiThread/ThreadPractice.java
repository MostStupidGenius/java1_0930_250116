package day08.multiThread;

public class ThreadPractice {

	public static void main(String[] args) {
		// 쓰레드(Thread)
		// 프로세스라는 하나의 프로그램 실행 단위 안에서
		// 실제로 로직이나 데이터를 처리하는 실행 단위를 쓰레드라고 부른다.
		// 이러한 쓰레드는 기본적으로 프로세스당 최소 하나(메인 쓰레드)가 있지만
		// 동시에 여러 작업을 수행해야 할 때 두 개 이상의 쓰레드가 필요할 수 있다.
		// 이럴 때 사용하는 것이 멀티 쓰레드 기법이다.
		
		// 쓰레드가 실행할 동작을 정의하는 Runnable 객체 생성
		Runnable r = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("쓰레드1: " + i);
				try {
					// 해당 쓰레드가 잠시 동작을 멈춘다.
					Thread.sleep(1000); // 1000ms = 1초
				} catch (InterruptedException e) {
					e.printStackTrace(); // 오류 출력
				}
			}
			System.out.println("쓰레드1 작업 끝");
		};
		
		// 동작을 쓰레드에 전달하여 해당 쓰레드를 실행하면 동작이 시작된다.
		Thread th = new Thread(r);
		
		// 새로운 쓰레드 생성
		// 쓰레드의 생성자를 호출하면서 그 인자로
		// 람다식을 이용해 Runnable 객체를 전달
		Thread th2 = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("쓰레드2: " + i);
				try {
					// 해당 쓰레드가 잠시 동작을 멈춘다.
					Thread.sleep(900); // 900ms = 0.9초
				} catch (InterruptedException e) {
					e.printStackTrace(); // 오류 출력
				}
			}
			System.out.println("쓰레드2 작업 끝");
		});
		
		// 정의했던 러너블 동작 실행 시작
		th.start();
		th2.start();
		
	}

}
