package com.Examples.Lamda1;

import java.util.*;


public class PersonLamda 
{
  public static void main(String[] args) 
  {
	    
	List<Person> people=  Arrays.asList(
			  new Person("Ashwini", "kurra", 22),
			 new Person("vamshi", "crews", 22),
			 new Person("chandhana", "nimankoti", 22),
			 new Person("Ganesh", "crab", 22) );
	Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	System.out.println("Printing all the person");
	printConditionally(people, p-> true);
	System.out.println("the list of people firstName beginning with A");
	printConditionally(people, p-> p.getFirstName().startsWith("A"));
	System.out.println("the list of people LastName beginning with c");
	printConditionally(people, p->p.getLastName().startsWith("c"));
  }

	private static void printConditionally(List<Person> people ,Condition condition)
	{
	  for (Person p : people) 
	  {
		if (condition.test(p)) 
		{
			System.out.println(p);
		}
	  }
	}		
}
