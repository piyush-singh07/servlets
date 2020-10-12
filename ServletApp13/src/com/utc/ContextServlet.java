package com.utc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  response.setContentType("text/html");
	  PrintWriter out= response.getWriter();
	  ServletContext context= getServletContext();
	  context.setAttribute("uname","Durga");
	  context.setAttribute("upwd","durga123");
	  context.setAttribute("uemail","durga123@gmail.com");
	  context.setAttribute("umobile","987654321");
	  
	  
	  String driver_class=context.getInitParameter("driver_class");
	  String url=context.getInitParameter("url");
	  String username=context.getInitParameter("username");
	  String password=context.getInitParameter("password");
	  
	  
	  Enumeration<String> param_Names=context.getInitParameterNames();
	  String context_Param_Names = "";
	  while(param_Names.hasMoreElements())
	  {
		  context_Param_Names=context_Param_Names+param_Names.nextElement()+"<br>";
	  }
	  
	  String uname= (String) context.getAttribute("uname");
	  String upwd= (String) context.getAttribute("upwd");
	  String uemail= (String) context.getAttribute("uemail");
	  String umobile= (String) context.getAttribute("umobile");
	  
	  Enumeration<String> attr_names=context.getAttributeNames();
	  String context_attr_Names="";
	  while(attr_names.hasMoreElements())
	  {
		  context_attr_Names=context_attr_Names+attr_names.nextElement()+"<br>";
	  }
	  
	  System.out.println(uname);
	  System.out.println(upwd);
	  System.out.println(uemail);
	  System.out.println(umobile);
	  System.out.println(driver_class);
	  System.out.println(url);
	  System.out.println(username);
	  System.out.println(password);
	 
	  
	}

}
