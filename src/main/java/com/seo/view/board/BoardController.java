package com.seo.view.board;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.seo.myapp.board.BoardService;
import com.seo.myapp.board.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	//비즈니스 컴포넌트, dao바꾸기 용이해짐
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		System.out.println("insertBoardController 실행중");	
		MultipartFile uploadFile=vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName=uploadFile.getOriginalFilename();
			System.out.println(fileName);
			uploadFile.transferTo(new File("/images/"+fileName));
			vo.setFileName(fileName);
		}
		boardService.insertBoard(vo);		
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		System.out.println("updateBoardController 실행중");
		boardService.updateBoard(vo);	
		return "getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("DeleteBoardController 실행중");
		boardService.deleteBoard(vo);
		
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo,Model m) {
		System.out.println("GetBoardController 수행중");

		BoardVO v=boardService.getBoard(vo);
		m.addAttribute("v",v);
	
		return "board.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo,Model m) {
		System.out.println("게시판 목록보기 컨트롤러+검색");

		if(vo.getSearch()==null) {
			vo.setSearch("title");
		}
		if(vo.getSearchContent()==null) {
			vo.setSearchContent("");
		}

		List<BoardVO> boardList=boardService.getBoardList(vo);
		System.out.println("getBoardList 끝");
		m.addAttribute("boardList", boardList);
		
		return "boardList.jsp";
	}
	
	@RequestMapping("/updateBoardPage.do")
	public String updateBoardPage(BoardVO vo,Model m) {
		System.out.println("UpdateBoardPageController 수행중");
		BoardVO v=boardService.getBoard(vo);

		m.addAttribute("v",v);
		
		return "updateBoard.jsp";
	}
}
