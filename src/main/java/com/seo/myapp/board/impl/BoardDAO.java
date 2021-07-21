package com.seo.myapp.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.JDBC;

@Repository("boardDAO")
public class BoardDAO {

	private Connection conn=null;
	private PreparedStatement pstmt=null;

	public void insertBoard(BoardVO vo) {
		String sql="insert into board (bid,title,theme,content) values((select nvl(max(bid),0)+1 from board),?,?,?)";

		System.out.println("insertBoard() 수행중");
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getTheme());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
	}
	
	public void updateBoard(BoardVO vo) {
		String sql="update board set title=?, content=? where bid=?";
		System.out.println("updateBoard() 수행중");
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getBid());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
	}
	
	public void deleteBoard(BoardVO vo) {
		String sql="delete board where bid=?";
		System.out.println("deleteBoard() 수행중");
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBid());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
	}
	
	public BoardVO getBoard(BoardVO vo) {
		String sql="select * from board where bid=?";
		System.out.println("getBoard() 수행중");
		BoardVO data=null;
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBid());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				data=new BoardVO();
				data.setContent(rs.getString("content"));
				data.setBid(rs.getInt("bid"));
				data.setTitle(rs.getString("title"));
				data.setWdate(rs.getDate("wdate"));
				data.setTheme(rs.getString("theme"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
		return data;
	}
	
	public List<BoardVO> getBoardList() {
		String sql="select * from board order by bid desc";
		System.out.println("getBoardList() 실행중");
		List<BoardVO> datas=new ArrayList();
		conn=JDBC.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				BoardVO data=new BoardVO();
				data.setContent(rs.getString("content"));
				data.setBid(rs.getInt("bid"));
				data.setTitle(rs.getString("title"));
				data.setWdate(rs.getDate("wdate"));
				data.setTheme(rs.getString("theme"));
				datas.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBC.close(conn, pstmt);
		}
		return datas;
	}
}
