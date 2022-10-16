package War;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	
	//declare the list of cards and populate with all 52 cards
	List<Card> deck = new ArrayList<Card>(); {
		final int TOTAL_SUITS = 4;
	for(int i = 0; i < TOTAL_SUITS; i++) {
		String name;
		if(i==0) {
			name = "Spades";
		}else if (i==1) {
			name = "Hearts";
		}else if (i==2) {
			name = "Clubs";
		}else {
			name = "Diamonds";
		}
		final int HIGH_CARD = 14;
		for(int ii = 2; ii < HIGH_CARD +1; ii++) {
			Card newCard = new Card();
			newCard.setName(name);
			newCard.setValue(ii);
			deck.add(newCard);
		}
	  }
	}
	
	
	public void shuffleDeck() {
		List<Card> newDeck = new ArrayList<Card>();
		final int DECK_LENGTH = 52;
		for(int i = 0; i<DECK_LENGTH-1; i++) {
			Random rand = new Random();
			int upperBound = (this.deck.size())-1;
			int randInt = rand.nextInt(upperBound);
			Card aCard = deck.get(randInt);
			deck.remove(randInt);
			newDeck.add(aCard);
		}
		newDeck.add(deck.get(0));
		this.deck = newDeck;
	}
	
	//returns deck
	public List<Card> getDeck(){	
		return deck;
	    }
	
	//takes cards
	public Card draw() {
		Card drawnCard = this.deck.get(0);
		this.deck.remove(0);
		return drawnCard;
	}
	
  }
	

