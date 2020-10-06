package cse360assignment02;

public class test
{
       public static void main(String[] args) {
       // create Calculator class object
       AddingMachine myCalculator=new AddingMachine();
       myCalculator.add (4); 
       myCalculator.subtract (2); 
       myCalculator.add(5);
       System.out.println(myCalculator.toString());
  }
}
