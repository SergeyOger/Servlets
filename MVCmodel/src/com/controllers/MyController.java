package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Student;
import com.model.MyModelClass;

@WebServlet("/MyController")
public class MyController extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = -5020588648139103245L;
    MyModelClass modelClass = new MyModelClass();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student student = modelClass.getStudent();
	req.setAttribute("Student", student);
//	req.getSession().setAttribute("Student", student);
//	req.getServletContext().setAttribute("Student", student);
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/MyView.jsp");
	requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student student = new Student();
	student.setName(req.getParameter("name"));
	student.setAge(Integer.valueOf(req.getParameter("age")));
	req.setAttribute("student", student);
	RequestDispatcher dispatcher = req.getRequestDispatcher("/userpage.jsp");
	dispatcher.forward(req, resp);

    }

}
