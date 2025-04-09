package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Team;
import com.company.boot001.myjpa.TeamRepository;

@SpringBootTest
class Boot001ApplicationTests {
	@Autowired TeamRepository teamRepository;  //스프링이 TeamRepository라는 인터페이스를 객체로 구현해줄꺼 그 뒤에는 변수명
	
	// teamRepository.save(insert, update) / delete-delete
	// teamRepository.findAll() select / teamRepository.findById select
	// 테이블까지 만들었으면 create말고 update로 바꾸기 properties.
	
	@Disabled 
	@Test  
	public void insert() {
		Team team = new Team();                   //팀객체 만들고
		team.setName("avengers");                   //값 넣어주고
		teamRepository.save(team);                //저장
	} //end insert()
	
	@Disabled 
	//@Test 
	public void selectAll() {
		List<Team> list = teamRepository.findAll();     //팀 객체 담을 리스트 만들고 selectall
		System.out.println(list.size());                //확인
		System.out.println(list.get(0).getName());
	}//end selectAll()
	
	@Disabled 
	//@Test
	public void selectOne() {
		 Team team = teamRepository.findById(2L).get();                 // 팀 객체 만들고 값찾기
		 System.out.println("id = " + team.getId());                    // 그 값 저장된것만 뚝딱 출력
		 System.out.println("name = " + team.getName());                //
		 System.out.println("createDate = " + team.getCreateDate());    //
	}//end selectOne()
	
	//@Disabled  
	//@Test  
	public void update2() {
		 Team team = teamRepository.findById(2L).get(); //수정할 거 가져오고!
		 team.setName("updateTest");                    //수정해버리고!
		 teamRepository.save(team);                     //저장해버리고!
		 System.out.println(team.getId());              //확인
		 System.out.println(team.getName());            //확인
	}// end update()
	
	@Disabled  
	//@Test
	public void update() {
		//Optional - null값 안전보장
		Optional<Team> findTeam = teamRepository.findById(2L);
		System.out.println(findTeam.isPresent()); // .isPresent() 존재하냐
		
		Team team = findTeam.get();
		team.setName("test2");
		teamRepository.save(team);
		
		System.out.println(team.getId()+" "+team.getName());
		
	}
	
	
	@Disabled
	//@Test
	public void delete2() {
		Team team = teamRepository.findById(1L).get();   //  삭제할 데이터 찾기
		teamRepository.delete(team);                     //  삭제
	}//end delete()
	
	@Disabled
	//@Test
	public void delete() {
		Optional<Team> findTeam = teamRepository.findById(1L);
		System.out.println(findTeam.isPresent()); // .isPresent() 존재하냐
		
		Team team = findTeam.get();
		teamRepository.delete(team);
		
		
	}

}


//crud1. insert into team (name) values (?)
//crud2. select * from team / select * from team where id=?
//crud3. update team set name=? where id=?
//crud4. delete from team where id=?
/*
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| create_date | datetime(6)  | YES  |     | NULL    |                |
| name        | varchar(255) | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
*/