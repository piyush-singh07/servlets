package com.utc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
		static {
			System.out.println("SERVLET2 LOADING");
		}
		public TestServlet2()
		{
			
			
			System.out.println("SERVLET2 INSTANTIATION");
		}
		
		public void init(ServletConfig config)
		{
			
			System.out.println("SERVLET2 INITIALISATION");
		}

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			System.out.println("SERVLET2 REQUEST PROCESSING");
			out.println("<h1>test servlet2 using doget method</h1>");
			
			
		}
		public void destroy() {
			
			System.out.println("SERVLET2 DEINSTANTIATION");
			
		}
	

}
