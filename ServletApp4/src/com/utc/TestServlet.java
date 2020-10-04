package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out= response.getWriter();
//		out.println("<h1>test servlet using servlet service method</h1>");
//	}
//
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out= response.getWriter();
//		out.println("<h1>test servlet using overriding service method</h1>");
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<h1>test servlet using doget method</h1>");
	}

}
