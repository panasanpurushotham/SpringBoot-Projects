package com.edubridge.app1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer01")
public class Customer {
	@Id
	@GeneratedValue
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private Long customerMobile;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "addressId")
	private Address customerAddress;
	
	
	

}
