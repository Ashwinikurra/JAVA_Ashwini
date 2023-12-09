package com.corejava.Collections;
import java.util.*;
import java.util.ArrayList;
public class ALPractice1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> aL= new ArrayList<Integer>();
		aL.add(12);
		aL.add(20);
		aL.add(28);
		aL.add(null);
		aL.add(-23);
		aL.add(0);
		aL.add(20);
		System.out.println(aL);
		aL.remove(3);
		aL.remove(new Integer(0));
		System.out.println(aL);
		System.out.println(aL.get(3));
	    System.out.println(aL);
	    aL.set(3,8);
	    System.out.println(aL.size());
	    System.out.println(aL.isEmpty());
	    System.out.println(aL.contains(new Integer(12)));
	    System.out.println(aL);
	    aL.clear();
	    System.out.println(aL);
		
		}
  }
