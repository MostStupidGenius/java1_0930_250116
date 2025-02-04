package day03.innerclass.anonymous;

import java.util.Random;

public class AnonymousBasic {

	public static void main(String[] args) {
		// 익명 내부 클래스
		// 내부 클래스 중에서 부모 클래스를 직접 상속받아
		// 그 내용을 구현하거나 재정의한 뒤
		// 바로 객체를 생성하는 1회용 객체를 선언하는 방법이다.
		// 이때, 부모 클래스는 일반적으로
		// 추상 클래스나 인터페이스인 경우가 많다.(내부 구현을 해야 하니까)
		Pokemon pikachu = new Pokemon() {

			// 초기 스킬을 세팅하는 메서드를 구현하는 부분
			// 추상 메서드이기 때문에 그 내용을 구현해야
			// 객체화와 사용이 가능하다.
			@Override
			public void setSkill() {
				// 이미 세팅된 스킬이 있다면 세팅 못하게 막기
				if (this.skill != null) {
					return;
				}

				// 랜덤번호를 뽑을 랜덤 객체 생성
				Random r = new Random();
				// 0부터 4사이의 정수 값 랜덤 추출
				int randomIndex = r.nextInt(5);

				// 해당 인덱스의 스킬을 멤버변수 skill에 세팅
				this.skill = skills[randomIndex];
			}
		};

		// 스킬 세팅
		pikachu.setSkill();

		// 세팅된 스킬 출력
		System.out.println(pikachu.skill);

	}

}
