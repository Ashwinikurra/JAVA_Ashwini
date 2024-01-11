use dmantz;
select count(*)
from empolyee
where sal<2000 and Deptno in (10);
select sum(sal)
from empolyee
where job='clerk';
select avg(sal)
from empolyee;
select count(*)
from empolyee
where ENAME LIKE'A%';
select count(*)
from empolyee
WHERE JOB='CLERK' OR JOB='MANAGER';
SELECT count(distinct SAL) AS SALARY 
FROM EMPOLYEE;
select AVG(SAL)
FROM EMPOLYEE
WHERE JOB='CLERK';
select min(SAL)
FROM EMPOLYEE 
WHERE DEPTNO IN (10) AND JOB IN ('CLERK','MANAGER');

