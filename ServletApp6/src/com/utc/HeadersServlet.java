package com.utc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration<String> e =request.getHeaderNames();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Request Headers Data </h2>");
		out.println("<table border='1'>");
		out.println("<tr><td align='center'><h3>Header Name</h3><td align='center'><h3>Header value</h3></td></tr>");
		while(e.hasMoreElements())
		{
			String name=(String)e.nextElement();
			String value=request.getHeader(name);
			out.println("<tr><td>"+name+"</td><td>"+value+"</td><tr>");
			
		}
	out.println("</table></body></html>");
	}

}
