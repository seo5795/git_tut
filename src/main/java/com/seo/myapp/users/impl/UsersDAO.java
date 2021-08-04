package com.seo.myapp.users.impl;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.seo.myapp.users.UsersVO;


@Repository("usersDAO")
public class UsersDAO {
	
	private SqlSessionTemplate mybatis;
	
	
	public void insertUsers(UsersVO vo) {
		mybatis.insert("UsersDAO.insersUsers", vo);
		
	}
	
	public UsersVO getUsers(UsersVO vo) {
		System.out.println("getUsers DAO3 실행중");
		return (UsersVO)mybatis.selectOne("UsersDAO.getUsers", vo);
	}
	
	
	public void updateUsers(UsersVO vo) {
		mybatis.update("UsersDAO.updateUSers", vo);
		
	}
	
	public void deleteUsers(UsersVO vo) {
		mybatis.delete("UsersDAO.deleteUSers", vo);
	}
	
	//updateMember(),deleteMember()
}