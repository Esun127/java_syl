create database if not exists shiyanlou default character set utf8;


use shiyanlou;

-- create table student (

--     stuNo int not null,
--     stuName varchar(20),
--     stuAge int,
--     primary key (stuNo)
-- );



-- delimiter //
-- create procedure insertdata(in count int)
-- begin
--     declare i int default 1;
--     while i < count do
--         insert into student values(i, concat("stu", convert(i, varchar(10))),  floor(rand()*100+1));
--         set i = i+1;
--     end while;

-- end //
-- delimiter ;


-- create table login(
--     ID int not null primary key auto_increment,
--     username varchar(20) not null,
--     password varchar(20) not null
-- );


-- insert into login values (null, "张三", "zhangsan@gmail.com");


-- delimiter //
-- create procedure addTwoNum( in num1 int, in num2 int, out sum int)
-- begin
--     set sum = num1 + num2;
-- end//
-- delimiter ;


-- delimiter //
-- create function addTwoAndReturn(num1 integer, num2 integer) returns integer
-- begin
--     declare total integer;
--     set total = num1 + num2;
--     return total;
-- end//
-- delimiter ;


-- create table myTxt(
--     id int primary key,
--     clob text
-- );



create table myPicture(
    id int primary key,
    img blob
);