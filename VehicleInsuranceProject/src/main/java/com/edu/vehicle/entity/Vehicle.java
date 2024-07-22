package com.edu.vehicle.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.edu.vehicle.entity.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Vehicle {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long insuranceId;
@Column(unique=true)
private String vehicleNo;
private String vehicleColour;
@NotBlank(message = "Please enter name")

private String vehicleName;
private Integer vehiclePrice;
private Date insuranceStartDate;
private Date insuranceEndDate;
@JsonIgnore
public Vehicle() {
	super();
}
public Vehicle(Long insuranceId, String vehicleNo, String vehicleColour, String vehicleName, Integer vehiclePrice,
		Date insuranceStartDate, Date insuranceEndDate) {
	super();
	this.insuranceId = insuranceId;
	this.vehicleNo = vehicleNo;
	this.vehicleColour = vehicleColour;
	this.vehicleName = vehicleName;
	this.vehiclePrice = vehiclePrice;
	this.insuranceStartDate = insuranceStartDate;
	this.insuranceEndDate = insuranceEndDate;
}
public Long getInsuranceId() {
	return insuranceId;
}
public void setInsuranceId(Long insuranceId) {
	this.insuranceId = insuranceId;
}
public String getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getVehicleColour() {
	return vehicleColour;
}
public void setVehicleColour(String vehicleColour) {
	this.vehicleColour = vehicleColour;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public Integer getVehiclePrice() {
	return vehiclePrice;
}
public void setVehiclePrice(Integer vehiclePrice) {
	this.vehiclePrice = vehiclePrice;
}
public Date getInsuranceStartDate() {
	return insuranceStartDate;
}
public void setInsuranceStartDate(Date insuranceStartDate) {
	this.insuranceStartDate = insuranceStartDate;
}
public Date getInsuranceEndDate() {
	return insuranceEndDate;
}
public void setInsuranceEndDate(Date insuranceEndDate) {
	this.insuranceEndDate = insuranceEndDate;
}
@Override
public String toString() {
	return "Vehicle [insuranceId=" + insuranceId + ", vehicleNo=" + vehicleNo + ", vehicleColour=" + vehicleColour
			+ ", vehicleName=" + vehicleName + ", vehiclePrice=" + vehiclePrice + ", insuranceStartDate="
			+ insuranceStartDate + ", insuranceEndDate=" + insuranceEndDate + "]";
}

}
