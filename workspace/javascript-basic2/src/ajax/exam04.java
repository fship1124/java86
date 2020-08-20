package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam04")
public class exam04 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String msg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		out.print("<h1>" + msg + "</h1>");
		out.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String msg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		out.print("<h1>" + msg + "</h1>");
		out.close();
		
	}
	
}
