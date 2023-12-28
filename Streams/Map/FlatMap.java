package com.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap 
{
  public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,8,9,7,5);
	List<Integer>listResult=new ArrayList<>();
	//map
	listResult=list.stream().map(n->n+8).collect(Collectors.toList());
	System.out.println(listResult);
	//Flat MAP
	List<Integer>finalResult= new ArrayList<>();
	List<Integer> list1=Arrays.asList(5,6);
	List<Integer> list2=Arrays.asList(7,8);
	List<Integer> list3=Arrays.asList(9,3);
	List<List<Integer>> finalList=  Arrays.asList(list1,list2,list3);
	finalResult=finalList.stream().flatMap(x->x.stream()).map(n->n+10).collect(Collectors.toList());
	System.out.println(finalResult);
}
}
