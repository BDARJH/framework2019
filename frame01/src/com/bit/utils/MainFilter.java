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
		//servlet�� controller���� ���������� filter������ �ٷ� ȣ���� ���� �ִ�.
		//struts�� Ư¡
		req.getRequestDispatcher("main.jsp").forward(req, resp);
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
