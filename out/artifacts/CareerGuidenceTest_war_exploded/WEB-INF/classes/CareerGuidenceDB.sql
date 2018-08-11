drop database CareerGuidenceTestDB;
create database CareerGuidenceTestDB;
use CareerGuidenceTestDB;

create table users(

	id int(10) unique not null,
    name varchar(50) not null,
    surname varchar(50) not null,
    age int(10) not null,
    login varchar(100) unique not null,
    email varchar(50) not null,
    password varchar(100) not null,
    primary key(id)

);

create table questions(

	id int(10) unique not null,
    name varchar(200) not null,
    primary key(id)

);

create table variantsOfAnswers(

	id int(10) unique not null,
    id_question int(10) not null,
    name varchar(200) not null,
    flag boolean not null,
    points int(5) not null,
    primary key(id),
    foreign key(id_question) references questions(id)

);

create table answers(

	id int(10) unique not null,
    id_user int(10) not null,
    name varchar(200) not null,
    flag boolean not null,
    points int(5) not null,
    primary key(id),
    foreign key(id_user) references users(id)

);

