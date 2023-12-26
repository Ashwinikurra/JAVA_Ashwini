package com.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class Vehicle 
{
  public static void main(String[] args) {
	List<String> vehicleList=Arrays.asList("car" ,"bicycle","bike" ,"train","Flight");
	 List<String> vehicleListUpperCase= new ArrayList<>();
	 vehicleListUpperCase=vehicleList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	 System.out.println(vehicleListUpperCase);
}
}
