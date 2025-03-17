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
      > da선택확인 (use db명;)
      > create database db명;
      > show databases;
      > drop database db명;
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






---
---
Q. 데이터 / 정보구분 <br></br>
1-1.  데이터 - 1년동안 월간 우산 판매량을 조사 했습니다.  <br></br>
1-2.  정보 - 이 조사표를 가지고 처리해서 우산은 겨울보다 여름에 잘 팔린다는 결과를 얻었습니다.
        
        
        
        
        
