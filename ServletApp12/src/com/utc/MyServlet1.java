package com.utc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		ServletConfig config = getServletConfig();
		
		String a = config.getInitParameter("a");
		String b = config.getInitParameter("b");
		String c = config.getInitParameter("c");
		String d = config.getInitParameter("d");
		String logical_name=config.getServletName();
		
		Enumeration<String> e = config.getInitParameterNames();
		String param_names="";
		while(e.hasMoreElements())
		{
			param_names=param_names+e.nextElement()+"<br>";
			
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<font color='red' size='5'>");
		out.println("<b>Config Details</b>");
		out.println("<table border='1'>");
		out.println("<tr><td>LOGICAL NAME</td><td>"+logical_name+"</td></tr>");
		out.println("<tr><td>a</td><td>"+a+"</td></tr>");
		out.println("<tr><td>b</td><td>"+b+"</td></tr>");
		out.println("<tr><td>c</td><td>"+c+"</td></tr>");
		out.println("<tr><td>d</td><td>"+d+"</td></tr>");
		out.println("<tr><td>Param Names</td><td>"+param_names+"</td></tr>");
		out.println("</table></body></html>");
		
	
	}

}
