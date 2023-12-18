package com.Collections.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManagementSystem
{
 public static void main(String[] args) 
 {
	Course c1=new Course(101, "java");
	Course c2= new Course(102, "python");
	Course c3=new Course(121, "reactjs");

	List<Course> l1= new ArrayList<>();
	l1.add(c1);
	l1.add(c2);
	l1.add(c3);
	for (Course course : l1) 
	{
		System.out.println(course.getCourseId()+" "+ course.getCourseName());
	}
	Trainee t1= new Trainee(121, "vamshi", "vamshi123@gmail.com", Arrays.asList(c1));
	Trainee t2= new Trainee(122, "krishna","krishna234@gmail.com", Arrays.asList(c2));
	Trainee t3= new Trainee(741, "happy","happyme34@gmail.com", Arrays.asList(c3));
	ArrayList<Trainee> l2= new ArrayList<>();
	l2.add(t2);
	l2.add(t3);
	l2.add(t1);
	for (Trainee trainee : l2) 
	{
		System.out.println(trainee.getTraineeId()+" "+trainee.getTraineeName()+" "+trainee.getTraineeMail());
	}
	System.out.println(" see the assigned courses:"+t1.SeeAssignedCourse().toString());
	System.out.println(" see the info of the Trainee :"+t1.seeHisInfo().toString());
	  Mentor mentor1= new Mentor(159, "shanti", l2);
	  

	  System.out.println("details of all trainee:"+mentor1.seeAllTrainee());
	  System.out.println("Fetch the Trainee by id:"+mentor1.getTraineeById(122));
	  System.out.println(mentor1.updateTraineeCourse(122, 102, c3));
	  System.out.println(mentor1.getListOfTrainee()); 
	  System.out.println(mentor1.getTraineeById(122));
	  System.out.println(mentor1.addTrainee(t3)); 
	 
 }
}
