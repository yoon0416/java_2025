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



