package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/exam13")
public class Exam13 extends javax.servlet.http.HttpServlet {

	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		// 데이터 공유 하기
		String msg = "redirect는 공유 안됨..";
		// 등록
		request.setAttribute("msg", msg);
		// 페이지 이동
//		response.sendRedirect("exam13.jsp");
		response.sendRedirect("/ServletJsp/servlet/exam13.jsp");
	}
	
}





