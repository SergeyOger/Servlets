package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Student;

@WebServlet("/student")
public class TempContriller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student student = new Student("Test", 25);
	req.setAttribute("student", student);
	List<String> strings = new ArrayList<String>();
	strings.add("one");
	strings.add("two");
	strings.add("three");
	Map<String, String> map = new HashMap<String, String>();
	map.put("one", "1");
	map.put("two", "2");
	req.setAttribute("map", map);
	
	
	req.setAttribute("string", strings);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/studentpage.jsp");
	dispatcher.forward(req, resp);
    }

}
