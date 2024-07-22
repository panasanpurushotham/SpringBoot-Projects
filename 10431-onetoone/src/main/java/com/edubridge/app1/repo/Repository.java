package com.edubridge.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.entity.Customer;

@RepositoryRestResource(path = "customer", collectionResourceRel = "customer")
public interface Repository extends JpaRepository<Customer, Integer> {

}
