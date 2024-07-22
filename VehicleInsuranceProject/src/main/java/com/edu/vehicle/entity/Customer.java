package com.edu.vehicle.entity;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.edu.vehicle.entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long customerId;
	@NotBlank(message = "Please enter name")
	
	private String customerName;
	@Column(unique=true)
	private Long customerAdharno;
	@Column(unique=true)
	private String customerPanno;
	@Column(unique=true)
	private Long customerPhone;
	@Column(unique=true)
	private String customerDrivinglisenceno;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="insurance_Id",referencedColumnName="insuranceId")
	@JsonIgnore
	private Vehicle vle;
	public Vehicle getVehicle() {
		return vle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vle=vehicle;
	}

	public Customer() {
		super();
	}

	public Customer(Long customerId,
			@NotBlank(message = "Please enter name") @Size(min = 4, message = "Name should be atleast 4 characters") @Size(max = 10, message = "Name should not be greater than 10 characters") String customerName,
			Long customerAdharno, String customerPanno, Long customerPhone, String customerDrivinglisenceno) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAdharno = customerAdharno;
		this.customerPanno = customerPanno;
		this.customerPhone = customerPhone;
		this.customerDrivinglisenceno = customerDrivinglisenceno;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerAdharno() {
		return customerAdharno;
	}

	public void setCustomerAdharno(Long customerAdharno) {
		this.customerAdharno = customerAdharno;
	}

	public String getCustomerPanno() {
		return customerPanno;
	}

	public void setCustomerPanno(String customerPanno) {
		this.customerPanno = customerPanno;
	}

	public Long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerDrivinglisenceno() {
		return customerDrivinglisenceno;
	}

	public void setCustomerDrivinglisenceno(String customerDrivinglisenceno) {
		this.customerDrivinglisenceno = customerDrivinglisenceno;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAdharno="
				+ customerAdharno + ", customerPanno=" + customerPanno + ", customerPhone=" + customerPhone
				+ ", customerDrivinglisenceno=" + customerDrivinglisenceno + "]";
	}
	public void customerAssignVehicle(Vehicle vehicle) {
		this.vle=vehicle;
		
	}
}