Create database Dmantz;
 use Dmantz;
 /*--create table--*/
 create table Student(
  student_id int,
  student_name varchar(20),
  student_dept varchar(10),
  student_marks int
 );
 select* from Student;
 /*add column to table*/
 alter table Student
 add student_age varchar(5);
 /* change column names of a tables*/
 alter table student
  change student_age age varchar(6);
  /* Inserting data into table */
  insert into student values (1,'ashwini', 'Eee', 596,20);
  insert into student values (5,'srinu', 'Eee', 951,21);
  insert into student values (2,'geetha', 'civil', 620,22);
  insert into student values (1,'ashwini', 'Eee', 596,20);
  insert into student values (4,'krishna', 'cse', 789,23);
     
  select* from student;
 