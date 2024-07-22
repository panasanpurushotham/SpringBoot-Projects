package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int id;
	String name;
	int batchcode;
	String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", batchcode=" + batchcode + ", gender=" + gender + "]";
	}


	public Student(int id, String name, int batchcode, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.batchcode = batchcode;
		this.gender = gender;
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
	
	

}
