package com.caseih.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headers")
public class Headers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Headers() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String value = headerNames.nextElement();
			System.out.println(value + " = " + request.getHeader(value));
		}
		
		System.out.println(request.getAuthType());
		System.out.println(request.getMethod());
		System.out.println(request.getProtocol());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
