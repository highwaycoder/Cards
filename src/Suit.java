public enum Suit {
  SPADE(1,"S"),
  HEART(2,"H"),
  CLUB(3,"C"),
  DIAMOND(4,"D");
  
  private int value;
  private String string;
  
  private Suit(int ordinal, String s) {
	  value = ordinal;
	  string = s;
  }
  
  public void nextSuit() {
	  value++;
	  if(value == 4) value = 1; // circular
  }
  
  public String toString() {
	  return string;
  }
}
