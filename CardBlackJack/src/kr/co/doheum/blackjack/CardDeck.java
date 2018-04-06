package kr.co.doheum.blackjack;

import java.util.ArrayList;

public class CardDeck {
	ArrayList<Card> cardList = new ArrayList<Card>();
			
	public CardDeck() {
		String nos[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String shapes[] = {"스페이드", "하트", "다이아", "클로버"};
	
		for(int i=0; i<shapes.length; i++) {
			for(int j=0; j<nos.length; j++) {
				cardList.add(new Card(shapes[i], nos[j]));
			}
		}
	}
	
	public Card getRandomCard() {
		int r = (int) (Math.random() * cardList.size()); //0~ 51
		//System.out.printf("cardList size() : %d\n", cardList.size());
		//System.out.printf("random value : %d\n", r);
		Card c = cardList.get(r);
		cardList.remove(r);
		return c;
	}
}
