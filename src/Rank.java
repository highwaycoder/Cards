public enum Rank {
  ACE(1,"A"),
  TWO(2,"2"),
  THREE(3,"3"),
  FOUR(4,"4"),
  FIVE(5,"5"),
  SIX(6,"6"),
  SEVEN(7,"7"),
  EIGHT(8,"8"),
  NINE(9,"9"),
  TEN(10,"10"),
  JACK(11,"11"),
  QUEEN(12,"12"),
  KING(13,"13");
  
  private int value;
  private String string;
  
  private Rank(int ordinal,String s) {
	  value = ordinal;
	  string = s;
  }
  
  public void nextRank() {
	  value++;
	  if(value > 13) value = 1; // circular
  }
  
  @Override
  public String toString() {
	  return string;
  }
  
}
