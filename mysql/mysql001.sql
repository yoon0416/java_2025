# 1. rdb : 관계형데이터베이스 - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
# 2. 데이터베이스 언어
# 	정의어 DDL - create, alter, drop
#	조작어 DML - insert, selecct, update, delete - crud
# 	제어어 DCL - grant, revoke

#실습1) insert
use mbasic; 
show tables;
desc userinfo;

 /*mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)*/

#1-1 구조와 순서 알고 있을 때
insert into userinfo values (1, 'first',11);
#insert into userinfo values ('second',22,2); #필드 순서 안맞음 > 에러
select * from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo (name, age) values ('second',22);

insert into userinfo (age,name) values (33,'third');
insert into userinfo (age,name) values (44,'fourth');
select * from userinfo; #데이터확인

/*    update  테이블명
    set     필드1 = 값1, 필드2=값2
     where   조건
#UPDATE userinfo
#SET no = 4
#WHERE no = 5 AND name = 'fourth' AND age = 44;
*/

#2-1.전체데이터 수정
set sql_safe_updates=0;
update userinfo set age=0; -- error code 1175
select * from userinfo; #데이터확인

#2-2. 바꿀데이터 여러개 
select * from userinfo; #데이터확인

update userinfo set age=11 where no=1;
update userinfo set age=22,name='two' where no=2;
update userinfo set name='second' where no=2 and age=22;
update userinfo set age=33,name='third' where no=3;
update userinfo set name='fourth',age=44 where no=4;

#연습문제 score
#1-1값준비
use score;
insert into score values (1,'aaa',100,100,100,100,null,null,null);
insert into score values (2,'bbb',90,98,88,100,null,null,null);
insert into score values (3,'ccc',70,20,78,80,null,null,null);
insert into score values (4,'ddd',78,89,68,98,null,null,null);
insert into score values (5,'abc',89,98,69,77,null,null,null);
select * from score; #데이터확인

#값수정
#001
update score set sjava=90,sjsp=90,sspring=90 where sname='ccc';
#002
update score set semail='admin@gmail.com';
#003
update score set stotal=sjava+sjsp+sspring+sproject;
#004
update score set savg=stotal/4;
#005
update score set semail='first@gmail.com' where savg=100;
#006
update score set sjava=92,sjsp=78 where sname='bbb';
update score set stotal=sjava+sjsp+sspring+sproject;
update score set savg=stotal/4.0;
#007
alter table score modify savg double;
update score set semail='second@gmail.com',sname='second' where savg=89.5;
#008
update score set semail='ccc@gmail.com' where sname='ccc';
#009
update score set semail='blackstdudent@gmail.com' where sproject<80;
#010
update score set semail='hello@gmail.com' where savg =89.5 and sproject=98;
select * from score; #데이터확인


#실습3) delete

-- 준비

create table userinfo_delete select * from userinfo;
alter table userinfo_delete add primary key(no);
alter table userinfo_delete modify no int not null auto_increment;

desc userinfo_delete;
select *from userinfo_delete;

/*
	delete from 테이블명
    where 조건식 
*/

#3-1
delete from userinfo_delete where age=11;
select*from userinfo_delete;

#이름이 second이고 나이가 22살인 유저
delete from userinfo_delete where name='second' and age=22;
select*from userinfo_delete;

#전체데이터삭제
delete from userinfo_delete;
select*from userinfo_delete;

#3-2 연습문제
-- emp 테이블을 구조+데이터 복사해서 emp_del 준비
use emp;
create table emp_del select * from emp;
desc emp_del;
select *from emp_del;

#001
delete from emp_del where job='SALESMAN';
#002
delete from emp_del where job='MANAGER' and ename='JONES';
#003
delete from emp_del;




use emp;
insert into emp values (7369, 'SMITH','CLERK',7902, '1980-12-17', 800,NULL,20);
insert into emp values (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
insert into emp values (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
insert into emp values (7566,'JONES','MANAGER', 7839,'1981-04-02',2975,NULL,20);
insert into emp values (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30 );
insert into emp values (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30 );
insert into emp values(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
insert into emp values(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20);
insert into emp values(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
insert into emp values(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500, 0,30);
insert into emp values(7876,'ADAMS','CLERK',7788,'1987-05-23',1100,NULL,20);
insert into emp values(7900,'JAMES','CLERK',7698,'1981-12-03',950, NULL,30);
insert into emp values(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20 );
insert into emp values(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

select * from emp;

use dept;
insert into dept values(10,'ACCOUNTING','NEW YORK');
insert into dept values(20,'RESEARCH','DALLAS');
insert into dept values(30,'SALES','CHICAGO');
insert into dept values(40,'OPERATIONS','BOSTON');
select * from dept;

use salagrade;
insert into salagrade values(1,700,1200);
insert into salagrade values(2,1201,1400);
insert into salagrade values(3,1401,2000);
insert into salagrade values(4,2001,3000);
insert into salagrade values(5,3001,9999);
select * from salagrade;