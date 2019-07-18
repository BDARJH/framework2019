package com.bit.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MainFilter implements Filter {
	
	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		//servlet과 controller없이 독단적으로 filter내에서 바로 호출할 수도 있다.
		//struts의 특징
		req.getRequestDispatcher("main.jsp").forward(req, resp);
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
