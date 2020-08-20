package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam05")
public class exam05 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/xml; charset=utf-8");
		PrintWriter out = response.getWriter();
		String xml = "";
		xml += "<members>";
		xml += "	<member>";
		xml += "		<name>홍길동</name>";
		xml += "		<age>33</age>";
		xml += "	</member>";
		xml += "	<member>";
		xml += "		<name>오승환</name>";
		xml += "		<age>36</age>";
		xml += "	</member>";
		xml += "</members>";
		out.print(xml);
		out.close();
		
	}
	
}
