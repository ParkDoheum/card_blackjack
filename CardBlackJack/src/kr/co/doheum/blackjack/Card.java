package kr.co.doheum.blackjack;

public class Card {
	private String shape;
	private String no;
	
	public Card(String shape, String no) {
		this.shape = shape;
		this.no= no;
	}
	
	@Override
	public String toString() {
		return shape + ", " + no;
	}
	
	public int returnNo() {
		switch(no) {
		case "A":
				return 1;
		case "J":
		case "Q":
		case "K":
			return 10;
		default :
				return Integer.parseInt(no);
		}
	}
}
