package day08.classPractice.kiosk;

public class Order {
	// 주문을 받을 클래스
	// 주문내역에 포함될 메뉴 아이템들 담고,
	// 이를 관리하는 역할을 한다.

	private Menu[] menus;// 메뉴아이템들을 담을 변수
	private int menuCount;// 메뉴개수
	private int totalPrice;// 총 가격

	public Menu[] getMenus() {
		return menus;
	}

	public void setMenus(Menu[] menus) {
		this.menus = menus;
		this.setMenuCount();
	}

	public int getMenuCount() {
		return menuCount;
	}

	public void setMenuCount() {
		// 현재: 배열의 길이로 세팅
		// 미래: null이 아닌 메뉴의 개수를 세야 한다.
		this.menuCount = this.menus.length;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

//	public void setTotalPrice(int totalPrice) {
//		this.totalPrice = totalPrice;
//	}
	
	// 생성자
	public Order() {
		this.menus = new Menu[] {};// 기본 메뉴의 길이는 설정하지 않음.
		this.menuCount = 0;
		this.totalPrice = 0;
	}
	
	public Order(Menu[] menus) {
		this.menus = menus;
		this.menuCount = menus.length;
		this.totalPrice = 0;
	}
	
	// 기능
	// 메뉴 추가 기능
	public void addItem(Menu newMenu) {
		// 만약 마지막 요소가 null이 아니라면,
		// 새로운 메뉴를 넣을 공간을 확보해야 한다.(배열은 고정길이)
		// 새로운 배열을 만들어야 한다.
		if(this.menus.length == 0) {
			Menu[] newMenus = new Menu[this.menus.length+1];
		}
		if(this.menus[this.menus.length-1] != null) {
			// 원래 메뉴의 길이보다 긴 길이로 새로운 배열 생성
			Menu[] newMenus = new Menu[this.menus.length+1];
			for (int i = 0; i < this.menus.length; i++) {
				// 기존 메뉴들을 그대로 옮긴다.
				newMenus[i] = this.menus[i];
			}
			// 마지막 요소로 새로 추가된 메뉴를 삽입
			newMenus[newMenus.length-1] = newMenu;
			this.setMenuCount();
			return;
		}
		
		// 메뉴 목록을 순회하면서
		// 그 값이 null인 경우 해당 위치에 새로운 메뉴 삽입
		for (int i = 0; i < menus.length; i++) {
			if(this.menus[i] == null) {
				this.menus[i] = newMenu; // 삽입
				// 삽입 후
				break; // 반복문 탈출
			}
		}
		
		
		
	}
	
	// 주문 총액 계산하는 기능
	// 값을 전달하는 게 아니라, 내부적으로 세팅을 하는 것으로
	// 메서드 오버로딩
	public int setTotalPrice() {
		// 반환할 값
		int totalPrice = 0;
		
		for (int i = 0; i < menus.length; i++) {
			int price = 0;
			if(menus[i] != null) {
				// 각 요소가 null이 아니라면
				// 멤버변수 price 값을 가져와서
				// 임시 변수 price에 담는다.
				price = menus[i].getPrice();
			}
			// 만약 요소가 null이었다면 0이 추가될 것이다.
			totalPrice += price;
		}
		
		// 총액을 멤버변수에 업데이트
		this.totalPrice = totalPrice;
		// 값 반환
		return this.totalPrice;
	}
	
	// 주문 내역 출력기능
	public void printMenus() {
		for (int i = 0; i < menus.length; i++) {
			Menu menu = menus[i];
			if(menu == null) continue; // 가져온 메뉴가 null이면 출력하지 않는다.
			System.out.printf(
					"%d. %s : %d"
					+ "\n",
					i+1, // 메뉴의 인덱스
					menu.getMenuName(), // 메뉴명
					menu.getPrice() // 메뉴 가격
					);
		}
	}
	
	
	
	
	
	

}
