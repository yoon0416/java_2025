package com.company.boot003;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.dto.Member;
import com.company.boot003.dto.MemberRepository;


@SpringBootTest
class Boot003ApplicationTests {
@Autowired MemberRepository memberRepository;  
	
	@Test @Disabled 
	public void insert() {
		Member member = new Member();
		member.setName("create 확인해라");
		member.setAge(33);
		memberRepository.save(member);
		
	} //end insert()

	@Test @Disabled 
	public void selectAll() { //전체 조회 후 모두 출력
		List<Member> members = memberRepository.findAll();
		for (Member m : members) {
		    System.out.println(m);
		}
	}
	
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
			member.setAge(11);
			member.setName("frist");
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
	
	
	
}
