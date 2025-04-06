package com.company.service;

import java.util.List;
import com.company.dto.BoardDto;


public interface BoardService {
   public  int insert(BoardDto dto); //글쓰기기능
   
   public  int update(BoardDto dto); //수정기능
   public  BoardDto updateFrom(int bno); //해당번호 글 수정폼 (해당글번호보기)
   
   public  int delete(BoardDto dto); //글 삭제기능
   
   public  BoardDto detail(int bno); //상세보기
   public  List<BoardDto> selectAll(); //전체데이터 가져오기
}
