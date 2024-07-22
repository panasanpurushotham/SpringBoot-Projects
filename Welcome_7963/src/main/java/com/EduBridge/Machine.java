package com.EduBridge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages= {"myPack"})
public class Machine {
	@Lazy
	@Bean("First")
	public Cutter getCutter() {
		System.out.println("-----I am from first bean---");
		return new Cutter();
		
	}
	@Lazy
	@Bean("Second")
	public Cutter getCutter1() {
		System.out.println("-----I am from second bean---");
		return new Cutter();
	}

}
