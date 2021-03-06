package jsp.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jsp/session/login")
public class Login extends HttpServlet {

	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
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
			
			response.sendRedirect("main.jsp");
		}
		// 로그인 실패
		// 로그인 폼 페이지로 이동
		else {
			response.sendRedirect("loginForm.jsp");
		}
	}
}
















