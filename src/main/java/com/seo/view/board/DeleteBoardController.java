package com.seo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;



public class DeleteBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("DeleteBoardController 실행중");

		String bid = req.getParameter("bid");

		BoardVO vo = new BoardVO();
		vo.setBid(Integer.parseInt(bid));
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(vo);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.do");
		return mav;
	}

}
