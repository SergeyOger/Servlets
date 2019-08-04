package com.servlets;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8317876389078101305L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write(getInitParameter("userName"));

		Enumeration<String> initParameterNames = getInitParameterNames();
		while (initParameterNames.hasMoreElements()) {
			String string = (String) initParameterNames.nextElement();
			System.out.println("Init param name " + string + " Value " + getInitParameter(string));
		}

	}

}
