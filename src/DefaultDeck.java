import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Provides a set of all 52 standard cards.
 * Initially unshuffled.
 * 
 * @author Chris Browne
 *
 */
public class DefaultDeck implements Deck{

	private List<Card> cards;
	
	public DefaultDeck() {
		List<Card> cards = new ArrayList<Card>(52);
		Suit s = Suit.SPADE;
		Rank r = Rank.ACE;
		for(Card c : cards) {
			c.setSuit(s);
			c.setRank(r);
			if(r == Rank.KING) s.nextSuit();
			r.nextRank();
		}
	}
	
	@Override
	public void shuffle() {
		List<Card> newCards = new ArrayList<Card>();
		Random r = new Random();
		while(!cards.isEmpty()) {
			int index = r.nextInt(cards.size());
			newCards.add(cards.get(index));
			cards.remove(index);
		}
		cards = newCards;
	}

	@Override
	public Card[] deal(int numCards) {
		Card[] rv = new Card[numCards];
		Random r = new Random();
		while(numCards > 0) {
			rv[numCards] = cards.get(r.nextInt());
			numCards--;
		}
		return rv;
	}

	@Override
	public void addDeck(Deck toAdd) {
		cards.addAll(toAdd.getCardList());
	}

	@Override
	public void addCard(Card toAdd) {
		cards.add(toAdd);
	}

	@Override
	public void delCard(Card toDel) {
		cards.remove(toDel);
	}

	@Override
	public List<Card> getCardList() {
		return cards;
	}

}
