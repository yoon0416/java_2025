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


use mbasic;
create table select_userinfo select * from userinfo;
alter table select_userinfo add primary key(no);
alter table select_userinfo modify no int not null;

-- 1. 전체데이터 검색
select * from select_userinfo;
-- 2. 부분검색
select name,age from select_userinfo;
-- 3. 중복제거
select distinct name from select_userinfo;
-- 4. 별명
select name as `이름`, age as `나이` from select_userinfo;
-- 5. where 조건 ( = 같다, != <> 다르다 )
select *from select_userinfo where name='second';
select *from select_userinfo where name!='second';
select *from select_userinfo where name<>'second';

select *from select_userinfo where age <33;
select *from select_userinfo where age <=33;
select *from select_userinfo where age >33;
select *from select_userinfo where age >=33;

-- 6. and, between and / or, in 
select*from select_userinfo where age>=22 and age <=33;
select*from select_userinfo where age between 22 and 33;

select * from select_userinfo where age=22 or age=33;
select *from select_userinfo where age in (22,33);

desc select_userinfo;
alter table select_userinfo modify age int;


-- 7. null 검색 (is null, is not null, not in, not between)
select *from select_userinfo;
insert into select_userinfo (name) values ('seven');

# null 값이 빈값이라는 상태
select*from select_userinfo where age is null;
select*from select_userinfo where age is not null;

select*from select_userinfo where age not between 22 and 33;
select*from select_userinfo where age not in (22,33);

-- like 문자열 검색(like 'a%', '%a', '%a%','_a%')

select * from select_userinfo;
select*from select_userinfo where name = 'first';
select*from select_userinfo where name like  'f%';
select*from select_userinfo where name like  '%t';
select*from select_userinfo where name like '%i%';
select*from select_userinfo where name like  '_e%';

#데이터베이스언어★
# DDL - create, alter,drop
# DML - insert,select,update, delete
# DCL - grant, revoke

#e(entity: 테이블) r(relation: 관계) 속성:pk,fk
# join★
-- 두개 이상의 테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리 (pk,fk)

# 종류 : inner join, outer join
select a.no, a.name, a.age, b.ban from join_userinfo a ,join_userban b where  a.no = b.no;

# 2 join on
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b on (a.no = b.no);

# 3 join using
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b using(no);

# 4 natural join - natural join 알아서 join 연결할 부위 찾아서 연결해줌
select no,name,age,ban from join_userinfo natural join join_userban;

-- ------------------------------------------------

select a.no,a.name,b.ban from join_userinfo a, join_userban b where a.no=b.no and age>=20 and age<=40;

select a.no,a.name,a.age,b.ban from join_userinfo a join join_userban b on(a.no=b.no) and age>=20 and age<=40;

select a.no,a.name,a.age,b.ban from join_userinfo a join join_userban b using(no) where a.age>=20 and a.age<=40;

select no,name,age,ban from join_userinfo natural join join_userban where age>=20 and age<=40;

select a.no, a.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no=b.no;

-- -------------------------------------------------
select b.no, b.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no=b.no;

-- join 연결부위
select * from emp,dept order by empno;
--

select * from emp,dept where e.deptno = d.deptno order by empno;
--

select e1.empno, e1.ename, e1.mgr, e2.empno 'MGR_EMPNO', e2.ename 'MGR_ENAME'
FROM emp e1, emp e2, salgrade s
WHERE e1.mgr = e2.empno AND e1.sal BETWEEN s.losal AND s.hisal
ORDER BY e2.empno ASC;
--

select e1.empno, e1.ename, e1.mgr, e2.empno 'MGR_EMPNO', e2.ename 'MGR_ENAME'
FROM emp e1 left join emp e2 on (e1.mgr = e2.empno)
ORDER BY e2.empno ASC;
--

select e1.empno, e1.ename, e1.mgr, e2.empno 'MGR_EMPNO', e2.ename 'MGR_ENAME'
FROM emp e1 right join emp e2 on (e1.mgr = e2.empno);
-- right join right 쪽의 테이블 값 보장

## ■ 1. order by + limit
/*
select 필드1, 필드2
from 테이블명
where 조건식
order by 기준필드 [asc(1,2,3 오름차순) || desc(3,2,1 내림차순)]
limit 몇개
*/
-- 1-1 초기화
use mbasic;
show tables;
select * from select_userinfo;
insert select_userinfo (no,name,age) values (6,'first',66);
update select_userinfo set age = 55 where no=5;
update select_userinfo set name='first' where no=5;
update select_userinfo set name='third' where no=6;
# ------------------------------------------------------------

-- 1-2. 정렬
select * from select_userinfo;
select * from select_userinfo order by age desc; 	   # 나이 기준 내림차순
select * from select_userinfo order by age asc;			# 나이 기준 오름차순
select * from select_userinfo order by name asc;		# 이름 기준 오름차순

-- limit 
select * from select_userinfo order by age desc limit 3;	#나이 많은 사람 3명 내림차순
select * from select_userinfo order by name desc limit 3;	#이름 내림차순 3명

select * from select_userinfo order by no desc limit 4;		# no가 높은 순으로 4명
select * from select_userinfo order by no desc limit 1,2;	# no가 두번째로 높은 순으로 2명

-- 1-3
use emp;

# function
#1. Number
#2. String
#3. Date
#4. if / case
use emp;

-- 1. Number(cell 올림, floor 내림, round 반올림, mod 나머지)

select ceil(1.1) '올림', floor(1.9) '내림', round(1.5) '반올림', mod(10,3) '나머지';

select 123.4578, round(123.4567) 'ROUND1', floor(123.4567/10)*10 'ROUND2', round(123.4567*10)/10 'ROUND3', round(123.4567*100)/100 'ROUND4';
select 123.4567, ceil(123.4578), floor(123.4567);

-- 2-1. basic
-- 1) length(문자열) #갯수구하기
select length("abc");

-- 2) upper/lower
select "abc",upper("aBc"), lower("aBc");

-- 3) instr 위치
select instr("abc","b"), instr("abc","ab") 'ab의 위치', instr("abc","ac") 'ac의 위치';

-- 4) left, right, substr 문자열 일부분
select left("abc",2);
select right("abc",2);
select substr("abcde",2,3);

-- 5) 문자열 연결
select concat("hello"," mysql");

-- 6) trim
select trim("   a   b              c      ");

select concat("#",trim(" a b c "),"#") t1, 
	concat("#",ltrim(" a b c "),"#") t2, 
	concat("#",rtrim(" a b c "),"#") t3 ;

-- 7) replace 문자열에서 특정값 바꾸기
select replace("hello sally", "sally", "alpha");

-- 8) repeat 문자열 반복
select repeat('*',5);

-- 9 빈칸 채우기
select lpad("abc",10,"#"), rpad("abc",10,"#");

#--------------------------------------------
#3. date
#--------------------------------------------

-- 1) 
select now(); -- 시스템시간
select current_time(); -- 현재시간

-- 2) 요일 (0 = 월, 1=화,,6=일)
select weekday(now()); -- 4 금요일
select weekday("2025-03-21");

-- 3) 날짜형식 dat_format (날짜지정, "%y-%m-%d")

select date_format("2025-03-21","%y-%m-%d");
select date_format(now(),"%h:%i:%s");

-- 4) 100일전/후
select date_add(now(), interval -10 day);
select date_add(now(), interval 10 day);
select date_add(now(), interval - 3 hour);

-- 5) 
select datediff("2025-05-10","2025-05-27");
select datediff("2025-04-17",now());
select timestampdiff(hour, "2025-03-22","2025-03-21");


-- if(조건, 참, 거짓)
-- 다형식
/*	case
	when 조건1 then 상태1
    when 조건2 then 상태2
    else 모든조건에 해당하지 않을 때, 생략가능
    end

*/

-- 1-1
select no, if(no=1,"1이다","1이 아니다");

-- 1-2
select no, if(no>1,"1보다크다","1보다작다") from control;

-- 1-3. case when/then end
select no,case when no=1 then '1이다' when no=2 then '2이다' when no=3 then '3이다' else '123아니당' end  from control;

-- 1-4 2이다 크다 작다
SELECT no, 
       CASE 
           WHEN no > 2 THEN '크다'
           WHEN no = 2 THEN '2이다'
           WHEN no < 2 THEN '작다'
       END
FROM control;







-- 1) length(문자열)  갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을문자열)  위치  , 못찾으면 0

























