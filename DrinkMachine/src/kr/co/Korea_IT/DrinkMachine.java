package kr.co.Korea_IT;

import java.util.ArrayList;

public class DrinkMachine {
	public int money = 0;
	
	public void addMoney(int price) {
		if(price < 0) {
			money += price;
		}
	}
	ArrayList colaArray = new ArrayList();
	ArrayList orancArray = new ArrayList();
	ArrayList pocariArray = new ArrayList();
	ArrayList ciderArray = new ArrayList();
	
	public void setting() {
		for(int i=0; i<50; i++) {
			colaArray.add(i);
			orancArray.add(i);
			pocariArray.add(i);
			ciderArray.add(i);
		}	
	}
	
	public void showMoney() {
		System.out.println("- 현금 주입 -");
		System.out.println("1. 100원");
		System.out.println("2. 500원");
		System.out.println("3. 1,000원");
		System.out.println("4. 5,000원");
		System.out.println("5. 10,000원");
		System.out.println("6. 주입 완료");
	}
	
	public void showMenus() {
		System.out.println("- 메뉴 -");
		System.out.println("1. 콜라 - 600원");
		System.out.println("2. 사이다 - 600원");
		System.out.println("3. 오란씨 - 600원");
		System.out.println("4. 포카리 - 600원");
		System.out.println("5. 종료");
	}
	
	
	
}
