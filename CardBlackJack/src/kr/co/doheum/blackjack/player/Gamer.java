package kr.co.doheum.blackjack.player;

import kr.co.doheum.blackjack.CardDeck;

public class Gamer extends Player {
	
	CardDeck cd;
	
	public Gamer(CardDeck cd) {
		this.cd = cd;
	}
	
	@Override
	public void openCards() {		
		System.out.println("<< 게이머의 카드들 >>");
		super.openCards();
	}
}
