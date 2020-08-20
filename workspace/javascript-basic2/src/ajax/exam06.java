package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam06")
public class exam06 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();
		String json = "";
		json += "[{\"name\": \"홍길동\", \"age\": 33}, {\"name\": \"오승환\", \"age\": 36}]";
		out.print(json);
		out.close();
		
	}
	
}
