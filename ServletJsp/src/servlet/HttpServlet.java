package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Http service - 1");
		HttpServletRequest hRequest = (HttpServletRequest)request;
		HttpServletResponse hResponse = (HttpServletResponse)response;
		
		service(hRequest, hResponse);
	}
	public void service(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Http service - 2");
		String method = request.getMethod();
		if ("GET".equals(method)) {
			doGet(request, response);
		}
		else if ("POST".equals(method)) {
			doPost(request, response);
		}
	}
	
	public void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HttpServlet doGet");
		response.sendError(405, "GET 메서드를 구현하지 않았습니다.");
	}
	public void doPost(
			HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		System.out.println("HttpServlet doPost");
		response.sendError(405, "POST 메서드를 구현하지 않았습니다.");
	}
}








