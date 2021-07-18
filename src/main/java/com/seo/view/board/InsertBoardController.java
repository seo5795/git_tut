package com.seo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;

public class InsertBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("게시글 등록 컨트롤러");

		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");

		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setTheme(writer);
		vo.setContent(content);
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

}
