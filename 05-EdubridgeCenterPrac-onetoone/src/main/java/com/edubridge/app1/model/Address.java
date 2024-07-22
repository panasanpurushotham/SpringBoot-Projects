package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Address01")
public class Address {
	@Id
	@GeneratedValue
	private Integer id;
	private String city;
	private String state;
	private String country;
	
	

}
