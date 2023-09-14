create table studentInfo(
studentId  INT UNIQUE,
name varchar(30),
subject varchar(30),
phoneNumber varchar(10)
);

insert into studentInfo(studentId,name,subject,phoneNumber)
values (1001,"Tanweer","Java FS","9876543210");

select * from studentInfo;

insert into studentInfo(studentId,name,subject)
values (1002,"Mahesh","Java FS");


insert into studentInfo(studentId,name,subject,phoneNumber)
values 
	(1003,"Kranthi","Java FS","9172535346"),
	(1004,"Harini","Java FS",""),
	(1005,"Nagarjuna","Java FS","9172535365"),
	(1006,"Shivam","Python","7172535465"),
	(1007,"Dinesh","Java FS","4172533465");

select name, studentId from  studentInfo;

insert into studentInfo(studentId,subject,phoneNumber)
values (1008,"Java FS","34t238993");

select * from studentInfo;


insert into studentInfo(studentId,name,subject,phoneNumber)
values (1009,"Khaja","Java FS","1132143747");
