package com.edu.vehicle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.websocket.DeploymentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.edu.vehicle.entity.Customer;
import com.edu.vehicle.entity.Vehicle;
import com.edu.vehicle.error.VehicleNotFoundException;
import com.edu.vehicle.repository.CustomerRepository;
import com.edu.vehicle.repository.VehicleRepository;
@Service
public class VehicleServiceImp implements VehicleService {

	@Autowired
	private VehicleRepository VehicleRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void saveVehicle(Vehicle vehicle) {
		
		 VehicleRepository.save(vehicle);
	}
	@Override
	public List<Vehicle> getVehicleById(Long insuranceId) throws VehicleNotFoundException  {
		
		Optional<Vehicle> vle=VehicleRepository.findById(insuranceId) ;
		
		 if(!vle.isPresent()) {
			 throw new VehicleNotFoundException("Vehicle Not Found");
		 }
		 Vehicle vl=VehicleRepository.findById(insuranceId).get();
		 List<Vehicle>l=new ArrayList<>();
		 l.add(vl);
		 return l;
		// return VehicleRepository.findById(insuranceId).get();
	}
	/*
	 
		
		List <Customer>l=new ArrayList<>();
		l.add(cst);
		return l;
	}

	 */
	@Override
	public void vehicleDeleteById(Long insuranceId) throws VehicleNotFoundException  {
	
		Optional<Vehicle> vle=VehicleRepository.findById(insuranceId) ;
		if(!vle.isPresent()) {
			 throw new VehicleNotFoundException("Vehicle Not Found");
		 }
		VehicleRepository.deleteById(insuranceId);
		
	}
	@Override
	public Vehicle vehicleUpdateById(Long insuranceId, Vehicle vehicle) throws VehicleNotFoundException {
		
		Optional<Vehicle> vle=VehicleRepository.findById(insuranceId) ;
		Vehicle vleDB;
		if(!vle.isPresent()) {
			 throw new VehicleNotFoundException("Vehicle Not Found");
		 }
		
		 else{
		        vleDB=VehicleRepository.findById(insuranceId).get();
				
				if(Objects.nonNull(vehicle.getVehicleName()) &&
				!"".equalsIgnoreCase(vehicle.getVehicleName())) {
					vleDB.setVehicleName(vehicle.getVehicleName());
				}
				
				if(Objects.nonNull(vehicle.getVehiclePrice())) {
							vleDB.setVehiclePrice(vehicle.getVehiclePrice());
						}
					}
		if(Objects.nonNull(vehicle.getVehicleNo()) &&
				!"".equalsIgnoreCase(vehicle.getVehicleNo())) {
					vleDB.setVehicleNo(vehicle.getVehicleNo());
				}
		if(Objects.nonNull(vehicle.getVehicleColour()) &&
				!"".equalsIgnoreCase(vehicle.getVehicleColour())) {
					vleDB.setVehicleColour(vehicle.getVehicleColour());
				}
		if(Objects.nonNull(vehicle.getInsuranceStartDate())) {
				
					vleDB.setInsuranceStartDate(vehicle.getInsuranceStartDate());
				}
		if(Objects.nonNull(vehicle.getInsuranceEndDate())) {
			
			vleDB.setInsuranceEndDate(vehicle.getInsuranceEndDate());
		}

	
				return VehicleRepository.save(vleDB);
				
	}
	@Override
	public List<Vehicle> getAllVehicles() {
		
		return VehicleRepository.findAll();
	}
}
