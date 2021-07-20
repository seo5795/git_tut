package com.seo.view.board;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;

public class UpdateBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("updateBoardController 실행중");

		String bid = req.getParameter("bid");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setBid(Integer.parseInt(bid));
		vo.setTitle(title);
		vo.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(vo);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.do");
		return mav;
	}

}
