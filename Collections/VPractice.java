package com.corejava.Collections;

import java.util.*;

public class VPractice 
{
	 public static void main(String[] args)
	 {
		Vector v= new Vector();
           v.add("punith");
		    v.add("chinnu");
		    v.add("srividhya");
		    v.add(2, "shailu");
		    v.add("yamini");
		  System.out.println("size :"+ v.size());  
		System.out.println("Capacity :"+ v.capacity());
	 }
}
