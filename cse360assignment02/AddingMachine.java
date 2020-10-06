package cse360assignment02;
public class AddingMachine {
  private int total;
  private String history= "0"; //creates the history for toString
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    
  }
  
  public int getTotal () {
    return total; //gives the variable total 
  }
  
  public void add (int value) {
      total = total + value; //adds value to the total 
      history = history + " + " + value; //adds to the string history
  }

  public void subtract (int value) {
      total = total - value; //subtracts value from total 
      history = history + " - " + value; //adds to the string history
  }

  public String toString () {
       return history; //returns the string history
  }

  public void clear() {
  }
}