package com.company.boot003.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board,Long>{

	//1. @Query 엔티티 테이블명 사용 : Board - select 기본작업
	//@Query(value="select * from Board order by id desc", nativeQuery = true)
	@Query("select b from Board b order by id desc")
	List<Board> findAllbyorderBydesc();
	
	
	//.2 insert, update, delete - @Modifying , @Transational ,@Query
	@Modifying     //2-1. 삽입, 수정, 삭제 쿼리는 변경작업 즉 select아니라고 명시
	@Transactional //2-2. 롤백 활성화 (에러 중간에 나면 그 전꺼 처리 안하게)
	@Query("delete from Board b where b.id= :id and b.bpass = :bpass ")
	int deleteByIdAndaBpass( @Param("id") Long id, @Param("bpass") String bpass );
	//2-3 @Param("id") 쿼리의 변수명과 동일 하면 생략가능
	//2-4 deleteByIdAndBpass( Board board ) x 객체파라미터 지원안함
	
	@Modifying     // 2-1. 삽입, 수정, 삭제 쿼리는 변경작업 즉 select아니라고 명시
	@Transactional // 2-2. 롤백 활성화 (에러 중간에 나면 그 전꺼 처리 안하게)
	@Query("update Board b set b.btitle = :btitle, b.bcontent = :bcontent where b.id = :id and b.bpass = :bpass")
	int updateBoardByIdAndBpass(@Param("id") Long id,
	                            @Param("bpass") String bpass,
	                            @Param("btitle") String btitle,
	                            @Param("bcontent") String bcontent);
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("insert into ") int intsertt()
	 */
	
}
