package com.seo.myapp.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.util.SqlSessionFactoryBean;

@Repository
public class BoardDAO {
	
	@Autowired
	private  SqlSessionTemplate mybatis;
	
	public BoardDAO() {
		System.out.println("BoardDAO 실행중");
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("insertBoard 실행중3");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("updateBoard 실행중3");
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard 실행중 3");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("getBoard 실행중 3");
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("getBoardList 실행중 3");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}
