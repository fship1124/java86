package kr.co.mlec.login.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.oreilly.servlet.MultipartRequest;

import framework.Controller;
import framework.ModelAndView;
import framework.RequestMapping;
import framework.WebUtil;
import kr.co.mlec.board.Board;
import kr.co.mlec.board.BoardFile;
import kr.co.mlec.board.Comment;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.service.BoardServiceImpl;
import kr.co.mlec.member.Member;
import kr.co.mlec.util.BitFileRenamePolicy;

@Controller
public class LoginController {
private BoardService service;
	
	@RequestMapping("/login/login.do")
	public String login(HttpServletRequest request) throws ServletException, IOException {
		ModelAndView mav = new ModelAndView();
//		request.setCharacterEncoding("utf-8");
		
		// 로그인 처리 
		// 사용자 입력 파라미터 얻기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		// id = a, pass = 1 이 경우 로그인 성공
		// 메인페이지로 이동
		// 세션에 정보를 설정한다.
		if ("a".equals(id) && "1".equals(pass)) {
			Member m = new Member();
			m.setId(id);
			m.setPass(pass);
			m.setName("테스터");
			m.setEmail("sbc@a.com");
			
			HttpSession session = request.getSession();
			session.setAttribute("user", m);
			return "redirect:" + request.getContextPath() + "/index.jsp";
		}
		// 로그인 실패
		// 로그인 폼 페이지로 이동
		else {
			return "redirect:loginForm.do";
		}
	}
	
	@RequestMapping("/login/loginForm.do")
	public void loginForm () throws ServletException, IOException {
	}
	
	@RequestMapping("/login/logout.do")
	public String logout(HttpServletRequest request) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:"+request.getContextPath()+"/index.jsp";
	}
	
}
	
	
	
	
	
