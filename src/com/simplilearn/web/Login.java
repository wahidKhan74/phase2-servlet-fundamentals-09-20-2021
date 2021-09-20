package com.simplilearn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<htm><body>");
		out.print("<h1>Hello, welcome to Login servlet response !</h1>");
		out.print("<form>");
		out.print("Username : <input type='text' name='username' /> <br><br>");
		out.print("Password : <input type='text' name='password' />");
		out.print("<input type='submit' value='Submit' />");
		out.print("</form>");
		out.print("</body></htm>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
