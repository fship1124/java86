package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("MyFilter init 실행됨");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
					     FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyFilter doFilter 실행됨");
		// 다음 필터 호출 또는 다음 서블릿 호출
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {}
}



