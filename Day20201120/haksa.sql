
select * from manager

CREATE TABLE manager
(
	no                    NUMBER(3)  NOT NULL ,
	irum                  VARCHAR2(100)  NULL ,
	age                   NUMBER(3)  NULL ,
	part                  VARCHAR2(100)  NULL 
);

CREATE SEQUENCE manager_no

CREATE UNIQUE INDEX XPK관리자 ON manager
(no  ASC);



ALTER TABLE manager
	ADD CONSTRAINT  XPK관리자 PRIMARY KEY (no);


select * from professor

CREATE TABLE professor
(
	no                    NUMBER(3)  NOT NULL ,
	subject               VARCHAR2(100)  NULL ,
	age                   NUMBER(3)  NULL ,
	irum                   VARCHAR2(100)  NULL 
);

CREATE SEQUENCE professor_no

CREATE UNIQUE INDEX XPK교수 ON professor
(no  ASC);



ALTER TABLE professor
	ADD CONSTRAINT  XPK교수 PRIMARY KEY (no);


select * from student
CREATE TABLE student
(
	no                    NUMBER(3)  NOT NULL ,
	age                   NUMBER(3)  NULL ,
	irum                   VARCHAR2(3)  NULL ,
	hakbun                NUMBER(5)  NULL 
);

DROP TABLE student

CREATE SEQUENCE student_no

CREATE UNIQUE INDEX XPK학생 ON student
(no  ASC);



ALTER TABLE student
	ADD CONSTRAINT  XPK학생 PRIMARY KEY (no);

select s.no as 번호,s.age as 나이,s.irum as 이름,s.hakbun as 학번,p.age as 교수나이,p.irum as 교수이름,p.subject as 과목,m.age as 관리자나이,m.irum as 관리자이름,m.part as 부서 from (student s left join professor p on s.no=p.no) left join manager m on s.no=m.no ORDER BY 번호 ASC;
