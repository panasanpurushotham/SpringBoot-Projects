package com.edubridge.springapp2.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int studentId;
	private String studentName;
	
	//@Autowired
	private Course studentCourse;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(Course studentCourse) {
		this.studentCourse = studentCourse;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ "]";
	}
}
