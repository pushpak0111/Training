use Employee;

CREATE TABLE emp (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    job VARCHAR(30),
    mgr INT,
    hiredate DATE,
    sal int,
    comm int,
    deptno INT,
    FOREIGN KEY (deptno) REFERENCES department(deptno)
);

INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-07-13', 3000, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);

CREATE TABLE department (
    deptno INT PRIMARY KEY,
    dname VARCHAR(50),
    location VARCHAR(50)
);

INSERT INTO department (deptno, dname, location) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO');

select * from emp;
drop table department;
drop table emp;

# 1. WAQT the Emploeee names working as a clerk in the department 20
select ename from emp where job = 'CLERK' and deptno = 20; 

# 2. WAQT the job for the employee reporting to manager number 7698 but working in dept 30.
select job from emp where mgr = 7698 and deptno = 30;

# 3. WAQT the empnames working as a clerk or a salesman
select ename from emp where job in ('CLERK', 'SALESMAN');

# 4. WAQT the department number for the employees reporting to manager number 7698 OR 7839
select deptno from emp where mgr in(7698, 7839);

# 5. WAQT the details of the employees SMITH and ALLEN
select * from emp where ename in('SMITH', 'ALLEN');

# 6. WAQT the manager numbers 7698 OR 7839 OR 7902
select * from emp where mgr in (7698, 7839, 7902);

# 7. WAQT the enames working in the dept 10 and 20
select ename from emp where deptno = 10 and deptno = 20;

# 8. WAQT the enames who are working as a CLERK AND SALESMAN
select ename from emp where job = 'CLERK'and job = 'SALESMAN';

# 9. WAQT the salary fro the emp who are not reporting to mgr number 7698 and 7839
select ename, sal from emp where mgr not in (7698, 7839);

                                        ## Between operator ## 
                                        
# 10. WAQT the salary values from 1000 to 2000
select ename, sal from emp where sal between 1000 and 2000;

# 11. WAQT the commission values within 100 to 800
select ename, comm from emp where comm between 100 and 800;

# 12. WAQT the emp details who got hired in year 1981
select * from emp where year(hiredate) = 1981;

# 13. WAQt the deptno from the emp whose empnum is not with in 7500 to 7800
select ename, deptno from emp where empno  not between 7500 and 7800; 

# 14. WAQT the job fro the emp who are not earning commision from 1000 to 2000
select ename, job from emp where comm not between 1000 and 2000;
                                                    ## Like Operator ##
# 14. WAQTD THE EMPNAMES WHICH IS STARTING WITH CHARACTER S.
select ename from emp where ename like 'S%';

# 15. WAQTD THE EMPNAMES WHICH ENDS WITH CHARACTER E.
select ename from emp where ename like '%E';

# 16. WAQTD THE JOB VALUES WHICH CONTAINS CHARACTER L.
select ename from emp where ename like '%L%';

# 17. WAQTD THE JOB WHICH CONTAINS CHARACTER E TWO TIMES.
select ename from emp where ename like '%E%E%';

# 18.WAQTD THE EMPNAMES WHICH DOES NOT CONTAIN CHARACTER T.
select ename from emp where ename not like '%T%';

# 19.WAQTD THE SALARY VALUES WHICH HAS TWO CONSECUTIVE ZERO.
select sal from emp where sal like '%00%';

# 20. WAQTD THE 3-DIGIT COMMISSION VALUES.
select comm from emp where length(comm) = 3;
select comm from emp where comm like '___';

# 21.WAQTD THE EMP DETAILS WHO GOT HIRED IN THE YEAR 1980.
select * from emp where year(hiredate) = 1980;

# 22.WAQTD THE DATE VALUES FROM DECEMBER MONTH.
select * from emp where month(hiredate) = 12;

# 23.WAQTD THE EMPNUMBERS WHICH CONTAINS DIGIT 8 IN THE SECOND POSITION.
select empno from emp where empno like '_8%';

# 24. WAQTD THE DESIGNATION WHICH CONTAINS 'G' IN THE THIRD POSITION FROM THE LAST.
SELECT JOB from emp where job like '%g__';

# 25. WAQTD THE EMPLOYEE NUMBER STARTING WITH 7 AND ENDING WITH 9.
select empno from emp where empno like '7%9';

# 26. WAQTD THE EMPNAMES WHICH STARTS WITH 'S' OR 'A'.
select ename from emp where ename like 'S%' or ename like 'A%';

# 27. WAQTD THE JOB VALUES WHICH CONTAINS FIVE CHARACTERS.
select job from emp where length(job)= 5;

# 28. WAQT THE EMPLOYEE NAMES WHO ARE NOT EARNING COMMISION
select ename from emp where comm is NULL ;

# 29. WAQT THE EMPNAMES WHO ARE GETTING SOME COMMISION
select ename from emp where comm > 0;

# 30. WAQTD THE EMPLOYEE DETAILS WHO DON'T HAVE A MANAGER NUMBER.
select * from emp where mgr is NULL;

												## Inner join ##

#31) WAQTD THE EMPLOYEENAMES AND THE DEPARTMENT NAMES FOR ALL THE EMPLOYEES.
select ename, department.dname
from emp
INNER JOIN department
on emp.deptno = department.deptno;

#32) WAQTD THE EMPNAME, JOB, DEPTNAME AND LOCATION FOR ALL THE EMPLOYEES.
select ename, job, department.dname, department.location 
from emp
INNER JOIN department
on emp.deptno = department.deptno;

#33) WAQTD THE HIREDATE, EMPNO AND LOCATION FOR THE EMPLOYEES WORKING AS A CLERK.

#34) WAQTD THE SALARY, COMMISSION AND DEPTNAME FOR THE EMPLOYEES IN CHICAGO.

#35) WAQTD THE LOCATION AND DEPTNAME FOR THE EMPLOYEES REPORTING TO THE MANAGER NUMBER 7698 AND 7839.

#36) WAQTD THE EMPLOYEE NAMES WORKING IN RESEARCH DEPARTMENT.

#37) WAQTD THE DEPTNAME, EMPLOYEENAME, MANAGER NUMBER FOR THE EMPLOYEES WORKING IN CHICAGO BUT EARNING ATLEAST 2000 SALARY.

#38) WAQTD THE EMPLOYEE NAME, DEPTNAME AND LOCATION FOR THE EMPLOYEES WHO GOT HIRED IN THE YEAR 1981.

#39) WAQTD THE REGIONNAME AND COUNTRYNAME.

#40) WAQTD THE COUNTRYNAME AND CITY.

