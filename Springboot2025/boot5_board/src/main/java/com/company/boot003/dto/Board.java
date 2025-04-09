package com.company.boot003.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Board {
	@Id //기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2. 숫자 자동증가
	private long id;
	
	@Column(length = 200)
	private String btitle;
	
	@Column(columnDefinition = "TEXT")
	private String bcontent;
	
	private String bfile;
	private String bip;
	private String bpass;
	@Column(nullable = true)
	private long bhit=0L;
	
	@Column(updatable = false)
	private LocalDateTime createDate = LocalDateTime.now();
	
	@ManyToOne
	private Member member;
	
}
