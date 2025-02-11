package day08.multiThread.synchronize;

// 클래스 객체를 하나 전달받아서
// 특정 동작만 수행한 뒤 종료하는
// 함수형 인터페이스
@FunctionalInterface
public interface CounterInter {
	public void run(Counter c);
}
