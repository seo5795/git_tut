package com.seo.myapp.users.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.seo.myapp.JDBC;
import com.seo.myapp.users.UsersVO;
import com.seo.myapp.util.SqlSessionFactoryBean;

@Repository("usersDAO3")
public class UsersDAO3 {
	
	private SqlSession mybatis;
	
	public UsersDAO3(){
		mybatis=SqlSessionFactoryBean.getSqlSessionInstace();
	}
	public void insertUsers(UsersVO vo) {
		mybatis.insert("UsersDAO.insersUsers", vo);
		mybatis.commit();
	}
	
	public UsersVO getUsers(UsersVO vo) {
		return (UsersVO)mybatis.selectOne("UsersDAO.getUsers", vo);
	}
	
	
	public void updateUsers(UsersVO vo) {
		mybatis.update("UsersDAO.updateUSers", vo);
		mybatis.commit();
	}
	
	public void deleteUsers(UsersVO vo) {
		mybatis.delete("UsersDAO.deleteUSers", vo);
	}
	
	//updateMember(),deleteMember()
}