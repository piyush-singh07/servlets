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
		PrintWriter out=response.getWriter();
		
		String sname=request.getParameter("sname");
		String squal=request.getParameter("squal");
		String scourse=request.getParameter("scourse");
		String semail=request.getParameter("semail");
		String smobile=request.getParameter("smobile");
		
		if(squal.equalsIgnoreCase("BSC"))
		{
			response.sendError(504,"You are not allowed for this service");
		}
		else
		{
			out.println("<html>");
			out.println("<body>");
			out.println("student name"+sname);
			out.println("student qual"+squal);
			out.println("student course"+scourse);
			out.println("student email"+semail);
			out.println("student mobile"+smobile);
			out.println("</body></html>");
		}
		
	}

}
