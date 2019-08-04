package com.caseih.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Session() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		Enumeration<String> attributeNames = httpSession.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String string = (String) attributeNames.nextElement();
			System.out.println(string + httpSession.getAttribute(string));
		}
		httpSession.setMaxInactiveInterval(1200);
		System.out.println(httpSession.getMaxInactiveInterval());
		httpSession.setAttribute("First ", "Second");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
