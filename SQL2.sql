# id name city and Age
create database Employee;
use Employee;

create table Employee(
id int primary key, 
Emp_Name varchar(30) NOT NULL, 
City varchar(20), 
Age int, 
Salary int);

insert into Employee(id, Emp_Name, City, Age, Salary)
values
(1, "Rahul Singh", "Aurangabad", 35, 82000), 
(2, "Aman Zha", "Mummbai", 36, 50000), 
(3, "Aryan Dubey", "Aurangabad", 32, 65000), 
(4, "Ram Tiwari", "Pune", 39, 100000), 
(5, "Aaradhya Sharma", "Mumbai", 30, 200000);

select * from Employee;

update Employee set Working_time = 12.50 where id = 1;
update Employee set Working_time = 19.80 where id = 2;
update Employee set Working_time = 11.20 where id = 3;
update Employee set Working_time = 9.50 where id = 4;
update Employee set Working_time = 13.70 where id = 5;

delete from Employee where Emp_Name = 'Aaradhya Sharma';

select * from Employee ;

alter table Employee add Working_time Decimal(10, 2);
# alter table Employee drop column Working_time;


														#### Inner Join ####
#Select Emp_id, Emp_name, Departments.Depart_Name
#From Employees
#Left Join
#ON Employees.Depart_id = Depart_id;



create table Department(
Depart_id int primary key, 
Depart_Name varchar(30), 
City varchar(30));

insert into Department (Depart_id, Depart_Name, City) values
(1, 'CSE', 'Pune'),
(2, 'IT', 'Aurangabad'),
(3, 'CSE', 'Pune'), 
(4, 'ETC', 'Pune'),
(5, 'BDC', 'Aurangabad');

select * from Department;

select id, Emp_Name, Age, Salary, Department.Depart_Name
From Employee
INNER JOIN Department
ON Employee.City = Department.City;


                                                         ### Cross Join ### 
# select Emp_name, Department.Depart_Name
# from Employee
# CROSS JOIN Department

select Emp_name, Department.Depart_Name
from Employee
CROSS JOIN Department;

														### Left Join  ### 
 select id, Emp_Name, Age, Salary, Department.Depart_Name
 from Employee
 LEFT JOIN Department
 on Employee.id = Department.Depart_id; 
								
										             	### Right Join ###
select id, Emp_Name, Age, Salary, Department.Depart_Name
from Employee
RIGHT JOIN Department
on Employee.id = Department.Depart_id; 
	
-- 										   				### Full Join ###
--  select id, Emp_Name, Age, Salary, Department.Depart_Name
--  from Employee
--  FULL JOIN Department
--  on Employee.id = Department.Depart_id; 
--  
-- 										  				### Self Join ### 
-- select e1.Emp_name, e1.Salary 
-- from Employee
-- where e1.Emp_name != e2.Emp_Name