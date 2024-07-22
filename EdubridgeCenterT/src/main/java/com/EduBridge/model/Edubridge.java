package com.EduBridge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Edubridge {
	@Id
	int id;
	String name;
	int batchcode;
	String gender;
	
	public Edubridge() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatchcode() {
		return batchcode;
	}
	public void setBatchcode(int batchcode) {
		this.batchcode = batchcode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Edubridge(int id, String name, int batchcode, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.batchcode = batchcode;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Edubridge [id=" + id + ", name=" + name + ", batchcode=" + batchcode + ", gender=" + gender + "]";
	}
	

}
