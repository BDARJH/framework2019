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
//		BasicConfigurator.configure(); //가장 기본으로 사용하는 configurator
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		logger.trace("확인");
		logger.debug("개발자모드");
		logger.info("정보제공");
		logger.warn("주의고지");
		logger.error("에러메세지");
		logger.fatal("치명적인 문제");
		//17388 [http-bio-8080-exec-4] INFO com.bit.controller.MainController  - Entering application.
		//info라고 뜨는이유 logger.info로 했기 때문, logger.debug로 하면 debug로 찍힘
		//모드에는 총 6가지가 있는데 위의 순서대로 아래로 갈 수록 심각한 것
		//log4j.properties에서 환경설정을 통해 모드를 정해줄 수 있다.
		//만약 debug모드로 설정한다면 debug 아래에 있는 log 메세지가 다 출력
		//warn으로 설정시 warn,error,fatal 이런식으로
		//개발시 확인하기 위해서는 debug모드로 보통 설정
		
		
//		String cmsg = this.getServletContext().getInitParameter("cmsg");
//		System.out.println("context param : "+cmsg);
		
		//web.xml에서 param을 설정한걸 받아오기
		//설정한 servlet과 다른 servlet이기 때문에 못받아옴
//		String msg = getInitParameter("msg");
//		System.out.println("init param : " + msg);
//		
//		System.out.println("call GET servlets...");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
/*
%p debug, info, warn, error, fatal 등의 priority 가 출력된다.
%m 로그내용이 출력됩니다
%d 로깅 이벤트가 발생한 시간을 기록합니다. 포맷은 %d{HH:mm:ss, SSS}, %d{yyyy MMM dd HH:mm:ss, SSS}같은 형태로 사용하며 SimpleDateFormat에 따른 포맷팅을 하면 된다
%t 로그이벤트가 발생된 쓰레드의 이름을 출력합니다.
%% % 표시를 출력하기 위해 사용한다.
%n 플랫폼 종속적인 개행문자가 출력된다. rn 또는 n 일것이다.
%C 클래스명을 포시합니다. 예)클래스구조가 org.apache.xyz.SomeClass 처럼 되어있다면 %C{2}는 xyz.SomeClass 가 출력됩니다
%M 로깅이 발생한 method 이름을 나타냅니다.
*/
