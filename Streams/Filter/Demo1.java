package com.Streams.Filter;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
  public static void main(String[] args) {
	List<String> names= Arrays.asList("Ashwini", "shailaja", "Yuvan.g", "Aryan");
	List<String> longNames= new ArrayList<>();
	/*longNames=names.stream().filter(str->str.length()>6&& str.length()<8).collect(Collectors.toList());
     System.out.println(longNames);*/
	names.stream().filter(str->str.length()>6&&str.length()<8).forEach(str->System.out.println(str));
  }
}
