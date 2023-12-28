package com.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;


class Student
{
	private String name;
	private int id;
	private String dept;
	
	public Student(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
	
}
public class StudentMain {
  public static void main(String[] args) {
	
	  List<Student> studentList1= new ArrayList<Student>();
	  studentList1.add(new Student("ashwini", 101, "EEE"));
	  studentList1.add(new Student("sai", 102, "cse"));
	  studentList1.add(new Student("gowthami", 103, "civil"));
	  List<Student> studentList2=new ArrayList<>();
	  studentList2.add(new Student("charanya",201,"bsc"));
	  studentList2.add(new Student("keerthana",202,"ece"));
	  studentList2.add(new Student("sharanya",201,"msc"));
	  List<List<Student>> studentList=Arrays.asList(studentList1,studentList2);
	  List<Student> result=new ArrayList<>();
	 studentList.stream().flatMap(std->std.stream())
	              .map(std->std.getName())
	              .forEach(student->System.out.println(student));
	  
}
}
