package com.Collections.Examples;

import java.util.*;

public class Trainee 
{
    private int traineeId;
    private String traineeName;
	private String traineeMail;
    private List<Course> listOfCourses;
    
    public Trainee(int traineeId, String traineeName, String traineeMail, List<Course> listOfCourses) 
    {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeMail = traineeMail;
		this.listOfCourses = listOfCourses;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeMail() {
		return traineeMail;
	}
	public void setTraineeMail(String traineeMail) {
		this.traineeMail = traineeMail;
	}
	public List<Course> getListOfCourses() {
		return listOfCourses;
	}
	public void setListOfCourses(List<Course> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}
    
    public List<Course> SeeAssignedCourse() 
    {
		return listOfCourses;   	
	}
    public Trainee seeHisInfo() 
    {
    	Trainee t= new Trainee(getTraineeId(), getTraineeName(), getTraineeMail(), getListOfCourses());
		return t;
		
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeMail=" + traineeMail
				+ ", listOfCourses=" + listOfCourses + "]";
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

