package com.corejava.Exception;

import java.util.Scanner;

public class FinallyBlock 
{
 public static void main(String[] args)
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the first number");
  int firstNumber=scan.nextInt();
  System.out.println("enter the second number");
  int secondNumber=scan.nextInt();
  int result;
  try
  {
	  result=firstNumber/secondNumber;
	  System.out.println(result);
  }
  catch(ArithmeticException ae)
  {
	  System.out.println("exception is handled");
  }
  finally
  {
	  System.out.println("sucessfully completed");
	  System.out.println("no statements to excute");
  }

}
}

