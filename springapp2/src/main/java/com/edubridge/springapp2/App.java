package com.edubridge.springapp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.springapp2.beans.IPhone;
import com.edubridge.springapp2.beans.SamsungMobile;
import com.edubridge.springapp2.beans.Student;
import com.edubridge.springapp2.cfgs.AppConfig;

public class App {
    public static void main( String[] args )    {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	   	
        IPhone iphone = ctx.getBean(IPhone.class);
        iphone.call();
        System.out.println(iphone);
        
        SamsungMobile sm =  ctx.getBean(SamsungMobile.class);
        sm.call();
        System.out.println(sm);
        
		
		Student s = ctx.getBean("student2",Student.class);
		System.out.println(s.getStudentId()); 
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentCourse());	
		
		
		IPhone iphone1 = ctx.getBean(IPhone.class);
		IPhone iphone2 = ctx.getBean(IPhone.class);
		System.out.println(iphone1.hashCode());
		System.out.println(iphone2.hashCode());
		System.out.println(iphone1 == iphone2);
		
        SamsungMobile sm1 =  ctx.getBean(SamsungMobile.class);
        SamsungMobile sm2 =  ctx.getBean(SamsungMobile.class);
        System.out.println(sm1.hashCode());
        System.out.println(sm2.hashCode());
        System.out.println(sm1 == sm2);

    }
}
