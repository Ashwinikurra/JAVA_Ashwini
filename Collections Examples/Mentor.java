package com.Collections.Examples;

import java.util.*;
import java.util.stream.Collectors;

public class Mentor {
	 private int mentorId;
	 private String mentorName;
	private ArrayList<Trainee> listOfTrainee;
	
	
	
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(int mentorId, String mentorName, ArrayList<Trainee> list) 
	{
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.listOfTrainee = list;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}


	public ArrayList<Trainee> getListOfTrainee() {
		return listOfTrainee;
	}
	public void setListOfTrainee(ArrayList<Trainee> listOfTrainee) {
		this.listOfTrainee = listOfTrainee;
	}
	public List<Trainee> seeAllTrainee() 
	{
		return listOfTrainee;
		
	}
	public Trainee getTraineeById(int id) 
	{
		Trainee t = new Trainee();

		for (Trainee trainee : listOfTrainee) {
			if (trainee.getTraineeId() == id) {
				t.setTraineeId(trainee.getTraineeId());
				t.setTraineeName(trainee.getTraineeName());
				t.setTraineeMail(trainee.getTraineeMail());
				t.setListOfCourses(trainee.getListOfCourses());
			}
		}
		return t;
	
	

	}
	public Trainee addTrainee(Trainee trainee) 
	{
		listOfTrainee.add(trainee);
		return trainee;
		
	}
	public List<Trainee> deleteTrainee(int id) 
	{
		Trainee t=new Trainee();
		for (Trainee trainee : listOfTrainee) {
			if (trainee.getTraineeId() == id) {
				t=trainee;
			}
		}
		listOfTrainee.remove(t);
		return listOfTrainee;
	}
	
	
 
	
	public List<Course> updateTraineeCourse(int tid, int cid, Course course)
	{
		List<Course> c= new ArrayList<>();
		
        for (Trainee trainee : listOfTrainee) 
        {
			if(trainee.getTraineeId()==tid)
			{
				for (Course course1 : trainee.getListOfCourses()) 
				{
					if (course1.getCourseId()==cid) 
					{
						course1.setCourseId(course.getCourseId());
						course1.setCourseName(course.getCourseName());
					}
				}
				
			}
			c=trainee.getListOfCourses();
		}
		return c;      
	}
}


