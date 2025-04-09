package com.company.boot004.member;

//import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface MemberRepository extends JpaRepository<Member,Long>{
	Optional<Member>	findByUsername(String username);
	/*
	    //전체조회
		@Query("select m from Member m order by id desc")
		List<Member> findAllbyorderBydesc();

		//삭제
		@Modifying     
		@Transactional
		@Query("delete from Member m where m.id= :id and m.password = :password ")
		int deleteByIdAndPassword( @Param("id") Long id, @Param("password") String password );
	
		//id 비번 맞으면 이메일 유저네임 바꾸기
		@Modifying    
		@Transactional
		@Query("update Member m set m.email = :email, m.username = :username where m.id = :id and m.password = :password")
		int updateMemberByIdAndPassword(@Param("id") Long id,
		                            @Param("password") String password,
		                            @Param("email") String email,
		                            @Param("username") String username); */
		
			//id pw 같은 유저 비번바꾸기
		@Modifying    
		@Transactional
		@Query("update Member m set m.password = :password where m.password = :old and m.id = :id")
		int updateByIdAndPassword(
		    @org.springframework.data.repository.query.Param("password") String password,
		    @org.springframework.data.repository.query.Param("old") String old,
		    @org.springframework.data.repository.query.Param("id") Long id
		);

		
}

/*
mysql> desc member;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | bigint       | NO   | PRI | NULL    | auto_increment |
| email    | varchar(255) | YES  | UNI | NULL    |                |
| password | varchar(255) | YES  |     | NULL    |                |
| udate    | datetime(6)  | YES  |     | NULL    |                |
| username | varchar(255) | YES  | UNI | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)
 */
//Q1. crud sql구문적기

// insert into member (username, password, email) values (?,?,?)  --save
// select * from member               							  --findAll
// select * from member where id=?     						      --findById
// update member set email=? , username=?, password=? where id=?  --save 
// delete from member where id=?                                  --delete 

//Q2.@Query id와 password가 같은 유저의 비밀번호 변경







