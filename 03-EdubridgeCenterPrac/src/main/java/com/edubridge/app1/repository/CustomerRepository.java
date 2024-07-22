package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.model.Customer;

@RepositoryRestResource(path = "customer_details", collectionResourceRel = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
