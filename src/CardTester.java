/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("King","Spades", 13);
		Card card2 = new Card("Queen","Hearts", 12);
		Card card3 = new Card("Jack","Clubs", 11);

		System.out.println(card1.rank());
		System.out.println(card2.rank());
		System.out.println(card3.rank());

		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card3.pointValue());

		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card3));
	}
}
