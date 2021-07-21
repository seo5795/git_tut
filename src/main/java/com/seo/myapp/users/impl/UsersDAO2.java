package com.seo.myapp.users.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.seo.myapp.JDBC;
import com.seo.myapp.board.BoardVO;
import com.seo.myapp.users.UsersVO;

@Repository("usersDAO2")
public class UsersDAO2 {
	
	@Autowired
	private JdbcTemplate jdbcTemlplate;
	
	public void insertUsers(UsersVO vo) {
		String sql="insert into users (id,pw,name,role,mail) values(?,?,?,?,?)";
		System.out.println("insertUsers() 수행중");
		jdbcTemlplate.update(sql, vo.getId(),vo.getPw(),vo.getName(),vo.getRole(),vo.getMail());
	}
	
	public UsersVO getUsers(UsersVO vo) {
		String sql="select * from users where id=? and pw=?";
		System.out.println("getUsers() 수행중");
		Object[] args= {vo.getId(),vo.getPw()};
		return jdbcTemlplate.queryForObject(sql, args,new UserRowMapper());
	}
	
	
	public void updateUsers(UsersVO vo) {
		String sql="update users set pw=?, name=?, mail? where id=?";
		System.out.println("updateUsers() 수행중");
		jdbcTemlplate.update(sql, vo.getPw(),vo.getName(),vo.getMail(),vo.getId());
		
	}
	
	public void deleteUsers(UsersVO vo) {
		String sql="delete users where id=?";
		System.out.println("deleteUsers() 수행중");
		jdbcTemlplate.update(sql, vo.getId());
	}
	
	//updateMember(),deleteMember()
}

class UserRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsersVO data=new UsersVO();
		data.setId(rs.getString("id"));
		data.setPw(rs.getString("pw"));
		data.setName(rs.getString("name"));
		data.setRole(rs.getString("role"));
		data.setMail(rs.getString("mail"));
		return data;
	}
	
	
}