package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/exam05")
public class Exam05 extends javax.servlet.GenericServlet {
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Exam05 init 메서드 재정의");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Exam05 service");
	}
}