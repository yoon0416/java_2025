package com.company.boot001.myjpa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Transient;
import javax.persistence.OneToMany;

import com.company.boot001.dto.Member;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Team {
	@Id //1. 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2. 숫자 자동증가
	private Long id;
	private String name;
	
	@Column(updatable = false) //수정못하게	
	private LocalDateTime createDate = LocalDateTime.now();
	
	//mappedBy 주인, 부모, 부모가 있으면 참조할 수 있게 .... 자식
	@OneToMany(mappedBy = "team", cascade = CascadeType.REMOVE )
	List<Member> member=new ArrayList<>();
	
	
	
	
//	@Transient //3. 컬럼 인식 못하게 
	//"기능적으로는 사용해야 하는데, DB에 저장하면 안 되는 예민한 것들" 비번 확인등
//	private String email;
}
