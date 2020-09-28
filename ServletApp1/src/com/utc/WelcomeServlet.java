package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet implements Servlet {

	@Override
	public void destroy() {
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<font color='red' size='6'>");
		out.println("<b>WELCOME TO MY SERVLET<b>");
		out.println("</font>");
		out.println("</body>");
		out.println("</html>");
	}

}
