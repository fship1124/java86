package jsp.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp/cookie/exam01")
public class Exam01 extends HttpServlet {

	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		
		String name  = request.getParameter("name");
		String value = request.getParameter("value");
		
		// 쿠키 생성
		// 쿠키 값의 한글 처리
		Cookie c = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		
		// 쿠키 유효시간 설정(초)
		c.setMaxAge(60 * 60); // 1시간 유지
		
		// 쿠키 전송 패스 설정
		c.setPath("/");
		
		// 쿠키 전송
		response.addCookie(c);
		
		// 페이지 이동
		response.sendRedirect("exam01.jsp");
	}
}









