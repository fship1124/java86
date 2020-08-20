/*
 *  각 서블릿에서 구현해야 하는 주요 메서드를 재정의한 클래스
 *  : 불필요한 구현을 없앤다..
 */
package servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public abstract class GenericServlet implements Servlet {
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Generic Init~");
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
