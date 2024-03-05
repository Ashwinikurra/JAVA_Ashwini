package com.spring.RestApi_mysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="course_details")
public class Course {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	 private Integer cid;
	
	  
	  private Double price;
	  
	  private String name;
	
}
