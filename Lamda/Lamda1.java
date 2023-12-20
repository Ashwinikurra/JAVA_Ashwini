package com.corejava.Lamda;
  
  interface PerformCalculation
  {
	  public int calculate(int number1, int number2);
  }
public class Lamda1 {
  public static void main(String[] args) 
  {
	  // using lamda expersion
	  PerformCalculation performCalculation=(number1, number2)->{
		  return number1 + number2;
			  };
			  System.out.println("lamda Expression output: "+performCalculation.calculate(10, 5));
  
	  //using anonymous class
		PerformCalculation performanceCalculation= new PerformCalculation() {
		
		@Override
		public int calculate(int number1, int number2) {
			// TODO Auto-generated method stub
			return number1+ number2;
		  }
		};
     System.out.println("Anonymous class output: "+performanceCalculation.calculate(12, 20));

  }
}
