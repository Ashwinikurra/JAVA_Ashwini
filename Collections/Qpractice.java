package com.corejava.Collections;

import java.util.PriorityQueue;

public class Qpractice 
{
  public static void main(String[] args) 
  {
	PriorityQueue< Integer> pq =new PriorityQueue<>();
	 pq.add(25);
	 pq.offer(60);
	 pq.add(12);
	 pq.offer(3);
	 System.out.println(pq);
	 System.out.println(pq.peek());
	 System.out.println(pq.contains(60));
//	 System.out.println(pq.poll());
//	 System.out.println(pq);
	 System.out.println("the priority list");
	 while(!pq.isEmpty())
	 {
		 System.out.println(pq.poll());
	 }
  }
}
