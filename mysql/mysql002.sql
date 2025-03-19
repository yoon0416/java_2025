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







