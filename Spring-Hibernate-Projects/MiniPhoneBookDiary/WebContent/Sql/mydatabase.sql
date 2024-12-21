create table user1234(
userId number(9)primary key,
username varchar(20),
email varchar(90),
autoPassword varchar(20),
contactNo varchar(15),
address varchar(255),
userRole varchar(15)
);
create table phoneBook(
contactId number(9)primary key,
firstName varchar(20),
lastName varchar(20),
email varchar(90),
mobNo varchar(15),
userId number(9),
FOREIGN key (userId)REFERENCES user1234(userId)
);

create table admin1234(
adminId number(9)primary key,
email varchar(80),
autoPassword varchar(20),
userRole varchar(20)
);
insert into admin123 values('1','admin@gmail.com','abc123','Admin');

create table otpTestPurpose(
loginId number(9)primary key,
name varchar(25),
password varchar(25),
loginOtp varchar(9)
);

