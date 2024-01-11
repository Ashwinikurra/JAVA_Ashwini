select count(*), DEPTNO
FROM empolyee
group by DEPTNO;
select sum(SAL),JOB
FROM empolyee
group by JOB;
select max(SAL),JOB
FROM empolyee
GROUP BY JOB;
select COUNT(*),JOB
FROM empolyee
WHERE ENAME LIKE '% A %'
group by JOB;
SELECT COUNT(COMM),DEPTNO
FROM empolyee
group by DEPTNO;
/*1.WAQTD NUMBER OF EMPLOYEES WORKING IN EACH 
DEPARTEMENT EXCEPT PRESIDENT.*/
select COUNT(*),DEPTNO
from empolyee
WHERE JOB not IN ('PRESIDENT')
group by DEPTNO;



 /*2.WAQTD TOTAL SALARY NEEDED TO PAY ALL THE 
EMPLOYEES IN EACH JOB. */
select sum(SAL), JOB
FROM empolyee
group by JOB;



/*3.WAQTD NUMBER OF EMPLOYEEES WORKING AS 
MANAGER IN EACH DEPARTMENT .*/
select count(*),DEPTNO
FROM empolyee
WHERE JOB IN ('MANAGER')
GROUP BY DEPTNO;



 /*4.WAQTD AVG SALARY NEEDED TO PAY ALL THE 
EMPLOYEES IN EACH DEPARTMENT EXCLUDING THE 
EMPLOYEES OF DEPTNO 20.*/
select avg(SAL),DEPTNO
FROM empolyee
WHERE DEPTNO NOT IN (20)
group by DEPTNO;


 /*5.WAQTD NUMBER OF EMPLOYEES AND AVG SALARY 
NEEDED TO PAY THE  EMPLOYEES WHO SALARY IN 
GREATER THAN 2000 IN EACH DEPT.*/
 select count(*),avg(SAL),DEPTNO
 FROM empolyee
 WHERE SAL>2000
 group by DEPTNO;
 select count(*),DEPTNO
 FROM empolyee
 group by DEPTNO
 having count(*)>=2;
 select count(*),DEPTNO
 FROM empolyee
 group by DEPTNO
 HAVING count(*)>3;
 SELECT COUNT(*),ENAME
 FROM empolyee
 group by ENAME
 having count(*)>1;
  SELECT COUNT(*),ENAME
 FROM empolyee
 group by ENAME
 having count(*)=2;
 SELECT count(*),SAL
 FROM empolyee
 group by SAL
 HAVING count(*)>1;

 /*WAQTD THE SALARIES WHICH ARE REPEATED IN EMP 
TABLE*/
select count(*),SAL
FROM empolyee
group by SAL
having count(*)>=2;


 /*WAQTD THE HIREDATE WHICH ARE DUPLICATED IN EMP 
TABLE*/
 select count(*),HIREDATE
 FROM empolyee
 GROUP BY HIREDATE
 having count(*)>1;
 
/*WAQTD AVG SALARY OF EACH DEPT IF AVG SAL IS LESS 
THAN 3000*/
 select avg(SAL),DEPTNO
 FROM empolyee
 group by DEPTNO
 having avg(SAL)<3000;

 /* WAQTD DEPTNO IF THERE ARE ATLEAST 3 EMP IN EACH 
DEPT WHOS NAME 
HAS CHAR 'A' OR 'S' .*/
select count(*),DEPTNO
FROM empolyee
group by DEPTNO
HAVING count(*)>=3;

/* WAQTD MIN AND MAX SALARIES OF EACH JOB IF MIN 
SAL IS MORE THAN 1000 AND MAX SAL IS LESS THAN 5000 */
 select min(SAL) ,max(SAL),JOB
 FROM empolyee
 group by JOB
 having min(SAL)>1000 AND max(SAL)<5000;
 