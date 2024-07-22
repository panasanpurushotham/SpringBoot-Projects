package com.EduBridge;

import org.springframework.stereotype.Component;

@Component
public class Area {
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void area() {
		double a= 3.14*radius*radius;
		System.out.println("Area of circle is "+a);
	}
	
	}


