package day08.multiThread.synchronize;

public class Counter {
	// 숫자를 셀 변수 선언 및 초기화
	private int count = 0;
	
	// 동기화를 돕기 위한 잠금 객체를 생성
	private Object lock = new Object();
	
	// 값을 증가시키는 메서드
	// 메서드 단위 동기화
	// 리턴 타입 앞에 synchronized 예약어를 작성하여
	// 메서드 전체를 동기화의 대상으로 삼는다.
	public /* synchronized */ void increment() {
		this.count++;
	}
	
	// 값을 감소시키는 메서드
	// 블록 단위 동기화
	// 소괄호()에 전달된 객체를 기준으로
	// 블록 안의 코드 실행에 대해서만 동기화 대상으로 삼는다.
	public void decrement() {
//		synchronized (lock) {
		this.count--;
//		}
	}
	
	public int getCount() {
//		synchronized (lock) {
		return this.count;
//		}
		
	}
	
	
	
}
