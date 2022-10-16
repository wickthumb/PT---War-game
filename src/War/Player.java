package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int score = 0;
	String name;
	
	public void describe() {
		System.out.println(this.name);
		for(Card card : this.hand) {
			System.out.println(card.describe());
		}
	}
	
	public Card flip() {
		Card flippedCard = this.hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		this.hand.add(drawnCard);
	}
	
	public void incramentScore() {
		this.score += 1;
	}

}
