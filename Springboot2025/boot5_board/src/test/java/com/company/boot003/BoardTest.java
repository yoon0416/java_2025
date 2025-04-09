package com.company.boot003;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.dto.Board;
import com.company.boot003.dto.BoardRepository;
import com.company.boot003.dto.Member;
import com.company.boot003.dto.MemberRepository;

@SpringBootTest
public class BoardTest {

    @Autowired BoardRepository boardRepository;
    @Autowired MemberRepository memberRepository;
    
    @Test @Disabled
    public void insertB() {
        Member member = new Member(); member.setId(2L);
       
        Board board = new Board();
        board.setBtitle("title-3");
        board.setBcontent("content-3");
        board.setBpass("1234");
        board.setBfile("3.jpg");
        
        try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) { e.printStackTrace(); }
        board.setMember(member);
        boardRepository.save(board);
    }

	@Test @Disabled 
	public void selectAll() { //전체 조회 후 모두 출력
		List<Board> board = boardRepository.findAll();
		for (Board b : board) {
		    System.out.println(b.getBtitle()+" "+b.getBcontent());
		}
	}
    
    @Test @Disabled
    public void selectOneB() {
        Board board = boardRepository.findById(5L).orElseThrow(); //값 비어있으면 예외 던지는 메서드 값 없으면 정상실행이 아닌 에러
        System.out.println(board.getBtitle());					 //orElseThrow(); 
    }

    @Test @Disabled
    public void updateB() {
    	Optional<Board> findBoard = boardRepository.findById(5L); //값 비어있으면 그냥 아무것도 실행안됨 에러는 아님
    	if (findBoard.isPresent()) {
    	    Board board = findBoard.get();
    	    board.setBtitle("update title");
    	    board.setBcontent("update content");
    	    boardRepository.save(board);
    	}
    }

    @Test @Disabled
    public void deleteB() {
        boardRepository.deleteById(4L);
    }
}
