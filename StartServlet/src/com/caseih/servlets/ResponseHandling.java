package com.caseih.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseHandling
 */
@WebServlet("/response")
public class ResponseHandling extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResponseHandling() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String secondName = request.getParameter("secondName");
		response.getWriter()
				.write("<html>" + "<head>" + "<title>My Page</title>" + "</head>" + "<body>" + "<h1>Hello world</h1>"
						+ "<form action='response' method='post'>" + "<input type='text' name='firstName'/>"
						+ "<input type='text' name='secondName'/>" + "<input type='submit' name='submit'/>" + "</form>"
						+ "<p>Your first name = " + firstName + " Your second name is " + secondName + "</p>"
						+ "</body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
