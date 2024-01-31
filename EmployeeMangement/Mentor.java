package com.adv.EmployeeMangement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Mentor {
	private int mentorId;
	private String mentorName;
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
	public void addTrainee(Trainee trainee) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement", "root",
					"12345");
			PreparedStatement statement = connection.prepareStatement("insert into trainee values(?,?,?)");
			statement.setInt(1, trainee.getTraineeId());
			statement.setString(2, trainee.getTraineeName());
			statement.setString(3, trainee.getTraineeMail());
			int add = statement.executeUpdate();
			System.out.println(add + " Trainee is added");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Trainee getTrainById(int id){
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement", "root",
					"12345");
			PreparedStatement ps = connection.prepareStatement("select * from trainee where traineeId=? ");
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			Trainee trainee=new Trainee();
			while(rs.next()) {
				trainee.setTraineeId(rs.getInt(1));
				trainee.setTraineeMail(rs.getString(3));
				trainee.setTraineeName(rs.getNString(2));
				System.out.println(trainee);
			}
          return trainee;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	public void deleteTrainee(int id)
	 {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement", "root","12345");
			PreparedStatement ps = connection.prepareStatement("delete from trainee where traineeId=? ");
			ps.setInt(1, id);
			 ps.executeUpdate();
			 System.out.println("the record is sucessfully deleted");
          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
    public void updateTrainee(Trainee trainee1 , Trainee trainee2) 
    {
  
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement", "root","12345");
			PreparedStatement ps = connection.prepareStatement(" update trainee set traineeName=?,traineeMail=? where traineeId=? ");
			ps.setString(1, trainee2.getTraineeName());
			ps.setString(2, trainee2.getTraineeMail());
			ps.setInt(3, trainee1.getTraineeId());
			 ps.executeUpdate();
			 System.out.println("the record is sucessfully update");
          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public List<Trainee> getAllTrainee() 
  {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangement", "root","12345");
			PreparedStatement ps = connection.prepareStatement(" select *  from trainee");
			
			 ResultSet rs= ps.executeQuery();
			 List<Trainee> list= new  ArrayList<>();
			 while (rs.next()) {
				 Trainee trainee =new Trainee();
				 trainee.setTraineeId(rs.getInt(1));
				 trainee.setTraineeName(rs.getString(2));
				 trainee.setTraineeMail(rs.getString(3));
				 list.add(trainee);		
			}
          return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
}
