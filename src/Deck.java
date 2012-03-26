import java.util.List;

public interface Deck {
  
  public void shuffle();
  public Card[] deal(int numCards);
  public void addDeck(Deck toAdd);
  public void addCard(Card toAdd);
  public void delCard(Card toDel);
  public List<Card> getCardList();
  
}
