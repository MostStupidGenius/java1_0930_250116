package day08.classPractice.kiosk;

public class Menu {
	// 키오스크의 메뉴에 대한 설계도를 작성하는 공간
	// 메뉴명, 메뉴가격, 설명, +할인율, 카테고리, 시즌상품, 판매여부
	private String menuName;// 메뉴명
	private int price; // 메뉴 가격
	private String text; // 메뉴 설명
	
	// 기본 생성자? -> x
	// 메뉴명, 메뉴 가격은 비워둘 수 없기 때문
	
	// 메뉴명, 가격, 텍스트 모두 입력받는다.
	// 생성자1번
	// 모든 생성자의 종착지로써, 공통적으로 할 행동을 정의할 수 있다.
	public Menu(String menuName, int price, String text) {
		this.menuName = menuName;
		this.price = price;
		this.text = text;
	}
	
	// 메뉴명, 가격만 입력받는다. -> text는 기본값
	// 생성자2번
	public Menu(String menuName, int price) {
		// 생성자 1번을 호출하여 필요한 정보를
		// 쉽게 넣을 수 있다.
		// 코드를 길게 작성할 필요없이
		// 해당 내용을 생성자 1번에게 책임을 넘길 수 있다.
		// text의 내용만 기본값을 설정하면
		// 세줄이나 작성할 필요가 없다.
		this(menuName, price, "내용 없음");
	}
	
	// 메뉴명을 설정
	// 생성자3번
	public Menu(String menuName) {
		this(menuName,
				-1);// 가격은 초기값으로 설정
		// 미설정된 상태라는 것을 알리기 위해
		// 음수로 설정할 수도 있다.
	}
	
	// +생성자 4번
	// 메뉴명과 설명만 입력
	public Menu(String menuName, String text) {
		this(menuName, -1, text);
	}
	
	// getter/setter 자동 생성 단축키
	// alt + shift + s
	// -> r

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		String defaultMenuName = "미정";
		if(menuName == null) { // 전달받은 문자열이 널 값이라면
			this.menuName = defaultMenuName; // 기본값 세팅
			return; // 아래 코드로 넘어가지 않음.
		}
		this.menuName = menuName;
		// 삼항 연산자 방식
//		this.menuName = menuName == null ? defaultMenuName : menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 초보자 코드
//		if(price < 0) {
//			this.price = 0;
//		}
		// 실무 코드
		// Math.max()라는 함수는 전달되는 두 값 중
		// 더 큰 값을 고르는 함수다.
		this.price = Math.max(price, 0);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text==null ? "내용 없음" : text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
