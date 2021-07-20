package com.seo.view.users;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seo.myapp.users.UsersVO;
import com.seo.myapp.users.impl.UsersDAO;

@Controller
public class LoginController {
	@RequestMapping(value="/login.do")
	public String login(UsersVO vo,UsersDAO dao,HttpSession session) {
		System.out.println("로그인 컨트롤러");
		UsersVO data=dao.getUsers(vo);
		System.out.println("getUsers끝");
		if(data!=null) {
			session.setAttribute("userName", data.getName());
			return "index.jsp";
		}
		else{
			return "login.jsp";
		}
		
	}
}
