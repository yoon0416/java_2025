package com.company.dto;

import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
@RequiredArgsConstructor //final TestDto(string) 클래스 안에 final 붙은 필드만 골라서 생성자를 자동으로 만들
// 절대로 비워두면 안되고 초기화는 한번해야함 그리고 값 변경 불가능 할 때 final하고 생성자 만듦 / ex 주민등록번호
//그럼 board에서 no를 프라이머리키로 했다고 가정하고 그걸 받을예정 그럼 no에 final해야겠네

public class TestDto {
	private final String company;
	private int year;
}
