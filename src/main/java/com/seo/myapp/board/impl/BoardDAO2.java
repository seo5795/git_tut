package com.seo.myapp.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.seo.myapp.board.BoardVO;

@Repository("boardDAO2")
public class BoardDAO2 {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertBoard(BoardVO vo) {
		String sql="insert into board (bid,title,theme,content) values((select nvl(max(bid),0)+1 from board),?,?,?)";

		System.out.println("insertBoard() 수행중");
		jdbcTemplate.update(sql,vo.getTitle(),vo.getTheme(),vo.getContent());
	}
	
	public void updateBoard(BoardVO vo) {
		String sql="update board set title=?, content=? where bid=?";
		System.out.println("updateBoard() 수행중");
		jdbcTemplate.update(sql, vo.getTitle(),vo.getContent(),vo.getBid());
	}
	
	public void deleteBoard(BoardVO vo) {
		String sql="delete board where bid=?";
		System.out.println("deleteBoard() 수행중");
		jdbcTemplate.update(sql, vo.getBid());
	}
	
	public BoardVO getBoard(BoardVO vo) {
		String sql="select * from board where bid=?";
		System.out.println("getBoard() 수행중");
		BoardVO data=null;
		Object[] args= {vo.getBid()};
		return jdbcTemplate.queryForObject(sql, args,new BoardRowMapper());
	}
	
	public List<BoardVO> getBoardList() {
		String sql="select * from board order by bid desc";
		System.out.println("getBoardList() 실행중");

		return jdbcTemplate.query(sql, new BoardRowMapper());
	}
}

class BoardRowMapper implements RowMapper{
	

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO data = new BoardVO();
		data.setContent(rs.getString("content"));
		data.setBid(rs.getInt("bid"));
		data.setTitle(rs.getString("title"));
		data.setWdate(rs.getDate("wdate"));
		data.setTheme(rs.getString("theme"));
		return data;
	}

}