package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam11")
public class Exam11 extends javax.servlet.http.HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// checkbox 인 경우의 주의점..
		String[] fruits = request.getParameterValues("fruit");
		if (fruits == null) {
			System.out.println("체크되지 않음");
		} else {
			System.out.println("체크된 항목");
			for (String fruit : fruits) {
				System.out.println(fruit);
			}
		}
	}
}








