package com.company.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor // 모든 매개변수 때려박는 생성자
@NoArgsConstructor // 기본생성자
@ToString
@EqualsAndHashCode
public class BoardDto {
    private int bno;
    private String bname;
    private String bpass;
    private String btitle;
    private String bcontent;
    private Timestamp bdate; // 자동입력이라 insert 시 생략 가능
    private int bhit;
    private String bip;


}
