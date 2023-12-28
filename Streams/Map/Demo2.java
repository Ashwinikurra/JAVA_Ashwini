package com.Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
   public static void main(String[] args) {
	 List<String> vehicles= Arrays.asList("happy","raja","rani","happy","raja");
	 //distinct
	 List<String> distnictVehicles=vehicles.stream().distinct().collect(Collectors.toList());
      System.out.println(distnictVehicles);
      vehicles.stream().distinct().collect(Collectors.toList());
      //count
      long count=vehicles.stream().count();
      System.out.println(count);
      //limit
      List<String> limitDistnictVehicle= vehicles.stream().limit(2).collect(Collectors.toList());
      System.out.println(limitDistnictVehicle);
      /*vehicles.stream().limit(2).forEach(value->System.out.println(value));*/
   }
}
