/*
 *  서버에서 실행되는 자바 클래스
 *  웹 브라우져에서 호출이 가능한 클래스
 *  
 *  서블릿 개념의 클래스가 되기 위해서는 상속을 이용
 *  Servlet 라는 인터페이스를 상속해야 한다.
 *  
 *  서블릿을 톰켓 웹서버가 인식하게 하는 방법
 *  WEB-INF/web.xml 파일에 
 *  <servlet> 와 <servlet-mapping> 활용
 */
package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Exam01 implements Servlet {

	/*
	 * 서블릿이 메모리에 로딩될때 최초 한번만 호출되는 메서드
	 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init 메서드 호출됨...");
	}

	// 사용자의 요청에 대한 처리를 진행
	// 호출시마다 실행됨..
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service 메서드 호출됨...");
	}
	
	// 메모리에서 해제되는 경우 자동 호출됨
	// 서블릿 소스 변경, 웹서버 재구동, 최초 서버 구동, 
	// 컨텍스트(어플리케이션)이 재로딩
	@Override
	public void destroy() {
		System.out.println("서블릿 메모리에서 해제됨...");
	}

	// 해당 서블릿의 기본 환경관련 정보를 가지고 있는 객체를 반환
	@Override
	public ServletConfig getServletConfig() { return null; }

	// 관리자페이지에서 해당 서블릿의 정보를 간단한 문자열로 반환
	@Override
	public String getServletInfo() { return null; }
}




