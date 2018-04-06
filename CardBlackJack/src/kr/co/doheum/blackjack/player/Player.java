package kr.co.doheum.blackjack.player;

import java.util.ArrayList;

import kr.co.doheum.blackjack.Card;

public class Player {
	private ArrayList<Card> cardList = new ArrayList<Card>();
	
	public void addCard(Card c) {
		cardList.add(c);
	}
	
	public ArrayList<Card> getCardList() {
		return cardList;
	}
	
	public int getSum() {
		int sum = 0;
		for(Card c : cardList) {
			sum += c.returnNo();
		}
		return sum;
	}
	
	public void openCards() {
		for(Card c : cardList) {
			System.out.println(c);
		}
		System.out.println("========");
		System.out.printf("합계 : %d\n", getSum());
		System.out.println("========");
	}
}
