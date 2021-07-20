package com.seo.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;


public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("GetBoardListController 실행중");

		BoardVO vo=new BoardVO();
		BoardDAO dao=new BoardDAO();

		List<BoardVO> boardList=dao.getBoardList(); // 추후에 검색기능을 추가해볼수있겠다!
		//req.setAttribute("boardList",boardList);
		///HttpSession session=req.getSession(); // 추후에 SpringMVC로 변경하면서 Request로 변경예정!
		///session.setAttribute("boardList", boardList);			
		// HttpSession -> HttpServletRequest(일회성객체)
		// session을 사용하는 것은 문제가아님
		// 브라우저 단위로 제공되는 서버 메모리->서버에게 부담		
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("boardList", boardList);
		mav.setViewName("boardList.jsp");
		return mav;
	}

}
