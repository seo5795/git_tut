package com.seo.view.users;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seo.myapp.users.UsersVO;
import com.seo.myapp.users.impl.UsersDAO;

@Controller
public class UserController {
	@RequestMapping(value="/login.do")
	public String login(UsersVO vo,UsersDAO dao,HttpSession session) {
		System.out.println("로그인 컨트롤러");
		UsersVO data=dao.getUsers(vo);
		System.out.println("getUsers끝");
		if(data!=null) {
			session.setAttribute("vvv", data);
			return "index.jsp";
		}
		else{
			return "login.jsp";
		}
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 컨트롤러");
		
		session.invalidate();
		
		return "login.jsp";
	}
	@RequestMapping("updateUsers.do")
	public String update(UsersVO vo,UsersDAO dao) {
		System.out.println("업데이트 users 컨트롤러");
		
		dao.updateUsers(vo);
		
		return "login.jsp";
	}
	@RequestMapping(value="/insertUsers.do")
	public String insert(UsersVO vo,UsersDAO dao) {
		 System.out.println("회원가입 처리 컨트롤러");
		 dao.insertUsers(vo);   
	     
	      return "login.jsp";
	
	}
	@RequestMapping("deleteUsers.do")
	public String delete(UsersVO vo,UsersDAO dao) {
		System.out.println("회원탈퇴 컨트롤러");
		
		dao.deleteUsers(vo);
		
		return "login.jsp";
	}
	
}
