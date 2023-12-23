package com.Examples.Lamda1;

import java.util.*;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> people=  Arrays.asList(
				  new Person("chinnu", "chandhagiri", 22),
				 new Person("vamshi", "crews", 18),
				 new Person("chandhana", "nimankoti", 20),
				 new Person("Ganesh", "crab", 36) );
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("the list of people :");
		printAll(people);
		System.out.println("list persons lastname beggining with c");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("c"); 
			}
		});
	
		System.out.println("list persons Firstname beggining with c");
       printConditionally(people, new Condition() {
		
		@Override
		public boolean test(Person p) {
			
			return p.getFirstName().startsWith("c");
		}
	});
}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}
}
interface Condition
{
	boolean test(Person p);
}