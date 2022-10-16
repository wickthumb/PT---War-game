package War;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//deck and player declaration
		Deck theDeck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		
		//Retrieve player names
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is player1's name?");
		String name1 = scan.nextLine();
		System.out.println("What is player2's name?");
		String name2 = scan.nextLine();
		
		scan.close();
		
		
		//set player names
		player1.setName(name1);
		player2.setName(name2);
		
		//Shuffle the deck
		theDeck.shuffleDeck();
		
		//Deal the deck
		
		final int DECK_LENGTH = 52;
		
		for(int i = 1; i<DECK_LENGTH + 1; i++) {
			if(i%2 == 0) {
				player1.draw(theDeck);
			}else {
				player2.draw(theDeck);
			}
		}
		
		
		// A loop to iterate through each of the players actions
		
		
		System.out.println("----WAR HAS BEEN DECLARED----");
		System.out.println("");
		
		for(int i = 0; i<26; i++) {
			//both players flip over a their top card
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			
			System.out.println(player1.getName() +": " + p1Card.describe());
			System.out.println("--VS--");
			System.out.println(player2.getName() +": " + p2Card.describe());
			System.out.println("");
			
			//Draw by default
			String winner = "Draw";
			
			//the cards are compared
			
			if(p1Card.getValue() > p2Card.getValue()) {
				player1.incramentScore();
				winner = player1.getName();
			}else if(p1Card.getValue() < p2Card.getValue()){
				player2.incramentScore();
				winner = player2.getName();
			}
			
			//round winner announced
			
			System.out.println("Round Winner: " + winner);
			System.out.println(player1.getName() +"'s Score: " + player1.getScore());
			System.out.println(player2.getName() +"'s Score: " + player2.getScore());
			System.out.println("");
			System.out.println("______________________________________________________________");
			System.out.println("");
		}
		
		
		//Game winner announced
		
		
		if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins the game!!");
		}else if (player2.getScore() < player1.getScore()) {
			System.out.println(player1.getName() + " wins the game!");
		}else {
			System.out.println("It is a draw");
		}
		
		
		//final score to console
		System.out.println(player1.getName() +"'s Score: " + player1.getScore());
		System.out.println(player2.getName() +"'s Score: " + player2.getScore());
		
	}
	
}
