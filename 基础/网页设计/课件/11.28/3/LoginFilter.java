package org.stuenroll.user;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 1.将登陆相关的页面地址排除在拦截器之外
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		System.out.println(uri);
		// CSS、JS和登陆相关的页面添加到白名单
		if (uri.contains("/js/") || uri.contains("/css/")
				|| uri.contains("login.jsp")||uri.contains("/pic/")||uri.contains("/user/login")) {
			chain.doFilter(request, response); // 完成拦截
		}else{
			HttpSession session=req.getSession();
			String login=(String) session.getAttribute("login");
			if("true".equals(login)){
				chain.doFilter(request, response); // 完成拦截
			}
			else{
				HttpServletResponse resp=(HttpServletResponse) response;
				resp.sendRedirect("/stuenroll/jsp/backyard/login.jsp");
			}
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
