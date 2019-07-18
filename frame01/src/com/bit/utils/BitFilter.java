package com.bit.utils;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value="/bit.do",initParams={
		@WebInitParam(name="msg2",value="xyz")
})
public class BitFilter implements Filter {
	String msg;
	
	@Override
	public void destroy() {
		System.out.println("BitFilter dest...");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("BitFilter before do...");
		
		//context param 불러오기
//		Enumeration<String> names = req.getServletContext().getInitParameterNames();
//		
//		while(names.hasMoreElements()){
//			System.out.println(names.nextElement());
//		}
		
		System.out.println("init param:"+msg);
		chain.doFilter(req, resp);
		System.out.println("BitFilter after do...");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("BitFilter init...");
		
		//init param 불러오기 (init메서드에서만 설정될 수 있다. - 받아올 수 있다)
//		Enumeration<String> names = config.getInitParameterNames();
//		while(names.hasMoreElements()){
//			System.out.println(names.nextElement());
//		}
		//view단에 부르는 것은 do에서 할 수 있기때문에
		//msg를 전역변수로 설정하여 값을 넣어준다음에 do에서 쓰면 된다.
		msg = config.getInitParameter("msg2");
	}

}
