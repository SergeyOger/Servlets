package com.caseih.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GZip")
public class GZip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GZip() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getHeader("Accept-Encoding").contains("gzip")) {
			PrintWriter printWriter = new PrintWriter(new GZIPOutputStream(response.getOutputStream()));
			printWriter.write("Hello");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
