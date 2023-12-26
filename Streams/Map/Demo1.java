package com.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 
{
 public static void main(String[] args) {
	List<Integer> number= Arrays.asList(5,8,3,12,14);
	List<Integer> multipleNumber= new ArrayList<>();
	/*multipleNumber =number.stream().map(num->num*3).collect(Collectors.toList());
	System.out.println( multipleNumber);*/
	//  Another way Performing
	 number.stream().map(num->num*3).forEach(num->System.out.println(num));
}
}
