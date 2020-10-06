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
		
		String uname= request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<font color='red' size='6'>");
		
		if(uname.equals("admin")&&upwd.equals("pass123"))
		{
			out.println("login successful");
			
		}
		else
		{
			out.println("Login Fail");
			
		}
		
		out.println("</font>");
		out.println("<a href='./loginform.html'> LOGIN FORM </a>");
		out.println("</body></html>");
		
	}

}
