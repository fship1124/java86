package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam10")
public class Exam10 extends HttpServlet {
	public void service(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Exam10 service");
	}
	/*
	public void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Exam10 doGet");
	}
	*/
	public void doPost(
			HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		System.out.println("Exam10 doPost");
	}
}
