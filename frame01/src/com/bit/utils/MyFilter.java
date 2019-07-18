package com.bit.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.Logger;

@WebFilter("/*")
public class MyFilter implements Filter {
	Logger log = Logger.getLogger("com.bit.utils.MyFilter");
	
	@Override
	public void destroy() {
		log.debug("Filter destroy...");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		log.debug("Filter before do...");
		chain.doFilter(req, resp);
		log.debug("Filter after do...");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.debug("Filter init...");
	}

}
