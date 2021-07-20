package com.seo.myapp.users.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.seo.myapp.JDBC;
import com.seo.myapp.users.UsersVO;

@Repository("usersDAO")
public class UsersDAO {
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	
	public void insertUsers(UsersVO vo) {
		String sql="insert into users (id,pw,name,role,mail) values(?,?,?,?,?)";
		System.out.println("insertUsers() 수행중");
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getRole());
			pstmt.setString(5, vo.getMail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
	}
	
	public UsersVO getUsers(UsersVO vo) {
		String sql="select * from users where id=? and pw=?";
		System.out.println("getUsers() 수행중");
		UsersVO data=null;
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				data=new UsersVO();
				data.setId(rs.getString("id"));
				data.setPw(rs.getString("pw"));
				data.setName(rs.getString("name"));
				data.setRole(rs.getString("role"));
				data.setMail(rs.getString("mail"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
		return data;
	}
}