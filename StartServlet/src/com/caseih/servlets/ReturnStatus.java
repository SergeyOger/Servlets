package com.caseih.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/return")
public class ReturnStatus extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setStatus(200);
//		response.setStatus(Response.SC_OK);
//		response.sendRedirect("/StartServlet/hello");
//		response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Something whent wrong");
		response.setHeader("Refresh", "1;URL=http://google.com");
		System.out.println("Hello");

	}
}
