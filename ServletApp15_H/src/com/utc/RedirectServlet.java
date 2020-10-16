package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<font size='5'>");
		out.println("To Get Services from Hutch<br>");
		out.println("Click On <br>");
		out.println("<a href='http://localhost:8080/ServletApp16_Vodafone/welcome.html'>CC@vodafone.com");
		out.println("</font></body></html>");
		
	
	}

}
