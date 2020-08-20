package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/exam09")
public class Exam09 extends javax.servlet.GenericServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpServletRequest hRequest = (HttpServletRequest)request;
		String method = hRequest.getMethod();
		if (method.equals("GET")) {
			out.println("<h1>잘못된 접근입니다.</h1>");
		} 
		else {
			out.println("성공");
		}
		out.close();
	}
}








