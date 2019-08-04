package com.caseih.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Temp
 */
@WebServlet("/cross")
public class XSSCrossSiteScripting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public XSSCrossSiteScripting() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String text = request.getParameter("text");
		text = text == null ? "" : text.replaceAll("<", "&lt").replaceAll(">", "&gt");

		response.getWriter()
				.write("<html>" 
						+ "<head>" + ""
							+ "<title>Page</title>" + 
							"</head>" + 
							"<body>"
						+ "<h1>Cross site scripting</h1>" + ""
								+ "<form action='cross' method='post'>"
						+ "<textarea name='text'/></textarea>" + "<input type='submit' name='submit'/>" + 
								"</form>"
								+ "value" + text + 
						"</body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
