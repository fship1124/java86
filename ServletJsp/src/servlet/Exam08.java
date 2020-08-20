package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/exam08")
public class Exam08 extends GenericServlet {

	@Override
	public void service(
			ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpServletRequest hRequest = (HttpServletRequest)request;

		// 사용자 요청이 post일 경우 파라미터 한글 처리
		String method = hRequest.getMethod();
		if (method.equals("POST")) {
			request.setCharacterEncoding("utf-8");
		}
		
		String msg = request.getParameter("msg");
		out.println("<h1>" + msg + "</h1>");
		out.close();
	}
}







