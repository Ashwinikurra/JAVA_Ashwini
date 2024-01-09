select count(*) as total_employee
from empolyee;
select max(sal)
from empolyee
where DEPTNO=20 ;
select min(comm)
from empolyee;
select *
from empolyee;
select sum(sal)
from empolyee
where JOB= 'SALESMAN';
select avg(sal)
from empolyee;
select distinct(deptno)
from empolyee;
select* 
from empolyee;
SET SQL_SAFE_UPDATES=0;
update empolyee
set DEPTNO=10
WHERE ENAME IN('CLARK','KING','MILLER');
select*
FROM empolyee;