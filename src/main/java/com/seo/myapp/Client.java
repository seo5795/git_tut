package com.seo.myapp;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
				
		/*
		BoardService bs=(BoardService)factory.getBean("BoardService");
		BoardVO vo=new BoardVO();
		//vo.setId(100);
		vo.setContent("Ʈ�����");
		vo.setTitle("tx");
		vo.setWriter("�ǽ���");
		bs.insertBoard(vo);
		
		vo.setId(2);
		BoardVO data=bs.getBoard(vo);
		System.out.println(data);
		
		vo.setId(3);
		vo.setContent("aaa");
		vo.setTitle("banana");
		bs.updateBoard(vo);
						
		List<BoardVO> datas=bs.getBoardList(vo);
		for(BoardVO v:datas) {
			System.out.println(v);
		}
		*/
		/*
		UsersService us=(UsersService)factory.getBean("UsersService");
		UsersVO vo=new UsersVO();
		vo.setId("admin");
		vo.setPassword("1234");
		UsersVO data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}
		System.out.println();
		System.out.println();
		
		
		vo.setId("kim");
		vo.setPassword("1234");
		data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}
		System.out.println();
		System.out.println();
		
		vo.setId("admin");
		vo.setPassword("12345");
		data=us.getUsers(vo);
		if(data==null) {
			System.out.println("�ش� ID ����!");
		}
		else {
			System.out.println("���: "+data);
		}
		*/
		
		factory.close();
	}
}

