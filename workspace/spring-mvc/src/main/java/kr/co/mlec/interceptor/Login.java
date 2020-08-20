package kr.co.mlec.interceptor;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mlec.form.MemberVO;

@Controller
@RequestMapping("/interceptor")
public class Login {
	
	@RequestMapping("/loginForm.do")
	public void loginForm() {}   //void일때는 호출한 페이지의 경로와 동일한 jsp를 불러준다
	
	@RequestMapping("/login.do")
	public String login(HttpSession session) {   //매개변수에 세션을 넣어 선언하면 바로 세션을 사용할 수 있다.
		MemberVO member = new MemberVO();
		member.setId("admin");
		member.setName("관리자");
		session.setAttribute("user", member);
		
		return "redirect:myPage.do";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();      //세션삭제
		return "redirect:loginForm.do";
	}
}
