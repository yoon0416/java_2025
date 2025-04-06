package com.company.service;

import java.util.List;
import com.company.dto.BoardDto;


public interface BoardService {
   public  int insert(BoardDto dto); //�۾�����
   
   public  int update(BoardDto dto); //�������
   public  BoardDto updateFrom(int bno); //�ش��ȣ �� ������ (�ش�۹�ȣ����)
   
   public  int delete(BoardDto dto); //�� �������
   
   public  BoardDto detail(int bno); //�󼼺���
   public  List<BoardDto> selectAll(); //��ü������ ��������
}
