package com.edubridge.springapp1.beans;

public class SamsungMobile implements Mobile {
	private String modelNo;
	private String color;
	private Double price;

	public SamsungMobile() {
		System.out.println("Samsung Object is created");
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public void call() {
		System.out.println("Calling using SamsungMobile");
	}

	@Override
	public String toString() {
		return "SamsungMobile [modelNo=" + modelNo + ", color=" + color + ", price=" + price + "]";
	}
}
