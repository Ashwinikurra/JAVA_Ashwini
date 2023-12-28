package com.Streams.Map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
		List<Integer> number= Arrays.asList(2,45,7,9,40,10,6,8,31,28,4);
		long evenNumber=number.stream().filter(n->n%2==0).count();
		 System.out.println(evenNumber);
		 
		 //sorted
		 List<Integer> sortedList= number.stream().sorted().collect(Collectors.toList());
		 System.out.println("the sorted list :"+ sortedList);
		  List<Integer> ReverseSortedList= number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		  System.out.println("the list sorted in reverse order :"+ReverseSortedList);
		
		  //minimum
		Optional <Integer> min= number.stream()
				 .min((v1,v2)->
				 {
					 return v1.compareTo(v2);
				 });
		 System.out.println("the minimum value from the list :"+min.get());
		 Optional <Integer> max= number.stream()
				 .max((v1,v2)->
				 {
					 return v1.compareTo(v2);
				 });
		 System.out.println("the maximum value from the list :"+max.get());
	}
     
}
