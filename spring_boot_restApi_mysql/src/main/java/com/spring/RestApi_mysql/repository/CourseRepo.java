package com.spring.RestApi_mysql.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.RestApi_mysql.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Serializable> {

}
