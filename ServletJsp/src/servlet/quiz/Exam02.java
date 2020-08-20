package servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/quiz/Exam02")
public class Exam02 extends GenericServlet {
	private int answerNum;
	private int count = 0;
	public void init(ServletConfig config) {
		Random r = new Random();
		answerNum = r.nextInt(100) + 1;
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String msg = "";
		int num = Integer.parseInt(request.getParameter("num"));
		if (num > answerNum) {
			msg = "작은 수를 입력하세요";
		}
		else if (num < answerNum) {
			msg = "큰 수를 입력하세요";
		}
		else {
			msg = "정답입니다.";
		}
		count++;
		
		out.println("<html><body>");
		out.println("  <h1>정답 : " + answerNum + "</h1>");
		out.println("  <h1>" + count + "회 시도</h1>");
		out.println("  <h1>" + msg + "</h1>");
		if (num != answerNum) {
			out.println("  <h1><a href='exam02.html'>다시입력</a></h1>");
		}
		out.println("</body></html>");
	}
}





