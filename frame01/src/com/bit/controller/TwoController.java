package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwoController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//
		String cmsg = this.getServletContext().getInitParameter("cmsg");
		System.out.println("context param : "+cmsg);
		
		//web.xml에서 param을 설정한걸 받아오기
		String msg = getInitParameter("msg");
		//view단에 위임할 수 있도록 req에 attribute를 등록시켜 주기
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("two.jsp").forward(req, resp);
	}
}
