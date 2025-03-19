#초기설정
use emp;
desc emp;
create table select_emp select * from emp;

#1번
select*from select_emp;

#2번
select*from select_emp where deptno = 30;

#3번
select*from select_emp where deptno = 30 and job ='SALESMAN';	

#4번
select*from select_emp where deptno=30 or job='CLERK';

#5번
select*from select_emp where sal*12=36000;

#6번
select*from select_emp where sal >=3000;

#7번
select*from select_emp where ename >= 'F';

#8번
select*from select_emp where ename < 'FORD';

#9번
select*from select_emp where sal != 3000;

#10번
select*from select_emp where sal <> 3000;

#11번
select*from select_emp where not sal=3000;

#12번
select*from select_emp where job='MANAGER' or job = 'SALESMAN' or job = 'CLERK';

#13번
select*from select_emp where job in ('MANAGER','SALESMAN','CLERK');

#14번
select*from select_emp where job!='MANAGER' and job != 'SALESMAN' and job != 'CLERK';
select*from select_emp where job<>'MANAGER' and job <> 'SALESMAN' and job <> 'CLERK';

#15번
select*from select_emp where job not in ('MANAGER','SALESMAN','CLERK'); 

#16번
select*from select_emp where sal >= 2000 and sal <=3000;

#17번
select*from select_emp where sal between 2000 and 3000;

#18번
select*from select_emp where sal not between 2000 and 3000;

#19번
select*from select_emp where not (sal >=2000  and sal <=3000);

#20번
select*from select_emp where empno=7499 and deptno=30;

#21번
select*from select_emp where deptno=20 or job='SALESMAN';

#22번
select*from select_emp where sal>=2500 and job='ANALYST';

#23번
select*from select_emp where deptno in (10,20);

#24번
select*from select_emp where deptno not in (10,20);

#25번
select*from select_emp where ename like 's%';

#26번
select*from select_emp where  ename like '_l%';

#27번
select*from select_emp where ename like '%am%';

#28번
select*from select_emp where ename not like '%am%';

#29번
#select ename as `사원이름`, sal as `급여`, sal*12+comm as `연봉`,comm as `커미션` from select_emp;
select ename as `사원이름`, sal as `급여`, sal*12+comm as `연봉`,comm as `커미션` from select_emp where ename like '%am%';

#30번
select*from select_emp where comm=null;

#31번
select*from select_emp where comm is null;

#32번
select*from select_emp where mgr is not null;

#33번 실행 ㄱ
# 의미하는 바 :어떤값인지 모르는 =,> 등가비교연산자 사용 불가
select*from select_emp where sal > null;

#34번  실행 ㄱ
# 의미하는 바 : sal > null 이거 false 비교해서
select*from select_emp where sal > null or comm is null;

#35번
select*from select_emp where ename like '%s';

#36번
select*from select_emp where deptno=30 and job='salesman';

#37번
select*from select_emp where deptno in (20,30) and sal > 2000;

#38번
select*from select_emp where not(sal>=2000 and sal<=3000);

#39번
select*from select_emp where deptno=30 and ename like '%e%' and not(sal>=1000 and sal<=2000);

#40번
select*from select_emp where comm is null and mgr is not null and job in ('MANAGER','CLERK') and ename not like '_l%';







