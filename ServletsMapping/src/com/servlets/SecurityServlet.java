package com.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestparameters")
public class SecurityServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration<String> attributeNames = req.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String string = (String) attributeNames.nextElement();
			System.out.println("Name " + string + " Value " + req.getAttribute(string));
		}

		System.out.println("Encoding " + req.getCharacterEncoding());
		System.out.println("Local address " + req.getLocalAddr());
		System.out.println("Local name " + req.getLocalName());
		System.out.println("Local port " + req.getLocalPort());
		System.out.println("Method " + req.getMethod());
		System.out.println("Path info " + req.getPathInfo());
		System.out.println("Protocol " + req.getProtocol());
		System.out.println("Query string " + req.getQueryString());
		System.out.println("Remote address" + req.getRemoteAddr());
		System.out.println("Remote host " + req.getRemoteHost());
		System.out.println("Remote port " + req.getRemotePort());
		System.out.println("Remote user " + req.getRemoteUser());
		System.out.println("Session id" + req.getRequestedSessionId());
		System.out.println("Request URL " + req.getRequestURI());
		System.out.println("Scheme " + req.getScheme());
		System.out.println("Server name " + req.getServerName());
		System.out.println("Server port " + req.getServerPort());
		System.out.println("Servlet path " + req.getServletPath());
		System.out.println("Servlet context " + req.getServletContext());
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			Arrays.asList(cookies).forEach(x -> System.out.println("Coocies name " + x.getName() + " Domain "
					+ x.getDomain() + " Value " + x.getValue() + " Version " + x.getVersion()));
		} else {
			System.out.println("Cookies is empty");
		}
		System.out.println("Locate " + req.getLocale());
		System.out.println("User principal " + req.getUserPrincipal());
	}

}
