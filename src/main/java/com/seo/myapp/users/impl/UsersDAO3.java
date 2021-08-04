package com.seo.myapp.users.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.users.UsersVO;

@Repository
public class UsersDAO3 {
	@PersistenceContext
	private EntityManager em;
	
	public void insertUsers(UsersVO vo) {
		em.persist(vo);
	}
	public void updateUsers(UsersVO vo) {
		em.merge(vo);	
	}
	public void deleteUsers(UsersVO vo) {
		em.remove(vo);
	}
	public UsersVO getUsers(UsersVO vo) {
		return (UsersVO)em.find(UsersVO.class, vo.getId());			
	}

}
