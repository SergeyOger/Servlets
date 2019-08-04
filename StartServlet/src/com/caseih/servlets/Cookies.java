package com.caseih.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cookies() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie1 = new Cookie("testCookies", "testCookies");
		cookie1.setMaxAge(5);
		cookie1.setPath("/test.html"); //access for cookie only with this page
		response.addCookie(cookie1);
		
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getVersion());
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
