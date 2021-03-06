package com.seo.view.board;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.seo.myapp.board.BoardListVO;
import com.seo.myapp.board.BoardService;
import com.seo.myapp.board.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	//비즈니스 컴포넌트, dao바꾸기 용이해짐
	
	
//	@RequestMapping(value="/dataTransform.do")
//	@ResponseBody
//	public List<BoardVO> dataTransform(BoardVO vo) {
//		
//		vo.setSearch("title");
//		vo.setSearchContent("");
//		List<BoardVO> datas=boardService.getBoardList(vo);
//				return datas;
//	}//어노테이션 json
	
	@RequestMapping(value="/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearch("title");
		vo.setSearchContent("");
		List<BoardVO> datas=boardService.getBoardList(vo);
		BoardListVO blVO=new BoardListVO();
				return datas;
	}//xml 데이터 변환
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		System.out.println("insertBoardController 실행중");	
		MultipartFile uploadFile=vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName=uploadFile.getOriginalFilename();
			System.out.println(fileName);
			uploadFile.transferTo(new File("C:\\0513seo\\workspace2\\test\\src\\main\\webapp\\images\\"+fileName));
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
		File file=new File("C:\\0513seo\\workspace2\\test\\src\\main\\webapp\\images\\"+v.getFileName());
		byte[] fileContent =null;
		try {
			fileContent = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("v",v);
		m.addAttribute("seo", fileContent);
	
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
