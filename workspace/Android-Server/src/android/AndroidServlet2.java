package android;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/android/list.do")
public class AndroidServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AndroidServlet2() { }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Member m = new Member();
			m.setId("bit" + i);
			m.setName("java" + i);
			list.add(m);
		}
		System.out.println(list);
		response.setCharacterEncoding("utf-8");
		response.getWriter()
		        .append(new Gson().toJson(list));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
