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
@AllArgsConstructor // ��� �Ű����� �����ڴ� ������
@NoArgsConstructor // �⺻������
@ToString
@EqualsAndHashCode
public class BoardDto {
    private int bno;
    private String bname;
    private String bpass;
    private String btitle;
    private String bcontent;
    private Timestamp bdate; // �ڵ��Է��̶� insert �� ���� ����
    private int bhit;
    private String bip;


}
