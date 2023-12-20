package com.corejava.Lamda;

public class Student 
{
  String Name= "ashwini";
  public void greet() {
	System.out.println("hi "+Name);
   }
  public static void main(String[] args) {
//	Student s1= new Student();
//	s1.greet();
	  
	  new Student().greet();
 }
  
}
