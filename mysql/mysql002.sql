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






















