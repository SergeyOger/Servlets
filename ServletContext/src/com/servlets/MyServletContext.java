package com.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class MyServletContext extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration<String> enumeration = req.getServletContext().getAttributeNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string + " = " + req.getServletContext().getAttribute(string));

		}
//		System.out.println(req.getServerName());
//		System.out.println(req.getServerPort());
//		System.out.println(req.getServletContext());
//		System.out.println(req.getServerName());

//		ServletContext servletContext = req.getServletContext();
//		servletContext.setAttribute("one", "one value"); // object for all application (see @AnotherServlet )
	}
}
