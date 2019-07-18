package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@WebServlet("/")
public class MainController extends HttpServlet {
	static Logger logger = Logger.getLogger(MainController.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		BasicConfigurator.configure(); //���� �⺻���� ����ϴ� configurator
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		logger.trace("Ȯ��");
		logger.debug("�����ڸ��");
		logger.info("��������");
		logger.warn("���ǰ���");
		logger.error("�����޼���");
		logger.fatal("ġ������ ����");
		//17388 [http-bio-8080-exec-4] INFO com.bit.controller.MainController  - Entering application.
		//info��� �ߴ����� logger.info�� �߱� ����, logger.debug�� �ϸ� debug�� ����
		//��忡�� �� 6������ �ִµ� ���� ������� �Ʒ��� �� ���� �ɰ��� ��
		//log4j.properties���� ȯ�漳���� ���� ��带 ������ �� �ִ�.
		//���� debug���� �����Ѵٸ� debug �Ʒ��� �ִ� log �޼����� �� ���
		//warn���� ������ warn,error,fatal �̷�������
		//���߽� Ȯ���ϱ� ���ؼ��� debug���� ���� ����
		
		
//		String cmsg = this.getServletContext().getInitParameter("cmsg");
//		System.out.println("context param : "+cmsg);
		
		//web.xml���� param�� �����Ѱ� �޾ƿ���
		//������ servlet�� �ٸ� servlet�̱� ������ ���޾ƿ�
//		String msg = getInitParameter("msg");
//		System.out.println("init param : " + msg);
//		
//		System.out.println("call GET servlets...");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
/*
%p debug, info, warn, error, fatal ���� priority �� ��µȴ�.
%m �α׳����� ��µ˴ϴ�
%d �α� �̺�Ʈ�� �߻��� �ð��� ����մϴ�. ������ %d{HH:mm:ss, SSS}, %d{yyyy MMM dd HH:mm:ss, SSS}���� ���·� ����ϸ� SimpleDateFormat�� ���� �������� �ϸ� �ȴ�
%t �α��̺�Ʈ�� �߻��� �������� �̸��� ����մϴ�.
%% % ǥ�ø� ����ϱ� ���� ����Ѵ�.
%n �÷��� �������� ���๮�ڰ� ��µȴ�. rn �Ǵ� n �ϰ��̴�.
%C Ŭ�������� �����մϴ�. ��)Ŭ���������� org.apache.xyz.SomeClass ó�� �Ǿ��ִٸ� %C{2}�� xyz.SomeClass �� ��µ˴ϴ�
%M �α��� �߻��� method �̸��� ��Ÿ���ϴ�.
*/
