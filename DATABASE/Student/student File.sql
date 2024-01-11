create database Student;
use Student;
create table Student_table(
Sid int(5) ,
Sname varchar(25),
Sdept varchar(10),
primary key(Sid)
);
alter table student_table
modify sid int(6) primary key;
use Student;
create table Sports(
Sid int1(6),
SportsName varchar(20)
);
alter table Sports
modify sid int(6) primary key;
create table Ncc(
Sid int,
ncc_nss varchar(5),
primary key(Sid)
);
create table marks_table(
Sid int,
Smarks int,
Srank int,
primary key(Sid)
);
insert into student_table
values
(1,'ashwini','eee'),
(2,'geetha','civil'),
(3,'shiva','mechanical'),
(4,'shivani','cse'),
(5,'vamshi','mech'),
(6,'raju','eee'),
(7,'divya','ece'),
(8,'madhuri','cse'),
(9,'gowtham','Bsc'),
(10,'srividhaya','civil');
insert into ncc
values
( 1,'ncc'),
( 2,'nss'),
( 3,'ncc'),
( 6,'nss'),
( 8,'nss'),
( 10,'ncc');
insert into  sports
values
( 1,'cricket'),
( 3,'vollyball'),
( 5,'basketball'),
( 6,'cricket'),
( 7,'vollyball'),
( 10,'nbasketbal');
insert into marks_table
values
(1,89,6),
(2,95,3),
(3,76,9),
(4,80,8),
(5,69,10),
(6,92,4),
(7,90,5),
(8,82,7),
(9,97,2),
(10,98,1);
select*
from marks_table;
select*
from student_table;
select*
from ncc;
select*
from sports;
alter table sports
rename column SportsName TO sports;