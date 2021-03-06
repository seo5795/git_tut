package com.seo.view.users;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seo.myapp.users.UsersService;
import com.seo.myapp.users.UsersVO;

@Controller
public class UserController {
	
	@Autowired
	private UsersService usersService;
	//비즈니스 컴포넌트, dao바꾸기 용이해짐
	
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	//handlerMapping역활
	//사용자 요청에 따른 컨트롤러 메서드 생성
	public String login(UsersVO vo,HttpSession session) {
		//command객체를 통한 setter, mapping
		System.out.println("로그인 컨트롤러");
		System.out.println(vo.getId());
		if(vo.getId()==null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디가 입력되지않았습니다.");
		}
		
		UsersVO data=usersService.getUsers(vo);
		System.out.println("getUsers끝");
		if(data!=null) {
			session.setAttribute("vvv", data);
			return "index.jsp";
		}
		else{
			return "login.jsp";
		}
	}
	
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String login2(@ModelAttribute("user")UsersVO vo) {
		System.out.println("로그인화면을 서비스하는 메서드동작함");
		
		vo.setId("a");
		vo.setPw("a");
		
		return "login.jsp";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 컨트롤러");
		
		session.invalidate();
		
		return "login.jsp";
	}
	@RequestMapping("/updateUsers.do")
	public String update(UsersVO vo) {
		System.out.println("업데이트 users 컨트롤러");
		
		usersService.updateUsers(vo);
		System.out.println("업데이트 usersdao 완료");
		return "logout.do";
	}
	@RequestMapping(value="/insertUsers.do")
	public String insert(UsersVO vo) {
		 System.out.println("회원가입 처리 컨트롤러");
		 usersService.insertUsers(vo);   
	     
	      return "login.jsp";
	
	}
	@RequestMapping("/deleteUsers.do")
	public String delete(UsersVO vo) {
		System.out.println("회원탈퇴 컨트롤러");
		
		usersService.deleteUsers(vo);
		
		return "logout.do";
	}
	
	@RequestMapping("/findId.do")
	public String findId(UsersVO vo, Model m) {
		System.out.println("id찾기 컨트롤러");
		System.out.println(vo.getMail()+m);
		List<UsersVO> users=usersService.findId(vo);
	
		System.out.println("id찾기 컨트롤러 끝");
		
		m.addAttribute("users",users);
		
		return  "findAccount.jsp";
	}
	
	@RequestMapping("/findPw.do")
	public String findPw(UsersVO vo, Model m){
		System.out.println("pw찾기 컨트롤러");
		System.out.println(vo.getId());
		List<UsersVO> userpw=usersService.findPw(vo);
		
		m.addAttribute("userpw",userpw);
		
		return "findAccount.jsp";
	}
	
}
