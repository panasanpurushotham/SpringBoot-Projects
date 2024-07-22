package com.edubridge.springapp2.beans;

public class IPhone implements Mobile{
	private String modelNo;
	private String color;
	private Double price;
	
	public IPhone() {
		System.out.println("IPhone Object is created");
	}
	
	public IPhone(String modelNo, String color, Double price) {
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public void call() {
		System.out.println("Calling using IPhone");
	}

	@Override
	public String toString() {
		return "IPhone [modelNo=" + modelNo + ", color=" + color + ", price=" + price + "]";
	}
}
