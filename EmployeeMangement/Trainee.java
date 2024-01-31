package com.adv.EmployeeMangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Trainee {
	  private int traineeId;
	    private String traineeName;
		private String traineeMail;
	    private List<TraineeCourse> listoftrainecourse;
	    
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
        
		
		public List<TraineeCourse> getListoftrainecourse() {
			return listoftrainecourse;
		}
		public void setListoftrainecourse(List<TraineeCourse> listoftrainecourse) {
			this.listoftrainecourse = listoftrainecourse;
		}
		public Trainee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Trainee(int traineeId, String traineeName, String traineeMail) {
			super();
			this.traineeId = traineeId;
			this.traineeName = traineeName;
			this.traineeMail = traineeMail;
		}
		@Override
		public String toString() {
			return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeMail=" + traineeMail
					+ ", listoftrainecourse=" + listoftrainecourse + "]";
		}
		public List<Course> seeAllCourse()
		{
			 try {
				  Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement","root","12345");
		    		PreparedStatement ps= connect.prepareStatement("select * from course");
		 
		    		ResultSet rs=ps.executeQuery();
		    		List<Course> list= new ArrayList<>();
		    		while(rs.next()) {
		    			Course c= new Course();
		    			c.setCourseId(rs.getInt("courseId"));
		    			c.setCourseName(rs.getString("courseName"));
		    			list.add(c);
		    		}
		    		return list;
				} 
			  catch (Exception e) {
					// TODO: handle exception
				}
			return null;
	    } 
			
	    public List<Course> SeeAssignedCourse(int id)  {
			  try {
				  Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement","root","12345");
		    		PreparedStatement ps= connect.prepareStatement("select * from traineecourse tc inner join course c on tc.course_id=c.courseId where trainee_id=? ");
		    		ps.setInt(1, id);
		    		ResultSet rs=ps.executeQuery();
		    		List<Course> list= new ArrayList<>();
		    		while(rs.next()) {
		    			
		    			Course c= new Course();
		    			c.setCourseId(rs.getInt("courseId"));
		    			c.setCourseName(rs.getString("courseName"));
		    			list.add(c);
		    		}
		    		return list;
				} 
			  catch (Exception e) {
					// TODO: handle exception
				}
			return null;
	    } 

		  public void seeHisInfo(int id) 
		    {
			  try {
		    		Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement","root","12345");
		    		PreparedStatement ps= connect.prepareStatement("select * from trainee where traineeId=?");
		    		ps.setInt(1, id);
		    		ResultSet rs=ps.executeQuery();
		    		while (rs.next()) {
					  Trainee trainee=new Trainee();
					  trainee.setTraineeId(rs.getInt("traineeId"));
					  trainee.setTraineeName(rs.getString("traineeName"));
					  trainee.setTraineeMail(rs.getString("traineeMail"));
					   System.out.println(trainee);
					}
				} 
		    	catch (SQLException e) {
					e.printStackTrace();
				}
			
			}
  	
	}
	  
