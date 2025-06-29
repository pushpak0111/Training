create database pushpak;
use pushpak;
create table Stu_Details (
 id int primary key,
 Stu_Name varchar(30) NOT NULL,
 Age int, 
 Mobile int);
 
Insert into Stu_Details (id, Stu_Name, Age, Mobile) 
values
(1, "Pushpak Kore", 21, 984787878), 
(2, "Satwil Dhawale", 20, 984787823), 
(3, "Sanjana Dhumal", 20, 984783434), 
(4, "Priti Bagal", 19, 984787788),
(5, "Shubham Patane", 24, 984789092);

select * from Stu_Details;

select * from Stu_Details where age>20;

update Stu_Details set Stu_Name = "Rahul Bharadwaj" where id = 2;
delete from Stu_Details where id= 5;