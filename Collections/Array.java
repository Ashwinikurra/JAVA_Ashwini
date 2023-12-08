package com.corejava.Collections;
import java.util.*;
public class Array
{
   public static void main(String[] args)
   {
	ArrayList<String>  al= new ArrayList<>();
	 al.add("25");
	 al.add("ashu");
	 al.add("yuvan");
	 al.add("ashwini");
	 al.add(1, "lohith"); 
	 al.remove(0);
	 System.out.println("the first list");
	 //using foreach loop
	 for (String s : al)
	 {
		System.out.println(s);
	 }
	 System.out.println();
	 
	ArrayList<String>  al2= new ArrayList<>();
	 al2.add("58");
	 al2.add("85");
	 al2.clear();
	 al2.add("95");
	 al2.add("8");
	 al2.add("35");
	 al2.add("06");
	 al.set(1, "100");

	 al.addAll(0, al2);
	System.out.println(al);
	 System.out.println("the index of :"+al.indexOf("ashwini"));
	 System.out.println("object contain is :"+al.contains("25"));
	 System.out.println("The compartion of two lists is :"+al.equals(al2));
	 System.out.println();

	//using for loop
//		for (int i = 0; i < al.size(); i++) 
//			 {
//				System.out.println(al.get(i));
//			 }
	 
//using itertor
//	ListIterator<String> itr= al.listIterator();
//	 System.out.println("In forward direction ");
//	  while (itr.hasNext())
//	  {
//	     System.out.println(itr.next());
//	  }
//	  System.out.println("In Reverse Direction");
//	  while (itr.hasPrevious()) 
//	  {
//		System.out.println(itr.previous());
//    }	
	  
   }
}
