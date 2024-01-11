/*------JOINS----------*/
SELECT SNAME, sports
from student_table as t1 inner  join sports  as t2
where t1.sid=t2.sid ;
select SNAME,Smarks
FROM student_table AS T1 inner join marks_table AS T2
ON T1.sid=T2.Sid AND T2.Smarks>80;

/*----------LEFT OUTER JOINS-----------*/
select *
from ncc as t1 left outer join student_table as t2
on t1.Sid= t2.sid;
select *
from sports as t1 left outer join marks_table as t2
on t1.sid=t2.Sid and t2.Smarks>80;
/*------- right  outer joins ------*/
select *
from student_table as t1 right outer join marks_table as t2
on t1.sid=t2.Sid;
use dmantz;
select Ename,sal,comm
from empolyee as emp right outer join department as dept
on emp.deptno= dept.deptno;
select *
from empolyee as emp right outer join department as dept
on emp.deptno= dept.deptno and comm is not null;
/*-----self joins-----*/
SELECT ENAME , Dloc
 FROM empolyee as EMP inner join department as DEPT 
on EMP.DEPTNO = DEPT.DEPTNO ;
