package com.company.dao;

import java.util.List;
import com.company.dto.BoardDto;

public interface BoardDao {
    int insert(BoardDto dto);
    int update(BoardDto dto);
    int delete(int no);
    BoardDto selectOne(int no);
    List<BoardDto> selectAll();
    int updateBhit(int no); // ��ȸ�� ������ �޼��� �߰�
}
