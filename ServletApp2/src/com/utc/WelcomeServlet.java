package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<font color='BLUE' size='6'>");
		out.println("<b>WELCOME TO GENERIC SERVLET<b>");
		out.println("</font>");
		out.println("</body>");
		out.println("</html>");
			
	}

}
