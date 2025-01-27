package day08.classPractice.kiosk;

import java.util.Scanner;

// 클래스 연습
// 기획
// 카페 키오스크에서는 다른 클래스를 가져와서
// 다루는 내용만 작성한다.

// 메뉴 클래스와 주문 클래스를 따로 작성한다.

// 메뉴 클래스:
// 멤버 변수: 메뉴명, 가격, 설명, (+할인율, 카테고리?)
// 메서드 getter/setter만 만들자.

// 주문 클래스
// 여러 메뉴를 담고 있는 장바구니 역할을 하며
// 총 가격 계산과 주문 내역 출력 기능 등을 제공한다.

// 키오스크 클래스
// 여러 메뉴를 관리할 수 있는 기능
// 메뉴 추가, 메뉴 삭제
// + 메뉴의 가격 설정, 관리자 비밀번호,

public class CafeKiosk {
	Menu[] menuList;
	Order order;

	// 인스턴스 블록을 이용해, 각 객체마다 order 객체를 추가
	{
		this.order = new Order();
	}

	public Menu[] getMenuList() {
		return menuList;
	}

	public void setMenuList(Menu[] menuList) {
		this.menuList = menuList;
	}

	public Order getOrder() {
		return order;
	}

	// 주문 내역을 외부에서 전달받지 않겠다.
//	public void setOrder(Order order) {
//		this.order = order;
//	}
	
	// 기본 생성자
	public CafeKiosk() {
		this.menuList = new Menu[] {};
	}
	
	// 메뉴를 입력받는 생성자
	public CafeKiosk(Menu[] menus) {
		this.menuList = menus;
	}
	
	public void printMenuList() {
		for (int i = 0; i < this.menuList.length; i++) {
			Menu menu = this.menuList[i];
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
	
	// 새로운 주문을 받을 준비
	public void createNewOrder() {
		this.order = new Order();
	}
	
	// 주문을 받기 위한 내용
	public void selectMenu() {
		// 메뉴 더 고르기와 결제하기에 대한 상수 옵션 설정
		final int MENU = 1, PAY = 2;
		
		Scanner sc = new Scanner(System.in);
		this.printMenuList(); // 1번부터 메뉴를 출력
		
		int selection = 0;
		do {
			System.out.print("메뉴 선택: ");
			selection = sc.nextInt();
		} while(selection <= 0 || selection > this.menuList.length);
		
		// 선택한 번호-1번째의 메뉴를 선택한 메뉴 변수에 담는다.
		Menu selectedMenu = this.menuList[selection-1];
		
		// 선택한 메뉴를 주문 내역으로 추가
		this.order.addItem(selectedMenu);
		
		// 다음 메뉴를 고를지, 혹은 결제를 진행할지 물어본다.
		
		selection = 0;
		do {
			System.out.print("1. 메뉴 더 고르기\n2. 결제하기\n선택: ");
			selection = sc.nextInt(); 
			// 선택한 숫자가 1이 아니거나 2가 아니라면
		}while(!(selection == MENU || selection == PAY));
		
		// 더이상 입력을 받지 않으므로 스캐너는 닫아준다.
		sc.close();
		
		// 선택에 따른 메서드 호출
		switch(selection) {
		case MENU:
			this.selectMenu();
			return;
		case PAY: // 결제하기를 선택한 경우
			this.pay();// 함수 호출
			return;
		}
	}
	
	public void pay() {
		// 결제하기 진행
		
	}

	public static void main(String[] args) {
		Menu[] menus = new Menu[] {
			new Menu("아메리카노", 2000),
			new Menu("카페라떼", 3000),
			new Menu("마끼아또", 4000)
		};
		
		CafeKiosk ck = new CafeKiosk(menus);
//		ck.printMenuList();
		
		ck.selectMenu();
				
				
				
				
				
				
	}
}
