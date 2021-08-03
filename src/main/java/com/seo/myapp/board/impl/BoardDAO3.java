package com.seo.myapp.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.seo.myapp.board.BoardVO;

@Repository
public class BoardDAO3 {
	@PersistenceContext // 스프링 컨테이너가 em 객체를 생성,관리할수있도록 @ 설정
	private EntityManager em;

	public void insertBoard(BoardVO vo) {
		em.persist(vo);
	}
	public void updateBoard(BoardVO vo) {
		em.merge(vo);
	}
	public void deleteBoard(BoardVO vo) {
		em.remove(vo);
	}
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)em.find(BoardVO.class, vo.getBid());
	}
	public List<BoardVO> getBoardList(BoardVO vo) {
		// JPA에서의 sql문
		return em.createQuery("from BoardVO b order by b.bid desc").getResultList();
	}
}
