package com.seo.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;

@Controller
public class BoardController {
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("메시지 등록중....");	
		dao.insertBoard(vo);		
		return "index.jsp";
	}
	
	@RequestMapping("/updateBoard.do")
	public ModelAndView updateBoard(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("updateBoardController 실행중");
		dao.updateBoard(vo);	
		mav.setViewName("getBoardList.do");
		return mav;
	}
	
	@RequestMapping("/deleteBoard.do")
	public ModelAndView deleteBoard(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("DeleteBoardController 실행중");
		dao.deleteBoard(vo);
		mav.setViewName("getBoardList.do");
		return mav;
	}
	
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("GetBoardController 수행중");

		BoardVO v=dao.getBoard(vo);
		mav.addObject("v", v);
		mav.setViewName("board.jsp");
		return mav;
	}
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("GetBoardListController 실행중");

		List<BoardVO> boardList=dao.getBoardList(); // 추후에 검색기능을 추가해볼수있겠다!
	
		mav.addObject("boardList", boardList);
		mav.setViewName("boardList.jsp");
		return mav;
	}
	@RequestMapping("/UpdateBoard.do")
	public ModelAndView UpdateBoard(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("updateBoardController 실행중");
		dao.updateBoard(vo);

		
		mav.setViewName("getBoardList.do");
		return mav;
	}
	@RequestMapping("/updateBoardPage.do")
	public ModelAndView updateBoardPage(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("UpdateBoardPageController 수행중");
		BoardVO v=dao.getBoard(vo);

		mav.addObject("v", v);
		mav.setViewName("updateBoard.jsp");
		return mav;
	}
}
