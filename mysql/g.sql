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

