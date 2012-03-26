
public class Card implements Comparable<Card> {
  
  private Rank rank;
  private Suit suit;
  
  public void setSuit(Suit to) {
	  suit = to;
  }
  
  public void setRank(Rank to) {
	  rank = to;
  }
  
  public Rank getRank() {
    return rank;
  }
 
  public Suit getSuit() {
    return suit;
  }
  
  @Override
  public int compareTo(Card comp) {
    if(comp.getRank() == rank) {
      // TODO: see below
      return suit.ordinal() - comp.getSuit().ordinal();
    } else {
      // TODO: check if this is really how to get ordinal values of 
      // enumerated constants in Java
      return rank.ordinal() - comp.getRank().ordinal();
    }
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(rank.toString());
    sb.append(suit.toString());
    return sb.toString();
  }
}
