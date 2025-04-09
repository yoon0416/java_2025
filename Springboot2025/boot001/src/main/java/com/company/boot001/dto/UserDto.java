package com.company.boot001.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter //게터 
@Setter //세터
@NoArgsConstructor //기본생성자
@ToString //투스트링
public class UserDto {
	private String name;
	private int age;
}


// com.회사명.프로젝트.개발단위 - @Controller / @Servlet / @Db관련