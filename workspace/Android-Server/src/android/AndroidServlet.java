package android;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/android/login.do")
public class AndroidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AndroidServlet() { }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String msg = "아이디 : " + userid + ", 패스워드 : " + passwd;
		System.out.println("호출됨 ::: " + msg);
		response.setCharacterEncoding("utf-8");
		response.getWriter()
		        .append(msg);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
