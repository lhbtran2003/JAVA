create database my_db_1;

use my_db_1;

create table employees
(
    id     int primary key,
    name   varchar(255),
    salary double
);

create table students
(
    id    int primary key ,
    name  varchar(255),
    age   int,
    major varchar(255)
)