package servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

class Quiz {
	private int answerNum;
	private int count;
	
	public Quiz() {
		answerNum = new Random().nextInt(100) + 1;
	}
	public void increase() {
		count++;
	}
	public int getAnswerNum() {
		return answerNum;
	}
	public int getCount() {
		return count;
	}
}

@WebServlet("/servlet/quiz/Exam03")
public class Exam03 extends GenericServlet {
	Map<String, Quiz> user = new HashMap<>();
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String msg  = "<html><body>";
		String id = request.getParameter("id");
		int num = 0;
		int answerNum = 0;
		logic:
		{
			if (id.equals("")) {
				msg = "<h1>아이디를 입력하세요</h1>";
				break logic;
			}
			Quiz quiz = null;
			if (user.containsKey(id)) {
				quiz = user.get(id);
			} else {
				quiz = new Quiz();
				user.put(id, quiz);
			}
			quiz.increase();
			answerNum = quiz.getAnswerNum();

			num = Integer.parseInt(request.getParameter("num"));
			
			msg += "  <h1>" + quiz.getCount() + "회 시도</h1>"; 
			msg += "  <h1>정답 : " + quiz.getAnswerNum() + "</h1>";
			
			if (num > answerNum) {
				msg += "작은 수를 입력하세요";
			}
			else if (num < answerNum) {
				msg += "큰 수를 입력하세요";
			}
			else {
				msg += "정답입니다.";
				break logic;
			}
			
		}
		if (num != answerNum) {
			msg += "  <h1><a href='exam03.html'>다시입력</a></h1>";
		}
		
		Set<String> keys = user.keySet();
		msg += "<hr>";
		for (String key : keys) {
			Quiz q = user.get(key);
			msg += "<h2>ID : " + key + 
				   ", COUNT : " + q.getCount() + 
				   ", ANSWER NUM : " + q.getAnswerNum() + "</h2>";
		}
		msg += "<hr>";
		msg += "</body></html>";
		
		out.println(msg);
		out.close();
	}
}





