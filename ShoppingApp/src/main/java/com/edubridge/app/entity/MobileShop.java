package com.edubridge.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MobileShop {
	@Id
	@GeneratedValue
	private Integer id;
	private String brand;
	private String model;
	private Integer price;
	private String processor;
	
	
	
	@Override
	public String toString() {
		return "MobileShop [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", processor="
				+ processor + "]";
	}
	public MobileShop(Integer id, String brand, String model, Integer price, String processor) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.processor = processor;
	}
	public MobileShop() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	
	
	

}
