package com.company.boot004;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.company.boot004.member.Member;
import com.company.boot004.member.MemberRepository;

@SpringBootTest
class Boot004SecurityApplicationTests {

	@Autowired MemberRepository memberRepository;
	@Autowired private PasswordEncoder passwordEncoder;
	
	@Test @Disabled
	public void insert() { 
		Member member = new Member();
		member.setEmail("ccc@gmail.com");
		member.setPassword("1111");
		member.setUsername("ccc");
		memberRepository.save(member); 
	}
	
	@Test @Disabled 
	void findAll() {
		List<Member> members = memberRepository.findAll();
		/*
		 * for (Member m : members) { System.out.println(m); //toString 넣음 }
		 */
		System.out.println(members);
	}

	@Test @Disabled
	void findId() {
		Member member = memberRepository.findById(1L).get();
		System.out.println("id = " + member.getId());
		System.out.println("UserName = " + member.getUsername());
		System.out.println("Email = " + member.getEmail());
		System.out.println("Date = " + member.getUdate());
	}

	@Test @Disabled 
	void update() { 
		Optional<Member> findMember = memberRepository.findById(2L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			member.setEmail("bbb@gmail.com");
			member.setUsername("bbb");
			memberRepository.save(member);
		}
	}
	@Test @Disabled
	void findUsername() {
		System.out.println( memberRepository.findByUsername("aaa").get() );
	}

	@Test @Disabled 
	void updatePassword() { 
		memberRepository.updateByIdAndPassword("1234", "2222", 2L);
	}
	
	@Test @Disabled 
	void delete() {
		Optional<Member> findmember = memberRepository.findById(1L);
	    if (findmember.isPresent()) {
	        Member member = findmember.get();
	        memberRepository.delete(member);
	    }
	}

	

}
