/**
 * This is a class that tests the Deck class
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits1 = {"Spades", "Clubs", "Diamonds", "Hearts"};
		int[] values1 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck deck1 = new Deck(ranks1, suits1, values1);
	
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
	}
}

