package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/exam12")
public class Exam12 extends HttpServlet {
	@Override
	public void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		// 공유 하고자 하는 데이터 처리
		String msg = "hi jsp";
		Date d = new Date();
		
		// 페이지 이동 전 공유 영역에 등록하기
		request.setAttribute("msg", msg);
		request.setAttribute("date", d);		
		
		// 페이지 이동하기
		RequestDispatcher rd = 
				request.getRequestDispatcher("exam12.jsp");
		rd.forward(request, response);
	}
}








