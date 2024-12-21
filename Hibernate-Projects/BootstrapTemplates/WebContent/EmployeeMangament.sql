						Employee Management DataBase

						
					==========================
					||	1.MasterGroup        ||			
					==========================
					
This table consist of all master table used in application

create table mastergroup
(
groupid number(9) primary key,
groupname varchar(60)
);

insert into mastergroup values(1,'spicGroup');


					====================================================
					||	2.EIMRIGHTS(Employee Information Manager)       ||			
					====================================================

This table consist of List of all HR Rights given to each employee For Example Simple User Right, Line Manager Right, Admin Right

create table eimrights
(
hrrightid number(9) primary key,
hrrightname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into eimrights values(1,'Aporva',1);


					=========================================
					||	3.TRRIGHTS(Time Registration)       ||			
					=========================================
			
This table consist of List of all TR Rights given to each employee For Example No Right, Key in right, Approval Right, Create Project right, block project right

create table trrights
(
trrightid number(9) primary key,
trrightname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into trrights values(1,'Approval Rights',1);

 
					========================
					||	4.BLOODGROUP       ||			
					========================
This table consist of List of all blood group (A+, B+, AB+, O+ … ETC)

create table bloodgroup
(
bloodgroupid number (9) primary key,
bloodgroupname varchar (10),
groupid number (9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into bloodgroup values(1,'A+',1);


					======================
					||	5.CATEGORY       ||			
					======================
This table consist of List of all category (General, SC, ST, OBC)

create table category
(
categoryid number(9) primary key,
categoryname varchar(15),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into category values(1,'OBC',1);


					====================
					||	6.GENDER       ||			
					====================
This table consist of List of gender (Male, Female)

create table gender
(
genderid number (9) primary key,
gendername varchar (10),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into gender values(1,'male',1);


					======================
					||	7.MARITALSTATUS ||			
					======================
This table consist of List of marital status (Single, Married, Divorcee, Widow)

CREATE TABLE maritalstatus
(
maritalstatusid number(9) PRIMARY KEY,
maritalstatusname varchar(20),
groupid number (9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into maritalstatus values(1,married,1);


					=====================
					||	8.NATIONALITY ||			
					=====================
This table consist of List of nationality (Indian, Foreign)

CREATE TABLE nationality
(
nationalityid number(9) PRIMARY KEY,
nationalityname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into nationality values(1,'Indian',1);

					======================
					||	9.RELIGION ||			
					======================
This table consist of List of all religions (Hindu, Jain, Muslim, Christan…ETC)

CREATE TABLE religion
(
religionid number(9) PRIMARY KEY,
religionname varchar(15),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into religion values(1,'Hindu',1);

					======================
					||	10.EDUCLASS ||			
					======================
This table consist of List of education result class (Dist, First, Second, Pass)

CREATE TABLE educlass
(
educlassid number(9) PRIMARY KEY,
educlassname varchar(20),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into educlass values(1,'First',1);

					======================
					||	11.EDULEVEL ||			no table created in database
					======================
This table consist of List of education levels (Diploma, Bachelor, Masters, Professional, Other)

CREATE TABLE edulevel
(
edulevelid number(9) PRIMARY KEY,
edulevelname varchar(25),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into edulevel values(1,'Professional',1);


				======================
				||	12.RELATION ||			
				======================
This table consist of List of relationships (Father, Mother, Brother, Sister, Spouse, Son, Daughter, Other)

CREATE TABLE relation
(
relationid number(9) PRIMARY KEY,
relationname varchar(25),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into relation values(1,'Wife',1);


			======================
				||	13.STATE ||			
			======================
This table consist of List of all states with in india

CREATE TABLE state
(
stateid number(9) PRIMARY KEY,
statename varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into state values(1,'Pune',1);

		 	======================
			||	14.LANGUAGE ||			
			======================
This table consist of List of languages (English, Hindi, Tamil, Gujarati, Marathi…ETC)

CREATE TABLE languages
(
languagesid number(10) PRIMARY KEY,
languagesname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into languages values(1,'Hindi',1);


			=======================
			||	15.LANGUAGEFLUENCY||			
			=======================
This table consist of List of language Fluency (Read, Write, Speak)

CREATE TABLE languagefluency
(
languagefluencyid number(9) PRIMARY KEY,
languagefluencyname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into languagefluency values(1,'English',1);


			=======================
			||	16.NOMINEESCHEME||			
			=======================
This table consist of List of nomination scheme (EPF, EPS, Grauity)

CREATE TABLE nominationscheme
(
nominationschemeid number(9) PRIMARY KEY,
nominationschemename varchar(25),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into nominationscheme values(1,'EPF',1);

			=======================
			||	18.TRAININGTYPE||			
			=======================
This table consist of List of type of training (Managerial, Technical)

CREATE TABLE trainingtype
(
trainingtypeid number(9) PRIMARY KEY,
trainingtypename varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into trainingtype values(1,'Technical',1);

			=======================
			||	19. EMPSTATUS||			
			=======================
This table consist of List employee status (Confirm, Probation, Contract, Retainership)

CREATE TABLE empstatus
(
empstatusid number(9) PRIMARY KEY,
empstatusname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into empstatus values(1,'Confirm',1);

			=======================
			||	20.FUNCTIONS||			
			=======================
This table consist of List employee functionality

CREATE TABLE functionality
(
functionalityid number(9) PRIMARY KEY,
functionalityname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into functionality values(1,'hiii',1); 

			=======================
			||	21.DEPARTMENTS||			
			=======================
This table consist of List of all departments with In organization

CREATE TABLE departments
(
departmentsid number(9) PRIMARY KEY,
departmentsname varchar(50),
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into departments values(1,'hiii',1); 

			=======================
			||	22.DESIGNATION||			
			=======================
This table consist of List of all designation

CREATE TABLE designation
(
designationid number(9) PRIMARY KEY,
designationname varchar(50),
departmentsid number(9),
FOREIGN KEY (departmentsid) REFERENCES departments (departmentsid)
groupid number(9),
FOREIGN KEY (groupid) REFERENCES mastergroup (groupid)
);

insert into designation values(1,'Java Doveloper',1,1); 

			=======================
			||	23.ESTABLISHMENT||			
			=======================
This table consist of establishment details of each employee such as employee code, employee name, domaiin name, email address etc.

CREATE TABLE establishment
(
establishmentcode number(9) PRIMARY KEY,
firstname varchar(15),
middlename varchar(15),
lastname varchar(15),
domainname varchar(50),
email varchar(100),
regdate date,
stateclient number(4),
stateadmin number(4),
hrrightid number(9),
FOREIGN KEY (hrrightid) REFERENCES eimrights (hrrightid)
trrightid number(9),
FOREIGN KEY (trrightid) REFERENCES trrights (trrightid)
);

insert into departments values(1001,'Deendayal','BL','kumawat','Employee','kkumawat1111@gmail.com',14-04-2017,5,4,1,1); 



demo table

create table demologin
(
userId number(9) primary key,
username varchar(50),
password varchar(50),
roleName varchar(20)
);

insert into demologin values(2,'abc@gmail.com','abc','Employee');
