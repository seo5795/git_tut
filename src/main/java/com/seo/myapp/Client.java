package com.seo.myapp;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.seo.myapp.board.BoardService;
import com.seo.myapp.board.BoardVO;



public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
				
		BoardService bs=(BoardService)factory.getBean("BoardService");
		BoardVO vo=new BoardVO();
		vo.setTitle("title");
		vo.setTheme("talk");
		vo.setContent("Content");
		bs.insertBoard(vo);
		
		factory.close();
	}
}

