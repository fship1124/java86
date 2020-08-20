// http://localhost:8000/ServletJsp/exam07?msg=hi
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/exam07")
public class Exam07 extends javax.servlet.GenericServlet {
	public void service(
			ServletRequest request, ServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 사용자 요청 파라미터
		String msg = request.getParameter("msg");
		
		String html = "<html><body><h1>" + msg + "</h1></body></html>";
		out.println(html);
		out.close();
	}
}








