package com.spring.RestApi_mysql.service;

import java.util.List;

import com.spring.RestApi_mysql.model.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourse();
	
	public String deleteById(Integer cid); 
	

}
