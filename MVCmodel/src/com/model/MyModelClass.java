package com.model;

import com.beans.Student;

public class MyModelClass {
    public Student getStudent() {
	Student student = new Student();
	student.setName("Test student");
	student.setAge(22);
	return student;
    }

}
