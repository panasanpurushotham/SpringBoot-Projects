package com.edu.vehicle.controller;

import java.util.List;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vehicle.controller.VehicleController;
import com.edu.vehicle.entity.Vehicle;
import com.edu.vehicle.error.VehicleNotFoundException;
import com.edu.vehicle.service.VehicleService;


@RestController //
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {
	//Inject an object of VehicleService
	@Autowired
	private VehicleService vehicleService;
	private final Logger LOGGER= LoggerFactory.getLogger(VehicleController.class);
	
	//save the record
	                              //post
	/*@PostMapping("/vehicles")  //http://localhost:portno/vehicles
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		LOGGER.info("Inside saveDept");
		return vehicleService.saveVehicle(vehicle);
	}*/
	@PostMapping("/vehicle")
	public String saveVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "" +vehicle.getVehicleName()+" Registeration Successfully Completed";
	}
	
	//get  records by id
	
		@GetMapping("/vehicles/{insuranceId}") //http://localhost:8889/vehicles/1
		public List<Vehicle> getVehicleById(@PathVariable("insuranceId") Long insuranceId) throws VehicleNotFoundException {
			
   return vehicleService.getVehicleById(insuranceId);
		}
		
		//delete
		@DeleteMapping("/vehicles/{insuranceId}")
		public String vehicleDeleteById(@PathVariable("insuranceId") Long insuranceId) throws VehicleNotFoundException {
			vehicleService.vehicleDeleteById(insuranceId);
			return "Vehicle is deleted";
		}
		
		
		//update 
		@PutMapping("/vehicles/{insuranceId}")
		public Vehicle vehicleUpdateById(@PathVariable("insuranceId") Long insuranceId,@RequestBody Vehicle vehicle) throws VehicleNotFoundException {
			
			return vehicleService.vehicleUpdateById(insuranceId,vehicle);
		}
		//get all vehicles
		@GetMapping("/getAllVehicles")
		public List<Vehicle> getAllVehicles(){
			return vehicleService.getAllVehicles();
			
		}
}
	
	
