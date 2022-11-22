DROP TABLE IF EXISTS employees;

CREATE TABLE employees
(id int auto_increment primary key,
 first_name varchar(20),
 last_name varchar(20),
 email varchar(100)
);