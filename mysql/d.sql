select * from select_emp where job='SALESMAN';;

select ename, mgr,sal from select_emp;

select ename, mgr,sal from select_emp where job='SALESMAN';

select * from select_emp order by sal desc;

select * from select_emp order by job asc ,sal asc;

select ename, sal, empno from select_emp order by empno desc;

select DISTINCT job from select_emp;

select empno as '사원번호',ename as '이름', job as '담당업무' from select_emp;

Q10
select * from select_emp order by sal asc;

 select * from select_emp order by sal desc;

select * from select_emp order by deptno asc,sal desc;

select empno, ename, job, mgr, hiredate, sal, comm, deptno from select_emp order by deptno desc, job desc, sal desc, empno asc;

