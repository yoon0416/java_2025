package com.company.boot001.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.company.boot001.myjpa.Team;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Member {
	@Id //1. 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2. 숫자 자동증가
	private Long id;
	
	@Column(nullable=false)
	
	private LocalDateTime createDate = LocalDateTime.now();
	
	@Column(nullable = false) 
	private String name;
	
	private int age;
	
	@ManyToOne
	private Team team; 
	// 멤버는 하나의 팀을 가진다.
	// team_id 컬럼 자동으로 생김
}

/*
관계1
 팀(avengers)은 많은 멤버(iron, hulk,,,,,)를 가진다.  
 멤버는 하나의 팀을 가진다.
 
 team -|---------∈ member
  
 
 */





