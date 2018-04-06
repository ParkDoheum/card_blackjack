package kr.co.doheum.blackjack;

import java.util.ArrayList;

import kr.co.doheum.blackjack.player.Dealer;
import kr.co.doheum.blackjack.player.Gamer;

public class Rules {
	private int standardScore = 21;
	private Gamer gamer;
	private Dealer dealer;
	
	public Rules(Gamer gamer, Dealer dealer) {
		this.gamer = gamer;
		this.dealer = dealer;
	}
	
	public void whoIsWin() {
		int gamerSum = gamer.getSum();
		int dealerSum = dealer.getSum();		
		
		if(dealerSum > 21 && gamerSum > 21) {
			System.out.println("딜러와 게이머 모두 21점을 초과하였습니다.");
		} else if(dealerSum > 21) {
			System.out.println("게이머가 승리하였습니다.");
		} else if(gamerSum > 21) {
			System.out.println("딜러가 승리하였습니다.");
		} else {
			if(gamerSum == dealerSum) {
				System.out.println("게이머와 딜러는 비겼습니다.");
			} else if(gamerSum > dealerSum) {
				System.out.println("게이머가 승리하였습니다.");
			} else {
				System.out.println("딜러가 승리하였습니다.");	
			}
		}
		
		gamer.openCards();
		dealer.openCards();
	}
}
