package kr.co.doheum.blackjack;

import java.util.Scanner;

import kr.co.doheum.blackjack.player.Dealer;
import kr.co.doheum.blackjack.player.Gamer;

public class Main {
	
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer(cd);
		Dealer dealer = new Dealer(cd);
		
		Rules ruls = new Rules(gamer, dealer);
				
		for(int i=0; i<2; i++) {
			dealer.addCard(cd.getRandomCard());
			gamer.addCard(cd.getRandomCard());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner s = new Scanner(System.in);
		String input = "n";
		boolean gamerExit = false;
		do {
			//dealer.openCards();
			
			if(dealer.isContinue()) {
				dealer.addCard(cd.getRandomCard());	
			}			
			
			if(!gamerExit) {
				gamer.openCards();
				System.out.print("카드를 한장 더 받겠습니까? (y, n)");
				input = s.nextLine();
				
				if(input.equals("y")) {
					gamer.addCard(cd.getRandomCard());
				} else {
					gamerExit = true;
				}
			}
			System.out.println("-------------------");
		} while(!gamerExit || dealer.isContinue());
		
		ruls.whoIsWin();		
		
	}
}
