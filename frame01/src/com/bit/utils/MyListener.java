package com.bit.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

//xml������ listener����� �ڵ� ������ ��ü������ �ذᰡ��
@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//�����̳�(����)�� ���� �� ȣ��
		System.out.println("Listener destory...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//�����̳�(����)�� �غ�� �� ȣ��
		System.out.println("Listener init...");
	}
}
