package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		String uemail=request.getParameter("uemail");
		String umobile=request.getParameter("umobile");
		
		UserService us=new UserService();
		String status= us.registration(uname,upwd,uemail,umobile);
		out.println("<html>");
		out.println("<body bgcolor='lightblue'>");
		out.println("<center>");
		out.println("<font color='red' size='6'>");
		out.println("<br><br><br>");
		if(status.equals("existed"))
		{
			out.println("USER EXISTS ALREADY");
		}
		if(status.equals("success"))
		{
			out.println("REGISTRATION SUCCESSFUL");
		}
		if(status.equals("failure"))
		{
			out.println("REGISTRATION FAIL");
		}
		
		out.println("</font></center></body></html>");
		
	}

}
