package com.seo.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seo.myapp.board.BoardVO;
import com.seo.myapp.board.impl.BoardDAO;

@Controller
public class BoardController {
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("메시지 등록중....");	
		dao.insertBoard(vo);		
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("updateBoardController 실행중");
		dao.updateBoard(vo);	
		return "getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("DeleteBoardController 실행중");
		dao.deleteBoard(vo);
		
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo,BoardDAO dao,Model m) {
		System.out.println("GetBoardController 수행중");

		BoardVO v=dao.getBoard(vo);
		m.addAttribute("v",v);
	
		return "board.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo,BoardDAO dao,Model m) {
		System.out.println("GetBoardListController 실행중");

		List<BoardVO> boardList=dao.getBoardList(); // 추후에 검색기능을 추가해볼수있겠다!
	
		m.addAttribute("boardList",boardList);
		
		return "boardList.jsp";
	}
	
	@RequestMapping("/updateBoardPage.do")
	public String updateBoardPage(BoardVO vo,BoardDAO dao,Model m) {
		System.out.println("UpdateBoardPageController 수행중");
		BoardVO v=dao.getBoard(vo);

		m.addAttribute("v",v);
		
		return "updateBoard.jsp";
	}
}
