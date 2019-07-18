package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el/ex03.html")
public class Ex02Controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//application scope를 어떻게 얻어오는지
//		getServletContext().getAttribute("");
		
		String msg2 = "controller msg";
		req.setAttribute("msg", msg2);
		req.getRequestDispatcher("ex02.jsp").forward(req, resp);
	}
}
