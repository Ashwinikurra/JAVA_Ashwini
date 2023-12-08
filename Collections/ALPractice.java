package com.corejava.Collections;

import java.util.*;
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class ALPractice 
{
	public static void main(String[] args) 
	{
        Person P1= new Person("ganesh", 20);
        Person p2= new Person("sai", 28);
        Person p3= new Person("rakesh", 25);
        ArrayList<Person> al= new ArrayList<>();
        al.add(P1);
        al.add(p2);
        al.add(p3);
        System.out.println(al.get(0).name);
        System.out.println(al.get(0).age);
        System.out.println(al.get(1).name);
        System.out.println(al.get(1).age);
        System.out.println(al.get(2).name);
        System.out.println(al.get(2).age);
	}

}
