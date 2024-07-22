package com.edubridge.springapp1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.springapp1.beans.IPhone;
import com.edubridge.springapp1.beans.SamsungMobile;

public class App2 
{
    public static void main( String[] args )
    {
    	String springConfigFile = "/com/edubridge/springapp1/cfgs/applicationContext.xml";
    	
    	BeanFactory ctx = new ClassPathXmlApplicationContext(springConfigFile);
    	   	
        IPhone iphone = ctx.getBean("iphone", IPhone.class);
        iphone.call();
        
        SamsungMobile sm = (SamsungMobile) ctx.getBean("samsungMobile");
        sm.call();
    }
}
