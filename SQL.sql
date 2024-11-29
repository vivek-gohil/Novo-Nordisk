create database trainingdb;
use trainingdb;
create table employee_details(
	employee_id int,
    name varchar(50),
    salary double
);
insert into employee_details
values(101,'Reema',1000);

insert into employee_details
values(102,'Rohit',1000);

insert into employee_details
values(103,'Sagar',1000);

SELECT * FROM employee_details;

delete from employee_details where employee_id = 101;