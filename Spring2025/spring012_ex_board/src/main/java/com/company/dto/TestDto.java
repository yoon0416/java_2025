package com.company.dto;

import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
@RequiredArgsConstructor //final TestDto(string) Ŭ���� �ȿ� final ���� �ʵ常 ��� �����ڸ� �ڵ����� ����
// ����� ����θ� �ȵǰ� �ʱ�ȭ�� �ѹ��ؾ��� �׸��� �� ���� �Ұ��� �� �� final�ϰ� ������ ���� / ex �ֹε�Ϲ�ȣ
//�׷� board���� no�� �����̸Ӹ�Ű�� �ߴٰ� �����ϰ� �װ� �������� �׷� no�� final�ؾ߰ڳ�

public class TestDto {
	private final String company;
	private int year;
}
