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
@WebServlet("/request")
public class GetRequestValues extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetRequestValues() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// 		String one = request.getParameter("one");
//		String two = request.getParameter("two");
//		System.out.println(one);
//		System.out.println(two);

//		String[] values = request.getParameterValues("one");
//		Arrays.asList(values).forEach(x -> System.out.println(x));

//		Enumeration<String> parameterNames = request.getParameterNames();
//		while (parameterNames.hasMoreElements()) {
//			String string = (String) parameterNames.nextElement();
//			System.out.println("Parameter name: " + string + " Parameter value: " + request.getParameter(string));
//		}

//		Map<String, String[]> values = request.getParameterMap();
//		values.keySet().forEach(x -> System.out.println("Value name" + x +  Arrays.asList(values.get(x))));

		System.out.println(request.getContentLength());
		System.out.println(request.getRequestURL());
		System.out.println(request.getQueryString());
		System.out.println(request.getServerName());
		System.out.println(request.getRemoteHost());
		System.out.println(request.getLocalPort());
		System.out.println(request.getRequestURI());
		
		
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
