package com.edubridge.springapp2.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.edubridge.springapp2.beans.Course;
import com.edubridge.springapp2.beans.IPhone;
import com.edubridge.springapp2.beans.SamsungMobile;
import com.edubridge.springapp2.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	@Scope("singleton")
	public IPhone getIphone() {
		return new IPhone("M1234", "Black", 65000.00);
	}
	
	@Bean
	@Scope("prototype")
	public SamsungMobile getSamsungMobile() {
		SamsungMobile sm = new SamsungMobile();
		sm.setModelNo("M10101");
		sm.setColor("Silver");
		sm.setPrice(45000.00);
		return sm;
	}
	
	@Bean
	public Course getCourse() {
		Course c = new Course();
		c.setCourseId(11);
		c.setCourseName("JFS");
		c.setCourseDuration(200);
		return c;
	}
	
	@Bean(name = "student1")
	public Student getStudent1() {
		Student s = new Student();
		s.setStudentId(111);
		s.setStudentName("Wills");
		s.setStudentCourse(getCourse());
		return s;
	}
	
	@Bean(name = "student2")
	public Student getStudent2() {
		Student s = new Student();
		s.setStudentId(222);
		s.setStudentName("Smith");
		s.setStudentCourse(getCourse());
		return s;
	}
	
}
