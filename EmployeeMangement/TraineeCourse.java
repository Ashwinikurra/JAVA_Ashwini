package com.adv.EmployeeMangement;

public class TraineeCourse {
    private int tcId;
    private int trainee_id;
    private int course_id;
	public int getTcId() {
		return tcId;
	}
	public void setTcId(int tcId) {
		this.tcId = tcId;
	}
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "TraineeCourse [tcId=" + tcId + ", trainee_id=" + trainee_id + ", course_id=" + course_id + "]";
	}
    
}
