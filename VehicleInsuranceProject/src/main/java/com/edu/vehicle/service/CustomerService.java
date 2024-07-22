package com.edu.vehicle.service;

import java.util.List;

import com.edu.vehicle.entity.Customer;
import com.edu.vehicle.error.CustomerNotFoundException;



public interface CustomerService {

public Customer addCustomer(Customer customer);

public List<Customer> getCustomerById(Long customerId) throws CustomerNotFoundException;

public Customer updateCustomerById(Long customerId,Customer customer) throws CustomerNotFoundException;

public void deleteCustomerById(Long customerId) throws CustomerNotFoundException;
public Customer customerAssignVehicle(Long CustomerId, Long insuranceId);

public List<Customer> findAllCustomer();


}
