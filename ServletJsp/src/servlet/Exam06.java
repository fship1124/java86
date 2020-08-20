package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/exam06")
public class Exam06 extends javax.servlet.GenericServlet {
	public void service(
			ServletRequest request, ServletResponse response) 
			throws IOException, ServletException {
		// 사용자 브라우져로 응답하기
		// 1단계 : 브라우져에게 보내는 문서의 타입을 알려준다.
		//         브라우져는 타입을 이용해서 문서를 해석한다.
		//         만약, 문서의 타입이 해석이 안된다면 다운로드 창을 띄운다.
		response.setContentType("text/html; charset=utf-8"); 

		// 2단계 : 실제 출력할 내용을 작성 후 출력하기
		PrintWriter out = response.getWriter();
		
		// 출력 내용
		String html = "<html><body><h1>성공</h1></body></html>";
		out.println(html);
		
		// 3단계 : 출력객체 닫기
		out.close();
	}
}







