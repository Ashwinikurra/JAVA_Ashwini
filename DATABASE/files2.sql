create table Department(
DeptNo int(5),
Dloc varchar(25),
Dname varchar(20)
);
insert into department
values(10, 'hyderabad', 'salesman'),
(20,'mumbai','clerk'),
(30, 'pune','manager'),
(10, 'hyderabad','president');
/*-----joins inner join----*/
select *
from department;
 update department
 set Dname='Accounting'
 where Dname='president';
 select *
from department;
select*
from empolyee,department
where empolyee.DeptNo= department.DeptNo;
select *
from empolyee left outer join department
on empolyee.DEPTNO= department.DeptNo;
select *
from empolyee e1
right outer join
department d1
on e1.DEPTNO= d1.DeptNo;