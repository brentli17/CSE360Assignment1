package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return 0;
  }
  
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }

  public String toString () {
	  return history;
  }

  public void clear() {
	  System.gc();
  }
}