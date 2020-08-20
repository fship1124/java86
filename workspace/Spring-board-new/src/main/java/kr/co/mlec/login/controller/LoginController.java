package kr.co.mlec.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.member.Member;

@Controller("kr.co.mlec.login.controller.LoginController")
public class LoginController {

	@RequestMapping("/login/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main.do";
	}
	
	@RequestMapping("/login/login.do")
	public String login(String id, String pass, HttpSession session) {
		
		// 로그인 처리 
		// id = a, pass = 1 이 경우 로그인 성공
		// 메인페이지로 이동
		// 세션에 정보를 설정한다.
		if ("a".equals(id) && "1".equals(pass)) {
			Member m = new Member();
			m.setId(id);
			m.setPass(pass);
			m.setName("테스터");
			m.setEmail("sbc@a.com");
			session.setAttribute("user", m);
			return "redirect:/main.do";
		}
		// 로그인 실패
		// 로그인 폼 페이지로 이동
		else {
			return "redirect:loginForm.do";
		}
	}
}
















