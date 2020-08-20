package jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jsp/session/exam01")
public class Exam01 extends HttpServlet {
	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 세션 객체 얻기
		// 사용자와 연관된 세션이 존재한다면 존재하는 세션을 반환하고
		//         연관된 세션이 없다면 새로운 세션을 생성해서 반환
		HttpSession session = request.getSession();
		String id = session.getId();
		
		// 세션의 유효시간을 설정(초)
		session.setMaxInactiveInterval(3);
		
		out.println("<h1>설정된 JSESSIONID : " + id + "</h1>");
		out.close();
	}
}








