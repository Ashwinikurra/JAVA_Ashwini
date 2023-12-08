package com.corejava.Threads;

public class MultiThreading
{
	public static void main(String[] args)
	{
	Thread_0 thread_0=new Thread_0();
	Thread_1 thread_1=new Thread_1();
	Thread_2 thread_2=new Thread_2();
	thread_0.start();
	thread_1.start();
	thread_2.start();
	}
}
class Thread_0 extends Thread
{
	public void run()
	{
		sri();
	}
	public static void sri()
	{
		System.out.println("sri institute ");
	}
}
class Thread_1 extends Thread
{
	public void run()
	{
		display();
	}
	public static void display()
	{
		System.out.println("display the result");
	}
}
class Thread_2 extends Thread
{
	public void run()
	{
		print();
	}
	public static void print()
	{
		System.out.println("print the output");
	}
}
