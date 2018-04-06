package kr.co.Korea_IT;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.koreait.drink.Cider;
import kr.co.koreait.drink.Cola;
import kr.co.koreait.drink.Oranc;
import kr.co.koreait.drink.Pocari;

public class Main {
	public static void main(String[] args) {
		System.out.println("하하하");
		Scanner scan = new Scanner(System.in);
		System.out.println("[자판기 시작]");
		
		int choiceIdx;
		DrinkMachine dm = new DrinkMachine();
		dm.setting();
		dm.showMoney();		
		
		while (true) {
			System.out.print("입금 선택 : ");
			choiceIdx = scan.nextInt();

			if (choiceIdx == 6) {
				break;
			} else if (choiceIdx == 1) {
				dm.money += 100;
			} else if (choiceIdx == 2) {
				dm.money += 500;
			} else if (choiceIdx == 3) {
				dm.money += 1000;
			} else if (choiceIdx == 4) {
				dm.money += 5000;
			} else if (choiceIdx == 5) {
				dm.money += 10000;
			}
			System.out.printf("입금액 : %,d\n", dm.money);			
		}
		
		dm.showMenus();
		
		while(true) {
			System.out.print("메뉴 선택 : ");
			choiceIdx = scan.nextInt();
			if(choiceIdx == 5) {
				break;
			}
			if(choiceIdx == 1) {	
				if(dm.money >= 600) {
					System.out.println("콜라 - 600");
					dm.colaArray.remove(0);
					dm.money -= 600;	
				} else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
				
			} else if (choiceIdx == 2) {
				if(dm.money >= 600) {
					System.out.println("사이다 - 600");
					dm.ciderArray.remove(0);
					dm.money -= 600;
				} else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
				
			} else if (choiceIdx == 3) {
				if(dm.money >= 700) {
					System.out.println("오란씨 - 700");
					dm.orancArray.remove(0);
					dm.money -= 700;	
				} else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
				
			} else if (choiceIdx == 4) {
				if(dm.money >= 700) {
					System.out.println("포카리 - 700");
					dm.pocariArray.remove(0);
					dm.money -= 700;	
				} else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
				
			}
			System.out.printf("남은돈 %,d입니다.\n", dm.money);
		}
		System.out.printf("콜라 %d\n", dm.colaArray.size());
		System.out.printf("사이다 %d\n", dm.ciderArray.size());
		System.out.printf("오란씨 %d\n", dm.orancArray.size());
		System.out.printf("포카리 %d\n", dm.pocariArray.size());
	}
}
