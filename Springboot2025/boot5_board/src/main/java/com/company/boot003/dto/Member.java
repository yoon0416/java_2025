package com.company.boot003.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter 
@ToString( exclude = "boards" )
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2. 숫자 자동증가
	private long id;
	private int age;
	private LocalDateTime createDate = LocalDateTime.now();
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "member")
	private List<Board> boards = new ArrayList<>();
	
}
