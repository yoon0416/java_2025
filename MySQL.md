1. Mysql why?
   1. DBMS
      - Database Management System
      - 데이터베이스 관리 시스템
   2. Database
      - Data + base
      - 1) 데이터(값),  2) 정보(의미부여)
      - 0도(옷 따뜻하게),
   3. Databse
      - oracle, mysql, mssql
   4. Setting
      - 버전확인
      - mysql ver 8.0.41
   5. 설치확인
      - 접속 : 
        > `mysql -uroot -p` (-u 유저 / -p 패스워드)
      - 설정확인:
        > `status`

2. RDB
   1. RDBMS
      - Relational Database Management System
      - 관계형 데이터베이스 관리 시스템
      - 테이블 관계
   2. RDBMS 구성요소
      - **개체** ( Entity : Table )
      - **관계** ( Relational : 외래키 )
      - **속성** ( Attribute : 필드 )
     
   3. 데이터베이스언어
   - **정의어(DDL)** - create, alter, drop - CAD
   - **조작어(DML)** - insert, select, update, dedlete - CRUD
   - **제어어(DCL)** - grant, revoke
        
   4. 실습
      1. Database 만들기
         > da선택확인 (use db명;)<br></br>
         > create database db명;<br></br>
         > show databases;<br></br>
         > drop database db명;<br></br>
         > show tables; (테이블 보기)<br></br>
         >  desc 테이블명 (구조확인)
      3. TABLE
         - 저장소 안에 분류표
           > create table 테이블명( 필드1 자료형 속성, 필드2 자료형 속성 );
           > create table t1(name varchar(100), not null, age int );
         - 자료형
           1. **숫자** : `int`, `double`
           2. **문자** : `char` 고정문자열-y/n / `varchar` 가변형문자열 / `text`
           3. **날짜** : `date`, `datetime`, `timestamp`
         - 속성
           - **필수입력** : not null (아니오, 값없음) - 공간은 채우지만 빈칸허용 x
           - **숫자자동증가** : auto_increment(오라클에서 없음)
           - **기본키** : primary key
       
3. key
   1. 튜플(행,레코드,한명의정보)들을 구분할 수 있는 기준 필드(행,속성)
   2. 후보키 - 기본키로 사용할 수 있는 속성            no, email
   3. 기본키 - 후보키들 중에서 선택한 주키(main key)   no
   4. 대체키 - 후보키들 중에서 선택 안된 키            email
   5. 외래키 - 테이블과 테이블을 연결해주는 속성

4. alter
   - 데이터 정의: create, alter, drop
   - 문법 : alter table 테이블명 (add, drop, change, modify)
     - add : 추가 / 필드명 자료형 속성
     - drop : 삭제 / 필드명
     - modify : 필드 수정 / 수정할 필드명 자료형 속성
     - change : 필드 수정 / 수정할 필드명 새로넣을필드명 자료형속성
     - rename 새로운 테이블명
     > ALTER TABLE userinfo ADD email VARCHAR(50);
     > alter table userinfo modify email varchar(100) not null; 이메일필드 수정 자료형
     > alter table userinfo change email uemail varchar(100) not null; 이메일 이름
     > alter table userinfo drop uemail; 이메일 삭제
     > 

      
---
    no  name  age   email
    2, second, 10     second22@gmail.com 
    3, second, 10     second33@gmail.com

---

테이블은 행과 열로 이루어져있
mysql> select * from t2;
   열
   ↓
+----+--------+------+
| no | name   | age  |
+----+--------+------+
|  1 | first  |   10 |    ←  행(줄), 튜플, 레코드
|  2 | second |   20 |
|  3 | second |   20 |
+----+--------+------+
3 rows in set (0.00 sec)



---
---
Q. 데이터 / 정보구분 <br></br>
1-1.  데이터 - 1년동안 월간 우산 판매량을 조사 했습니다.  <br></br>
1-2.  정보 - 이 조사표를 가지고 처리해서 우산은 겨울보다 여름에 잘 팔린다는 결과를 얻었습니다.




---
---
▷QUESTION1.  다음 빈칸을 채우시오
1. RDBMS 는
     (RDBMS :Relational DataBase Management System) 
      *   관계형   데이터베이스   관리   시스템이라고 하며 
      *  테이블(table) 들의   테이블들의 관계를 나타냅니다. 
      *  사전정의된 관계로 데이터를 구성하는 정보모음을 말합니다.

2. 테이블  - 테이블은  (#1.    행     #2.  열      )로 이뤄져 있습니다.  
     1) (#3.     필드 또는 속성     )- 분류속성을 의미
         데이터의 종류, 특성,상태등을 정의하며  필드, 속성이라고도 합니다. 
     2) (#4.    튜플 또는 레코드  )- 관계된 데이터묶음
         튜플, 레코드라고 합니다.  

▷QUESTION2.  관계형데이터모델핵심구성요소를 적고 설명하시오.
- 테이블 (개체,entity)
- 관계 (Relationship : 연관관계, 외래키)
- 속성 Attribute, 필드, 열
▷QUESTION3.  스키마의 정의 및 세가지 종류를 적으시오.
- 외부스키마 - 사용자뷰
- 개념스키마 - 전체적인 뷰
- 내부스키마 - 저장스키마

▷QUESTION4. 데이터베이스 설계단계  다음 빈칸을 채우시오
1.  (#1.  개념적 설계    )  - 요구사항 분석 후 개념적 스키마 생성 
                       ( 개체-관계 다이어그램 - ERD )   
2. (#2.  논리적 설계   )  - ERD를  이용하여  
                      데이터베이스 스키마(테이블 구조도)를 설계
3. (#3.  물리적 설계   )  - DBMS가 제공하는 
                      물리적구조에 테이블 저장 구조 설계
                                   ( MYSQL, ORACLE,,,,)

▷QUESTION5. 다음 빈칸을 채우시오
데이터베이스 언어(Database Language)
- 데이터베이스를     구축하고 이용하기 위한 사용되는 언어입니다.
- 데이터 정의 언어, 데이터 조작 언어, 데이터 제어 언어로 구분됩니다.
1.  데이터 정의 언어
 - DDL (DATA DEFINITION LANGUAGE) 
-  데이터베이스객체(테이블, 뷰, 인덱스....)의 구조를 정의
-  종류 (#1.                  , #2.                  ,   #3.                    )

2.  데이터 조작 언어
- DML (DATA MANIPULATION LANGUAGE) 
-  실제 데이터를 조작하는 언어
-  종류 (#4.                     , #5.                    , #6.                       , #7.                     )

3.  데이터 제어 언어
-  DCL (DATA CONTROL LANGUAGE) 
-  데이터베이스 사용자의 권한을 제어
-  종류 (#8.                 , #9.                           ) 
출처: https://hi-sally03915.tistory.com/1658 [:DB:DBIG:티스토리]

        
        
        
        
        
