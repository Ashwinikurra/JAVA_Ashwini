package com.corejava.Exception;

import java.util.Scanner;

public class ArithmeticExceptionClass
{
public static void main(String[] args)
{
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the first value :");
	int firstNumber= scan.nextInt();
	System.out.println("enter the second value:");
	int secondNumber=scan.nextInt();
	int result;
	try
	{
		result=firstNumber/secondNumber;
		System.out.println(result);	
	}
	catch(ArithmeticException ae)
	{
		System.out.println("arthimetic Exception handled");
	}
	
	}
}
