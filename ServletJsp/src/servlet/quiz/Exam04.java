/*
 *   path : /servlet/quiz/exam04
 *   parameter : 
 *   type 이 S 일 경우는 /servlet/quiz/admin.jsp
 *   type 이 U 일 경우는 /servlet/quiz/user.jsp
 *   type 이 S 또는 U 가 아닐 경우
 *   /servlet/quiz/error.jsp 호출한다.
 *   
 *   admin.jsp 호출시 화면에 "관리자 페이지 입니다" 출력
 *   user.jsp 호출시 화면에 "사용자 페이지 입니다" 출력
 *   error.jsp 호출시 화면에 "잘못된 접근 입니다" 출력
 */
package servlet.quiz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz/exam04")
public class Exam04 extends HttpServlet {
	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		String type = request.getParameter("type");
		String page = "error.jsp";
		switch (type) {
		case "S": page = "admin.jsp"; break;
		case "U": page = "user.jsp"; break;
		}
		response.sendRedirect(page);
	}
}








