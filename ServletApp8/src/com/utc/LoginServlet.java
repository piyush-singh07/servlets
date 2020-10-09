package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		UserService us= new UserService();
		String status=us.checkLogin(uname,upwd);
		out.println("<html>");
		out.println("<body bgcolor='lightblue'>");
		out.println("<center>");
		out.println("<font color='red' size='6'>");
		out.println("<br><br><br>");
		if(status.equals("success"))
		{
			out.println("LOGIN SUCCESS");
		}
		else
		{
			out.println("LOGIN FAIL");
		}
		out.println("</font></center></body></html>");
		
	}

}
