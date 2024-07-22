package com.edubridge.springapp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.springapp1.beans.IPhone;
import com.edubridge.springapp1.beans.SamsungMobile;
import com.edubridge.springapp1.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String springConfigFile = "/com/edubridge/springapp1/cfgs/applicationContext.xml";
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(springConfigFile);
    	   	
        IPhone iphone = ctx.getBean("iphone", IPhone.class);
        iphone.call();
        System.out.println(iphone);
        
        SamsungMobile sm = (SamsungMobile) ctx.getBean("samsungMobile");
        sm.call();
        System.out.println(sm);
        
        Student s = ctx.getBean("student", Student.class);
        System.out.println(s.getStudentId());
        System.out.println(s.getStudentName());
        System.out.println(s.getStudentCourse());
    }
}
