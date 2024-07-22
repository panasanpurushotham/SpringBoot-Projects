package com.edu.vehicle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.vehicle.entity.Customer;
import com.edu.vehicle.entity.Vehicle;
import com.edu.vehicle.error.CustomerNotFoundException;
import com.edu.vehicle.repository.CustomerRepository;
import com.edu.vehicle.repository.VehicleRepository;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
	private CustomerRepository customerRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
	@Override
	public List<Customer> getCustomerById(Long customerId) throws CustomerNotFoundException  {
		
		Optional<Customer> cus=customerRepository.findById(customerId);
		if(!cus.isPresent()) {
			throw new CustomerNotFoundException("Customer Not Found");
		}
		Customer cst=customerRepository.findById(customerId).get();
		
		List <Customer>l=new ArrayList<>();
		l.add(cst);
		return l;
	}

	@Override
	public Customer updateCustomerById(Long customerId, Customer customer) throws CustomerNotFoundException {
		//get the record from the table
		
		Optional<Customer> vle=customerRepository.findById(customerId) ;
		Customer vleDB=null;
		if(!vle.isPresent()) {
			 throw new CustomerNotFoundException("Customer Not Found");
		}
		
	 else{
			vleDB =customerRepository.findById(customerId).get();
				
				if(Objects.nonNull(customer.getCustomerName()) &&
				!"".equalsIgnoreCase(customer.getCustomerName())) {
					vleDB.setCustomerName(customer.getCustomerName());
				}
				if(Objects.nonNull(customer.getCustomerAdharno()) ) {
					vleDB.setCustomerAdharno(customer.getCustomerAdharno());
				}
				
				if(Objects.nonNull(customer.getCustomerPanno()) &&
						!"".equalsIgnoreCase(customer.getCustomerPanno())) {
							vleDB.setCustomerPanno(customer.getCustomerPanno());
						}
				if(Objects.nonNull(customer.getCustomerPhone())) {
					vleDB.setCustomerPhone(customer.getCustomerPhone());
				}
				
				if(Objects.nonNull(customer.getCustomerDrivinglisenceno()) &&
				!"".equalsIgnoreCase(customer.getCustomerDrivinglisenceno())) {
					vleDB.setCustomerDrivinglisenceno(customer.getCustomerDrivinglisenceno());
				}
				
			}//else
		return customerRepository.save(vleDB);
}
	
	@Override
	public void deleteCustomerById(Long customerId) throws CustomerNotFoundException {
Optional<Customer> cus=customerRepository.findById(customerId);
		
		if(!cus.isPresent()) {
			throw new CustomerNotFoundException("Customer Id Not present");
		}
		customerRepository.deleteById(customerId);
		}
	
	
	@Override
	public Customer customerAssignVehicle(Long CustomerId, Long insuranceId) {
		Vehicle vehicle=vehicleRepository.findById(insuranceId).get();
		Customer customer=customerRepository.findById(CustomerId).get();
		customer.customerAssignVehicle(vehicle);
		return customerRepository.save(customer);
	}
	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	
}
