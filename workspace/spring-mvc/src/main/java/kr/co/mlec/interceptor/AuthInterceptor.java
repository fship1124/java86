package kr.co.mlec.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.mlec.form.MemberVO;

public class AuthInterceptor extends HandlerInterceptorAdapter {   //InterceptorAdapter 상속받으면 필요한 메서드만 재정의해주면 된다.
	
	// preHandle : 특정한 기능을 구현하기전에 체크하는 역할(해당url을 호출하기전에 체크)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		MemberVO member = (MemberVO) session.getAttribute("user");
		if (member != null) {
			return true;
		}
		response.sendRedirect("loginForm.do");
		return false;
	}
}
