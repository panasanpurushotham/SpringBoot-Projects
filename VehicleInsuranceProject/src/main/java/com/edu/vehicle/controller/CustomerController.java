package com.edu.vehicle.controller;

import java.util.List;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vehicle.entity.Customer;
import com.edu.vehicle.error.CustomerNotFoundException;
import com.edu.vehicle.repository.CustomerRepository;
import com.edu.vehicle.repository.VehicleRepository;
import com.edu.vehicle.service.CustomerService;
import com.edu.vehicle.service.VehicleService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
@Autowired
private  CustomerService  customerService;

@Autowired
private VehicleService vehicleService;

@Autowired
private VehicleRepository vehicleRepository;
@Autowired
private CustomerRepository customerRepository;

//Insert RecordcustomerService

/*@PostMapping("/customer") // http://localhost:8889/customer
public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {
	System.out.println("Inside customer addCustomer");
	Customer cob=customerService.addCustomer(customer);
 return new ResponseEntity<Customer>(cob, HttpStatus.CREATED);
}*/
@PostMapping("/customer")
public String addCustomer(@RequestBody Customer customer) {
	customerService.addCustomer(customer);
	return "Hi!" +customer.getCustomerName()+" Registeration Successfully Completed";
}
//getCustomerById

@GetMapping("/customer/{customerId}")
public List<Customer> getCustomerById(@PathVariable("customerId") Long customerId) throws CustomerNotFoundException {
	return customerService.getCustomerById(customerId);
}
//update
@PutMapping("/update/{customerId}")
public Customer updateCustomerById(@PathVariable("customerId") Long customerId,@RequestBody Customer customer) throws CustomerNotFoundException {
	
	return customerService.updateCustomerById(customerId,customer);
	
}
//delete 

@DeleteMapping("/customer/{customerId}")
public String deleteCustomerById(@PathVariable("customerId") Long customerId) throws CustomerNotFoundException {
	customerService.deleteCustomerById(customerId);
	return "customer Deleted";
}
//findAllCustomers
@GetMapping("/customers")
public List<Customer> findAllCustomer(){
	return customerService.findAllCustomer();
}
//assign customer to vehicle
@ResponseBody
@PutMapping("/customerAssignVehicle/{customerId}/vehicle/{insuranceId}")
public Customer customerAssignVehicle(@PathVariable Long customerId, @PathVariable Long insuranceId) {
	  System.out.println("insuranceId customerAssignVehicle");
	return customerService.customerAssignVehicle(customerId,insuranceId);

}
}
