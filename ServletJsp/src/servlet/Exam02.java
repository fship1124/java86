/*
 *  서블릿의 생존 주기(LifeCycle)
 *  
 *  init -> service -> destroy
 *  
 *  서블릿을 최초 호출시
 *  init -> service
 *  
 *  두번째 호출 부터
 *  service
 */
package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Exam02 implements Servlet 	{
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
	}
	@Override
	public void destroy() {
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

}