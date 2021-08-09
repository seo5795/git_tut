//package com.seo.myapp.reply.impl;
//
//
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.seo.myapp.JDBC;
//import com.seo.myapp.reply.ReplyVO;
//
//
//@Repository("replyDAO")
//public class ReplyDAO {
//	private Connection conn=null;
//	private PreparedStatement pstmt=null;
//
//	public void insertReply(ReplyVO vo) {
//		String sql="insert into board (pid,writer,rcontent) values((select nvl(max(pid),0)+1 from reply),?,?)";
//
//		System.out.println("insertReply() 수행중");
//		conn=JDBC.getConnection();
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(2, vo.getCnt());
//			pstmt.setString(2, vo.getRcontent());
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			JDBC.close(conn, pstmt);
//		}
//	}
//	
//	public void updateReply(ReplyVO vo) {
//		String sql="update reply set rcontent=? cnt=? where pid=?";
//		System.out.println("updateReply() 수행중");
//		conn=JDBC.getConnection();
//		try {
//			//들어온 값이 cnt인지 content인지에 따라 다르게
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, vo.getRcontent());
//			pstmt.setInt(2, vo.getPid());
//			
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			JDBC.close(conn, pstmt);
//		}
//	}
//	
//	public void deleteReply(ReplyVO vo) {
//		String sql="delete board where pid=?";
//		System.out.println("deleteReply() 수행중");
//		conn=JDBC.getConnection();
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, vo.getPid());
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			JDBC.close(conn, pstmt);
//		}
//	}
//
//	public List<ReplyVO> getReplyList(ReplyVO vo) {
//		String sql="select * from reply order by pid desc";
//	
//		System.out.println("getReplyist() 실행중");
//		List<ReplyVO> datas=new ArrayList();
//		conn=JDBC.getConnection();
//		try { 
//			pstmt=conn.prepareStatement(sql);
//		
//			ResultSet rs=pstmt.executeQuery();
//			while(rs.next()) {
//				ReplyVO data=new ReplyVO();
//				data.setPid(rs.getInt("pid"));
//				data.setWriter(rs.getString("writre"));
//				data.setRcontent(rs.getString("rcontent"));
//				data.setCnt(rs.getInt("cnt"));
//				datas.add(data);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			JDBC.close(conn, pstmt);
//		}
//		return datas;
//	}
//}
