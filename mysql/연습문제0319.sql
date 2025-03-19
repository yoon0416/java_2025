use milk;
show tables;
desc mlik;
select*from mlik;
alter table mlik drop mnum;
alter table mlik drop mtotal;

 #Q1.  4 , melon ,  5000 데이터를 추가하시오.
insert into mlik (mno,mname,mprice) values (4,'melon',5000);

 #Q2.  no가 4번인 데이터의 mprice를 1500로 변경하시오.
update mlik set mprice=1500 where mno=4;

 #Q3.  no가 4번이고 name이 melon인데이터를 삭제하시오.
delete from mlik where mno=4 and mname='melon';

 #Q4.  milk 데이터를 출력하시오.
select*from mlik;


#crud 복습문제

#userinfo 복사

use mbasic;
 create table userinfo_ex select * from userinfo;
 alter table userinfo_ex add primary key(no);
 alter table userinfo_ex modify no int not null auto_increment;

#실습

select* from userinfo_ex;

#Q1.
insert into userinfo_ex values (5,'fifth',55);
insert into userinfo_ex (no,name,age) values (5,'fifth',55);

#Q2.
UPDATE userinfo_ex SET age = 10;

#Q3.
update userinfo set name='third', age=33 where no=3 and age=10;

#Q4.
delete from userinfo_ex where no=3 and age=10

#Q5.
delete from userinfo_ex;

