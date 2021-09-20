package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HiServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		// set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<htm><body>");
		out.print("<h1>Hi, welcome to Generic servlet response !</h1>");
		out.print("</body></htm>");

	}

}
