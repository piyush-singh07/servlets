package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CourseRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String sname=request.getParameter("sname");
		String[] quals=request.getParameterValues("squal");
		String squal ="";
		for(int i=0;i<quals.length;i++)
		{ 
			squal=squal+quals[i]+"   ";
		}
		String sgender=request.getParameter("sgender");
		String [] techs=request.getParameterValues("stech");
		String stech="";
		for(int i=0;i<techs.length;i++)
		{
			stech=stech+techs[i]+",";
		}
		String dbranch=request.getParameter("dbranch");
		String saddr=request.getParameter("saddr");
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>UTC UNIVERSITY</h2>");
		out.println("<h3>Course Registraion Details</h3>");
		out.println("<table border='1'>");
		out.println("<tr><td>STUDENT NAME</td><td>"+sname+"</td></tr>");
		out.println("<tr><td>STUDENT QUALIFICATION</td><td>"+squal+"</td></tr>");
		out.println("<tr><td>STUDENT GENDER</td><td>"+sgender+"</td></tr>");
		out.println("<tr><td>STUDENT TECHNOLOGIES</td><td>"+stech+"</td></tr>");
		out.println("<tr><td>STUDENT BRANCH</td><td>"+dbranch+"</td></tr>");
		out.println("<tr><td>STUDENT ADDRESS</td><td>"+saddr+"</td></tr>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
	}

}
