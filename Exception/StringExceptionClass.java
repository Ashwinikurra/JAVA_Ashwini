package com.corejava.Exception;

import java.util.Scanner;

public class StringExceptionClass
{
public static void main(String[] args) 
{
  Scanner scan=new Scanner(System.in);	
  System.out.println("enter the  string:");
  String s= scan.next();
  System.out.println("enter the index value from");
  int index =scan.nextInt();
  char ch;
  while(true)
  {
	  try
	  {
		 ch=s.charAt(index);
		 System.out.println(ch);
		 break;
	  }
	  catch(StringIndexOutOfBoundsException ae)
	  {
		  System.out.println("re-enter the value again");
		  System.out.println("enter the index value:");
		  index=scan.nextInt();
	  }
  }

}
}

