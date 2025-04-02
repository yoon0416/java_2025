package com.company.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.company.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

    @Autowired
    SqlSession sqlSession;

    private static final String namespace = "com.company.dao.BoardDao";

    @Override
    public int insert(BoardDto dto) {
        return sqlSession.insert(namespace + ".insert", dto);
    }

    @Override
    public int update(BoardDto dto) {
        return sqlSession.update(namespace + ".update", dto);
    }

    @Override
    public int delete(int no) {
        return sqlSession.delete(namespace + ".delete", no);
    }

    @Override
    public BoardDto selectOne(int no) {
        return sqlSession.selectOne(namespace + ".selectOne", no);
    }

    @Override
    public List<BoardDto> selectAll() {
        return sqlSession.selectList(namespace + ".selectAll");
    }

    @Override
    public int updateBhit(int no) {
        return sqlSession.update(namespace + ".updateBhit", no);
    }
}
