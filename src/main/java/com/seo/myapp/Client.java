package com.seo.myapp;

import java.util.List;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;



public class Client {
	public static void main(String[] args) {
		BoardDAO boardDAO=new BoardDAO();
		BoardVO vo=new BoardVO();
		vo.setBid(1);
		vo=boardDAO.getBoard(vo);
		
		System.out.println(vo);
		System.out.println(vo.getTheme());
		
		boardDAO.deleteBoard(vo);
		
		vo.setTitle("파이리");
		vo.setTheme("이상해씨");
		vo.setContent("내용내용");
		vo.setFileName("123");
		boardDAO.insertBoard(vo);
		
		vo.setSearch("TITLE");
		vo.setSearchContent("a");
		List<BoardVO> datas=boardDAO.getBoardList(vo);
		System.out.println("==검색 결과 목록==");
		for(BoardVO data:datas) {
			System.out.println(data);
		}
	}
}

