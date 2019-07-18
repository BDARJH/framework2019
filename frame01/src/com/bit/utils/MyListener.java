package com.bit.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

//xml에서의 listener등록을 코드 내에서 자체적으로 해결가능
@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//컨테이너(서버)가 닫힐 때 호출
		System.out.println("Listener destory...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//컨테이너(서버)가 준비될 때 호출
		System.out.println("Listener init...");
	}
}
