package com.spring.RestApi_mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.RestApi_mysql.model.Course;
import com.spring.RestApi_mysql.repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public Course getById(Integer cid) {
       Optional<Course> findById =courseRepo.findById(cid);
		
		return findById.get();
	}

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "sucess";
	}

	

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		courseRepo.findAll();
		return null;
	}

	@Override
	public String deleteById(Integer cid) {
		// TODO Auto-generated method stub
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "deleted sucessful";
		}else {
			return "no record is found ";
		}
	
	}

}
