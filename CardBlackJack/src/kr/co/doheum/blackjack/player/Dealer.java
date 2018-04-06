package kr.co.doheum.blackjack.player;

import kr.co.doheum.blackjack.CardDeck;

public class Dealer extends Player {
	private CardDeck cardDeck;
	private int sum = 0;
	
	public Dealer(CardDeck cardDeck) {
		this.cardDeck = cardDeck;
	}
	
	public boolean isContinue() {
		sum = this.getSum();
		
		if(sum <= 16) {
			return true;
		}
		return false;
	}
	
	@Override
	public void openCards() {
		System.out.println("<< 딜러의 카드들 >>");
		super.openCards();
	}
}
