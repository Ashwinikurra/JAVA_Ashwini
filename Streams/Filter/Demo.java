package com.Streams.Filter;

import java.util.*;

import java.util.stream.*;

public class Demo 
{ 
	public static void main(String[] args) 
	{
//		ArrayList<Integer>numberList= new ArrayList<>();
//		numberList.add(12);
//		numberList.add(35);
//		numberList.add(52);
//		numberList.add(8);
		List<Integer> numberList= Arrays.asList(10,29,45,76,19);
		List<Integer>evenNumberList=new ArrayList<>();
	//without using streams
		/*for (Integer number : numberList) {
			if(number%2==0)
				evenNumberList.add(number);
					
		}*/
	//with using streams
		/*evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);*/
	}

}
