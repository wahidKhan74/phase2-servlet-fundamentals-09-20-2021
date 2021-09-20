package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {

	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config  = config;
		System.out.println(" -- Servlet is initialized ---");
	}

	// hello
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<htm><body>");
		out.print("<h1>Hello, welcome to servlet program !</h1>");
		out.print("</body></htm>");
		
		System.out.println(" -- Servlet request processing is completed! ---");
	}
	
	@Override
	public void destroy() {
		System.out.println("-- servlet is destroyed ---");	
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "This is a servlet interfce implementated class";
	}

	

}
