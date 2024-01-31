package com.adv.EmployeeMangement;

public class MainEmployeeMg{
	 public static void main(String[] args) {
		 Trainee trainee =new Trainee();
     System.out.println(trainee.seeAllCourse());
        System.out.println(trainee.SeeAssignedCourse(101));	  trainee.seeHisInfo(101);
       Mentor mentor= new Mentor();
//      Trainee t=new Trainee(109,"happy","happy56@gmail.com");
//	  mentor.addTrainee(t);
      mentor.getTrainById(103);
//	  mentor.deleteTrainee(108);
	  Trainee t1=new Trainee();
	  t1.setTraineeName("vani");
 	  t1.setTraineeMail("vani15@gmail.com");
  // mentor.updateTrainee(t, t1);
	  System.out.println(mentor.getAllTrainee());
    System.out.println(mentor.seeAllCourse());
   
	}
}
