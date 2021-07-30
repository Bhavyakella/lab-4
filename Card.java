/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #3
 */
import java.util.Random;

public class Card {

	private String suit;     
	private String faceValue;  

	public Card(String suit, String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	public String getSuit() {    //accessing private variables using getters and setters
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	@Override
	public String toString() {
		return "suit='" + suit + "'"+ " faceValue=" + faceValue;  
	}

	public static void main(String[] args) {

		String[] suits = { "spades", "hearts", "diamonds", "clubs" };
		String[] faceValues = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			Card card = new Card(suits[r.nextInt(suits.length)], faceValues[r.nextInt(faceValues.length)]);
			System.out.println(card);
		}
	}
}
