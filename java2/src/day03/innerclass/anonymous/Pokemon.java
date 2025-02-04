package day03.innerclass.anonymous;

public abstract class Pokemon {
	String name;
	int age;
	int stats[];
	String skill;
	static String[] skills;
	static {
		skills = new String[] {
				"몸통박치기", "전광석화", "웅크리기",
				"모래뿌리기", "죽은척하기"
		};
	}
	
	// 포켓몬의 기술을 랜덤으로 설정하는 추상 메서드 선언
	// skills 공유변수의 값 중 랜덤으로 기술이 선택되어
	// 멤버변수 skill에 세팅
	public abstract void setSkill();
}
