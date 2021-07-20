package com.seo.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;



public class GetBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("GetBoardController 수행중");

		String bid=req.getParameter("bid");
		BoardVO vo=new BoardVO();
		vo.setBid(Integer.parseInt(bid));

		BoardDAO dao=new BoardDAO();
		BoardVO v=dao.getBoard(vo);

		/*HttpSession session=req.getSession();
		session.setAttribute("v", v);*/
				
		ModelAndView mav=new ModelAndView();
		mav.addObject("v", v);
		mav.setViewName("board.jsp");
		return mav;
	}

}
