package com.edu.vehicle.service;

import java.util.List;

import com.edu.vehicle.entity.Vehicle;
import com.edu.vehicle.error.VehicleNotFoundException;



public interface VehicleService {

	public void saveVehicle(Vehicle vehicle);

	public List<Vehicle> getVehicleById(Long insuranceId) throws VehicleNotFoundException;

	public void vehicleDeleteById(Long insuranceId) throws VehicleNotFoundException;

	public Vehicle vehicleUpdateById(Long insuranceId, Vehicle vehicle) throws VehicleNotFoundException;

	public List<Vehicle> getAllVehicles();
	


}