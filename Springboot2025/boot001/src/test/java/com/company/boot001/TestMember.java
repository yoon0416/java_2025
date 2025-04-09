package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.dto.Member;
import com.company.boot001.dto.MemberRepository;
import com.company.boot001.myjpa.Team;

@SpringBootTest
public class TestMember {
	@Autowired MemberRepository memberRepository;  
	
	@Test @Disabled 
	public void insert() {
		Team team = new Team();
		team.setId(1L); //# 만약 2L로 하면 오류남 2L아직 안만들었기 때문
		
		Member member = new Member();                   
		member.setName("second");                 
		member.setAge(22);
		member.setTeam(team);
		memberRepository.save(member);                
	} //end insert()

	
	@Test @Disabled 
	public void selectAll() { //전체 조회 후 모두 출력
		List<Member> members = memberRepository.findAll();
		for (Member m : members) {
		    System.out.println(m);
		}
	}//end selectAll2 전체조회
	
	
	@Test @Disabled 
	public void selectOne() { //하나만 출력
		Member member = memberRepository.findById(2L).get();               
		System.out.println("id = " + member.getId());                    
		System.out.println("name = " + member.getName());             
		System.out.println("age = "+ member.getAge());
		System.out.println("createDate = " + member.getCreateDate()); 
	}//end selectOne
	
	
	@Test @Disabled 
	public void update() {
		//Optional - null값 안전보장
		Optional<Member> findMember = memberRepository.findById(1L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			member.setAge(1);
			member.setName("HI");
//			member.setTeam(null); team값 설정안하면 기존에 있었던 값
			memberRepository.save(member);
		}
	}//end update
	
	
	@Test @Disabled
	public void delete() {
	    Optional<Member> findmember = memberRepository.findById(1L);
	    if (findmember.isPresent()) {
	        Member member = findmember.get();
	        memberRepository.delete(member);
	    }
	}//end delete

	
	
		
	
}//end class
