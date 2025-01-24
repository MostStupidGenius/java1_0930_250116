package day07.classConstructor;

public class House {
//	클래스 변수(인스턴스 변수)
//	멤버변수, 필드값 등으로 부르며, 각 객체마다 할당되는
//	모든 객체에 동일 변수명을 정의한다.
	String owner; // 집주인
	int acount; // 재산
	String TV; // TV 종류

	public House(String owner, int acount, String TV) {
		// 객체의 정보를 세팅하는 방법
		// this.필드명으로 값을 세팅할 수 있다.
		this.owner = owner;
		this.acount = acount;
		this.TV = TV;
	}

	public static void main(String[] args) {
		House 철수네집 = new House("철수아빠", 10000, "삼성");

		// 철수가 학교가기 전
		System.out.println(철수네집.TV);
		House 철수엄마네집 = 철수네집;

		// 철수가 학교간 사이에 TV를 바꾼 엄마
		철수엄마네집.TV = "LG";

		// 하교했더니 TV가 바뀌어있다.
		System.out.println(철수네집.TV);

	}

}
