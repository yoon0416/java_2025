package com.company.boot003.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.boot003.dto.Board;
import com.company.boot003.dto.BoardRepository;

@Service
public class BoardSerivce{
	
	@Autowired BoardRepository boardRepository;

	public List<Board> findAll() {
		// return boardRepository.findAll();
		return boardRepository.findAllbyorderBydesc();
	}

	public Board find(Long id) {
        Board board = boardRepository.findById(id).get();
        
        board.setBhit(board.getBhit()+1); //기존조회수 +1
        boardRepository.save(board);
		return board;
	}

	public void insert(Board board,Long member_id ) {
		try { board.setBip(InetAddress.getLocalHost().getHostAddress());}
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}

	public int update(Board board) {
		return boardRepository.updateBoardByIdAndBpass(board.getId(), board.getBpass(), board.getBtitle(), board.getBcontent());
	}

	public int delete(Board board) {
		// boardRepository.delete(board); 기본 : delete from board where id=?
		return boardRepository.deleteByIdAndaBpass(board.getId(), board.getBpass());
		
	}
	
	
}
