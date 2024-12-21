create table admin12(
adminId number(9)primary key,
adminName varchar(25),
emailId varchar(90),
autoPassword varchar(20),
userRole varchar(20)
);
insert into admin12 values(1,'admin','admin@gmail.com','abc123','admin');

create table agents(
agentId number(9)primary key,
name varchar(25),
autoPassword varchar(25),
emailId varchar(90),
name_org varchar(25),
mobNo varchar(15),
phone varchar(15),
pincode varchar(6),
city varchar(20),
state varchar(20),
service_Id number(9),
address varchar(255),
userRole varchar(20)
);



insert into agents values(1,'ddsa','anu','computer','123456','2356','332178','pune','mh',25,',jaipur','agent');